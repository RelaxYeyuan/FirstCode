package com.yeyuan.project.db;

import com.yeyuan.project.entity.DatabaseRequest;

/**
 * Created by admin on 2017/5/7
 * <p>
 * 内容摘要：县级数据
 * 版权所有: YEYUAN
 * 修改内容：
 * 修改日期
 */
public class County extends DatabaseRequest {
    private String countyName;
    private String weatherId;
    private int cityId;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
