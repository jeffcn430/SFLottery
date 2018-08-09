package com.sf.lottery.controller;

import com.sf.lottery.entry.Member;
import com.sf.lottery.utils.JsonResult;
import com.sf.lottery.utils.ResultCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 会员控制类
 *
 * @autohor:jeff
 * @description:
 * @date created in 3:56 2018/8/8
 * @MODIFICD by
 */
@RestController
@RequestMapping("/user/member")
public class MemberController {

    @RequestMapping("login")
    public JsonResult login(HttpSession session) {
        Member member = new Member();
        member.setId(99999999);
        session.setAttribute("memberId", member.getId());
        return new JsonResult(ResultCode.SUCCESS);
    }

    @RequestMapping("logout")
    public JsonResult logout(HttpSession session){
        session.removeAttribute("memberId");
        return new JsonResult(ResultCode.SUCCESS);
    }
}
