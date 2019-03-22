package com.tiger.designmodel.proxy;

import net.sf.json.JSONArray;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private PayService payService;

    /**　
     * @param proxy 指代我们所代理的那个真实对象
     * @param method 指代的是我们所要调用真实对象的某个方法的Method对象
     * @param args 指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before pay");
        System.out.println("Method:" + method);
        if (args!=null){
            System.out.println("args:"+ JSONArray.fromObject(args));
        }
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(payService, args);

        //在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after pay");

        return null;
    }

    public MyInvocationHandler(PayService payService) {
        this.payService = payService;
    }

    public MyInvocationHandler() {
    }
}
