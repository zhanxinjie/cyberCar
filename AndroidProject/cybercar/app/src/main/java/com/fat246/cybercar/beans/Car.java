package com.fat246.cybercar.beans;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/5/21.
 */
public class Car extends BmobObject {

    private String Car_Num;
    private String Car_RackNum;
    private String Car_EngineNum;
    private Double Car_Mileage;
    private String Car_Nick;
    private String Car_ModelType;

    //get
    public String getCar_Num() {
        return this.Car_Num;
    }

    public String getCar_RackNum() {
        return this.Car_RackNum;
    }

    public String getCar_EngineNum() {
        return this.Car_EngineNum;
    }

    public String getCar_Nick() {
        return this.Car_Nick;
    }

    public Double getCar_Mileage() {
        return this.Car_Mileage;
    }

    public String getCar_ModelType() {
        return this.Car_ModelType;
    }

}
