package com.Learning.proxy;

import org.apache.catalina.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createProxy(UserService userService) {
        /*
        public static Object newProxyInstance(ClassLoader loader,
                Class<?>[] interfaces,
                InvocationHandler h)
                参数1：用于指定一个类加载器
                参数2：指定生成的代理长什么样子，也就是有哪些方法
                参数3：用来指定生成的代理对象要干什么事情
         */
        //star
        //回调方法
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{UserService.class},
                (proxy, method, args) -> {
                    //代理对象要做的事情，会在这里写代码
                    String methodName = method.getName();
                    if (methodName.equals("login") || methodName.equals("deleteUser") || methodName.equals("selectUsers")) {
                       long startTime = System.currentTimeMillis();

                       Object rs = method.invoke(userService, args);

                       long endTime = System.currentTimeMillis();
                        System.out.println(methodName + "方法执行耗时: " + (endTime - startTime) / 1000 + "s");
                        return rs;
                    }
                    return method.invoke(userService, args);
                });
        return userServiceProxy;

    }
}
