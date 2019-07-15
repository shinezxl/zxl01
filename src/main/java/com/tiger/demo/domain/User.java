package com.tiger.demo.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable,Cloneable{

    private Integer id;
    private String userName = "zxl1";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
        super();
    }

    public User(Integer id) {
        this.id = id;
    }

    public User clone(){
        User user = null;
        try {
            user = (User)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
