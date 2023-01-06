package com.Learning.proxy;

public class proxyTest {
    //现在的需求是要在这三个方法上设置时间监控，每次调用输出调用的时间。如果一个个方法加就会导致入侵业务，使用代理完成。
    public static void main(String[] args) {
        UserService service = ProxyUtil.createProxy(new UserServiceImpl());
        service.login();
        service.deleteUser();
        service.selectUsers();
    }
}
