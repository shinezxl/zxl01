package com.tiger.demo.learn.designmodel.proxy;

public class PayServiceImpl implements PayService{


    @Override
    public void pay() {
        System.out.println("支付金额");
    }

    @Override
    public void pay1(String monery) {
        System.out.println("支付金额"+monery);
    }
}
