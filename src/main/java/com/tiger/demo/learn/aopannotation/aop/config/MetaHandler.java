package com.tiger.demo.learn.aopannotation.aop.config;


public class MetaHandler  {

   /* @Override
    public void insertFill(MetaObject metaObject) {
        *//*Object lastUpdateNameId = metaObject.getValue("lastUpdateNameId");
        Object lastUpdateTime = metaObject.getValue("lastUpdateTime");
        //获取当前登录用户
        SysUser user = (SysUser)SecurityUtils.getSubject().getPrincipal();
        if (null == lastUpdateNameId) {
            metaObject.setValue("lastUpdateNameId", user.getId());
        }
        if (null == lastUpdateTime) {
            metaObject.setValue("lastUpdateTime", new Date());
        }*//*
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }*/
}
