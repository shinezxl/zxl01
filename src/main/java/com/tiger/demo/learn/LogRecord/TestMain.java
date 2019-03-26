package com.tiger.demo.learn.LogRecord;

import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TestMain {
    /**
     * 业务场景
     * 门店有门店主表、门店财务信息表、门店工商信息表、门店无卡产品信息表。运营人员修改门店信息操作都要记录修改操作
     * @param args
     */
    public static void main(String[] args) {

        //新增
        StoreModel originalModel = new StoreModel();
        originalModel.setCreaterTime(new Date());
        originalModel.setStoreCode("zxl");
        originalModel.setStoreName("张三的门店");
        originalModel.setStoreLevel(3);
        originalModel.setPrice(BigDecimal.valueOf(0));

        StoreModel newModel = new StoreModel();
        newModel.setCreaterTime(new Date());
        newModel.setUpdateTime(new Date());
        newModel.setStoreCode("zxl");
        newModel.setStoreName("张三的门店改");
        newModel.setStoreLevel(1);
        newModel.setPrice(BigDecimal.valueOf(0));

       /* OperateUtil operateUtil = new OperateUtil();
        operateUtil.recordOperationInfo(newModel,originalModel,"操作人：李四","操作类型：门店基本信息修改");*/

        List<String> list = OperateUtil.objectToJsonstrTwo(originalModel, newModel);
        System.out.println(list);

        test1();
    }

    public static void test1(){

        String newStr = "{\"creditLimit\":30000,\"nStoreSavedDeposit\":0}";
        String oldStr = "{\"creditLimit\":30000,\"nStoreSavedDeposit\":0}";

        JSONObject oldObject = JSONObject.fromObject(oldStr);
        JSONObject newObject = JSONObject.fromObject(newStr);

        List<String> list = OperateUtil.objectToJsonstrTwo(oldObject, newObject);
        System.out.println(11);


    }
}
