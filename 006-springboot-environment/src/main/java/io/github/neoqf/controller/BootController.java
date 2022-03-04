package io.github.neoqf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {

    @RequestMapping("/hello")
    @ResponseBody   // 不使用视图，让doSome的返回值作为数据给浏览器——可加上@ResponseBody注解
    public String doSome() {
        return "hello SpringBoot应用，设置了端口8082";
    }
}
