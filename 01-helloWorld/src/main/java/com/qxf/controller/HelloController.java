package com.qxf.controller;

import com.qxf.pojo.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/21
 * @Description: com.qxf.controller
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello Spring MVC";
    }

    // 下面是测试参数接收

    @GetMapping("/test01")
    public String testSimple(@RequestParam(value = "username",required = false) String username,
                             Integer age, Person per, HttpServletRequest request){
        String username1 = request.getParameter("username");
        System.out.println("进入test01");
        System.out.println("封装成per： "+per);
        return "testSimple : username = "+username+" , age = "+age;
    }

    @GetMapping("/test02")
    public String testMap(@RequestParam Map<String,Object> map){
        return "testMap : "+map;
    }

    @GetMapping("/test03")
    public String testRequestParam(@RequestParam("username") String name){
        return "testRequestParam : name = "+name;
    }

    @GetMapping("/test04/{id}")
    public String testPathVariable(@PathVariable("id") String id){
        return "PathVariable : id = "+id;
    }

    @GetMapping("/test05")
    public String testPojo(Person person){
        return "testPojo : "+person;
    }

    @GetMapping("/test06")
    public String testHeader(@RequestHeader("User-Agent") String userAgent){
        return "testHeader : userAgent = "+userAgent;
    }

}
