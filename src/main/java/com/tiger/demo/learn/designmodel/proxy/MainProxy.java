package com.tiger.demo.learn.designmodel.proxy;

import java.lang.reflect.Proxy;

public class MainProxy {
    public static void main(String[] args) {
        test2();
    }

    //简单的代理模式
    public static void test1(){
        PayService payService = new ProxyPayServiceImpl();
        payService.pay();

    }


    /**
     * 动态代理 https://www.cnblogs.com/xiaoluo501395377/p/3383130.html
     */
    public static void test2(){
        //我们要代理的真实对象
        PayServiceImpl payServiceImpl = new PayServiceImpl();//被代理对象
        //我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(payServiceImpl);

        /**
         * loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
         * interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
         * h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
         */
        PayService payService = (PayService)Proxy.newProxyInstance(payServiceImpl.getClass().getClassLoader(),
                payServiceImpl.getClass().getInterfaces(),
                myInvocationHandler);//生成代理类
        System.out.println(payService.getClass().getName());
        payService.pay();
        payService.pay1("233");


    }

}
