package com.sf.lottery.controller;

import com.sf.lottery.utils.JsonResult;
import com.sf.lottery.utils.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.beans.PropertyEditorSupport;
import java.nio.file.AccessDeniedException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestControllerAdvice
public class ControllerHandler {
    private static final DateTimeFormatter LOCAL_DATE_TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter LOCAL_DATE = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @InitBinder
    protected void initBinder(ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                this.setValue(LocalDate.parse(text, LOCAL_DATE));
            }
        });
        binder.registerCustomEditor(LocalDateTime.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                this.setValue(LocalDateTime.parse(text, LOCAL_DATE_TIME));
            }
        });
        System.out.println("initBinder");

    }

    @ExceptionHandler({ServletRequestBindingException.class})
    public JsonResult handleServletRequestBindingExceptionException(Exception e) {
        log.info("",e);
        return new JsonResult(ResultCode.SYS_ERROR);
    }

    @ExceptionHandler({Exception.class})
    public JsonResult handleException(Exception e) {
        if (e instanceof BindException) {
            BindException exc = (BindException) e;
            String errMsg = exc.getBindingResult().getFieldError().getDefaultMessage();
            return new JsonResult(ResultCode.EXCEPTION, errMsg);
        } else if (e instanceof IllegalStateException) {
            return new JsonResult(ResultCode.PARAMS_ERROR);
        } else if (e instanceof AccessDeniedException) {
            return new JsonResult(ResultCode.NO_PERMISSION);
        } else {
            log.error("", e);
            return new JsonResult(ResultCode.SYS_ERROR);
        }
    }
}
