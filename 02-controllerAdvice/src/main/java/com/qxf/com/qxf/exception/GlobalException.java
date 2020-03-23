package com.qxf.com.qxf.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/23
 * @Description: com.qxf.com.qxf.exception
 */

/**
 * @RestControllerAdvice = @ControllerAdvice + @ResponseBody
 * 要想使用@ControllerAdvice进行全局异常处理，需要使当前配置的类被spring管理，否则无法捕获异常
 *
 */

//@ControllerAdvice
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
//    @ResponseBody
    public String handleException(Exception e){
        System.out.println("异常信息： "+e.getMessage());
        return "异常信息： "+e.getMessage();
    }
}
