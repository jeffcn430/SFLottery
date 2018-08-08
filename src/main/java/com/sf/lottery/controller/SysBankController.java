package com.sf.lottery.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.sf.lottery.entry.SysBank;
import com.sf.lottery.service.ISysBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jeff
 * @since 2018-08-07
 */
@Controller
@RequestMapping("/lottery/sysBank")
public class SysBankController {
    @Autowired
    private ISysBankService sysBankService;

    @GetMapping("")
    @ResponseBody
    public void dddd(SysBank bank, Page<SysBank> page) {
        sysBankService.getSysBankPage(bank, page);
    }
}
