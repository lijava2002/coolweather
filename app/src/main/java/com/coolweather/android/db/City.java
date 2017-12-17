package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017-12-17.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(){
        this.cityCode = cityCode;
    }

    public int getProviceId(){
        return provinceId;
    }

    public void setProviceId(int provinceId){
        this.provinceId = provinceId;
    }

}
