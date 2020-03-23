package com.qxf.pojo;


import javax.validation.constraints.*;

/**
 * @Auther: qiuxinfa
 * @Date: 2020/3/23
 * @Description: com.qxf.pojo
 */
public class User {
    @NotNull(message = "id不能为空")
    private String id;
    @Size(min = 2,max = 5,message = "用户名长度为2-5个字符")
    private String username;
    @Pattern(regexp = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[a-zA-Z0-9]{8,15}",message = "密码必须同时拥有字母和数字")
    private String password;
    @Max(value = 150,message = "年龄最大为150岁")
    private Integer age;

    private String sex;
    @Email
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
