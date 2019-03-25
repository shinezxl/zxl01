package com.tiger.demo.learn.LogRecord;

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
        JSONObject newJsonObject = objectToJsonObj(newModel);
        JSONObject originalJsonObject = objectToJsonObj(originalModel);
        /*//去重复
        List<JSONObject> list = removeSameParam(originalJsonObject, newJsonObject);
        String newModelStr = list.get(1).toString();
        String originalModelStr = list.get(0).toString();*/
        //不去重复
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
     * 对象转json对象
     * @param object
     * @return
     */
    public JSONObject objectToJsonObj(Object object){
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
        JSONObject jsonObject = JSONObject.fromObject(object,jsonConfig);
        return jsonObject;
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

    /**
     * 对两个jsonObject去除相同字段名相同字段值的字段
     * @param oldJsonObject
     * @param newJsonObject
     * @return
     */
    public List<JSONObject> removeSameParam(JSONObject oldJsonObject,JSONObject newJsonObject){
        List<JSONObject> list = new ArrayList<>();
        JSONObject oldJsonObject1= jsonObjectCopy(oldJsonObject);
        JSONObject newJsonObject1= jsonObjectCopy(newJsonObject);
        list.add(oldJsonObject1);
        list.add(newJsonObject1);

        for (Object o : newJsonObject.keySet()) {
            String key = o.toString();
            if (oldJsonObject.containsKey(key) && oldJsonObject.get(key).toString().equals(newJsonObject.get(key).toString())){
                oldJsonObject1.remove(key);
                newJsonObject1.remove(key);
            }
        }

        return list;
    }

    /**
     * 复制一个jsonObject
     * @param sourceJsonObject
     * @return
     */
    public JSONObject jsonObjectCopy(JSONObject sourceJsonObject){
        JSONObject targeJsonObject = new JSONObject();
        for (Object o : sourceJsonObject.keySet()) {
            targeJsonObject.put(o,sourceJsonObject.get(o));
        }
        return targeJsonObject;
    }

}
