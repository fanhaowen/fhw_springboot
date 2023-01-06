package com.Learning.proxy;

public class UserServiceImpl implements UserService {
    public String login() {
        System.out.println("登录成功");
        return "登录成功";
    }
    public String deleteUser() {
        System.out.println("删除用户成功");
        return "删除用户成功";
    }
    public String selectUsers() {
        System.out.println("查询到用户成功");
        return "查询到用户成功";
    }
}
