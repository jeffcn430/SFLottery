package com.sf.lottery.controller;

import com.sf.lottery.entry.Betting;
import com.sf.lottery.utils.JsonResult;
import com.sf.lottery.utils.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.validation.Valid;
import java.time.LocalDateTime;

/**
 * 注单控制类
 *
 * @autohor:jeff
 * @description:
 * @date created in 3:56 2018/8/8
 * @MODIFICD by
 */
@Slf4j
@RestController
@RequestMapping("/lottery/betting")
public class BettingController {
    /**
     * 普通投注
     *
     * @param memberId
     * @param betting
     * @return
     */
    @RequestMapping()
    public JsonResult saveBetting(@SessionAttribute Integer memberId, @Valid Betting betting, BindingResult bindingResult) {
        if(betting.getTime() == null){
            betting.setTime(LocalDateTime.now());
            log.info("为初始化成功");
        }
        return new JsonResult(ResultCode.SUCCESS,betting);
    }
}
