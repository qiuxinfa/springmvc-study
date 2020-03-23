package com.qxf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/21
 * @Description: com.qxf.controller
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "hello Spring MVC";
    }
}
