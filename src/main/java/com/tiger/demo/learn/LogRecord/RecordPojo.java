package com.tiger.demo.learn.LogRecord;

import net.sf.json.JSONObject;

import java.util.Date;

public class RecordPojo {

    private Integer id;
    private String newModel;
    private String originalModel;
    private String operatePeople;
    private String operateType;
    private Date operateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewModel() {
        return newModel;
    }

    public void setNewModel(String newModel) {
        this.newModel = newModel;
    }

    public String getOriginalModel() {
        return originalModel;
    }

    public void setOriginalModel(String originalModel) {
        this.originalModel = originalModel;
    }

    public String getOperatePeople() {
        return operatePeople;
    }

    public void setOperatePeople(String operatePeople) {
        this.operatePeople = operatePeople;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    @Override
    public String toString() {
        return JSONObject.fromObject(this).toString();
    }
}
