package com.qxf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/23
 * @Description: com.qxf.controller
 */
@RestController
public class ControllerAdviceTest {

    @GetMapping("/exception")
    public String testException(){
        int i = 1/0;
        return "正常返回";
    }
}
