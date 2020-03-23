package com.qxf.controller;

import com.qxf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/23
 * @Description: com.qxf.controller
 */
@Controller
@RequestMapping("user")
public class ValidatorController {

    @GetMapping("/")
    public String login(){
        return "addUser";
    }

    @PostMapping("/add")
    @ResponseBody
    public User addUser(@Validated User user, BindingResult result){
        if (result!=null){
            for (ObjectError err:result.getAllErrors()){
                System.out.println("错误信息："+err.getObjectName()+" "+err.getDefaultMessage());
            }
        }
        System.out.println("新增用户： "+user);
        return user;
    }
}
