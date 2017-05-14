package com.yeyuan.project.db;

import com.yeyuan.project.entity.DatabaseRequest;

/**
 * Created by admin on 2017/5/7
 * <p>
 * 内容摘要：城市
 * 版权所有: YEYUAN
 * 修改内容：
 * 修改日期
 */
public class City extends DatabaseRequest {
    private String cityName;
    private int cityCode;
    private int provinceId;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
