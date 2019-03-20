package com.tiger.demo.learn.LogRecord;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperateUtil {
    /**
     *
     * @param newModel 修改后的值
     * @param originalModel 修改前的值
     * @param operatePeople 操作人员
     * @param operateType 操作类型
     */
    public void recordOperationInfo(Object newModel,Object originalModel,String operatePeople,String operateType){
        //object转字符串(处理时间格式)
        String newModelStr = objectToJsonstr(newModel);
        String originalModelStr = objectToJsonstr(originalModel);

        //数据组装
        RecordPojo recordPojo = new RecordPojo();
        recordPojo.setId(1);
        recordPojo.setNewModel(newModelStr);
        recordPojo.setOriginalModel(originalModelStr);
        recordPojo.setOperatePeople(operatePeople);
        recordPojo.setOperateType(operateType);
        recordPojo.setOperateTime(new Date());

        //数据入库
        System.out.println(recordPojo.toString());

    }

    /**
     * 对象转json字符串
     * @param object
     * @return
     */
    public String objectToJsonstr(Object object){
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        JSONObject jsonObject = JSONObject.fromObject(object,jsonConfig);
//        removeJsonParam(jsonObject,"createrTime");
        String json = jsonObject.toString();
        return json;
    }

    /**
     * 移除敏感数据
     * @param jsonObject
     * @param params
     * @return
     */
    public JSONObject removeJsonParam(JSONObject jsonObject,String... params){
        for (String param : params) {
            jsonObject.remove(param);
        }
        return jsonObject;
    }




}
