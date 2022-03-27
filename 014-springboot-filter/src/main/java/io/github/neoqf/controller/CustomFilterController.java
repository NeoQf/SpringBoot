package io.github.neoqf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomFilterController {

    @RequestMapping("/user/account")
    @ResponseBody   // 视图页面，返回数据
    public String userAccount() {
        return "user/account";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String queryAccount() {
        return "/query";
    }
}
