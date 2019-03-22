package com.tiger.designmodel.proxy;

public class ProxyPayServiceImpl implements PayService{

    PayService service = new PayServiceImpl();
    @Override
    public void pay() {
        System.out.println("支付之前先检查库存");
        service.pay();
        System.out.println("支付之后派送订单");
    }

    @Override
    public void pay1(String monery) {
        System.out.println("支付之前先检查库存1");
        service.pay1(monery);
        System.out.println("支付之后派送订单1");
    }
}
