package com.tiger.demo.learn.LogRecord;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class StoreModel implements Serializable{

    private String storeCode;
    private String storeName;
    private Date createrTime;
    private Date updateTime;
    private Integer storeLevel;



    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public Integer getStoreLevel() {
        return storeLevel;
    }

    public void setStoreLevel(Integer storeLevel) {
        this.storeLevel = storeLevel;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return JSONObject.fromObject(this).toString();
    }
}
