package com.yeyuan.project.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 2017/5/29
 * <p>
 * 内容摘要：${TODO}
 * 版权所有: YEYUAN
 * 修改内容：
 * 修改日期
 */
public class Weather {
    public String status;

    public Basic basic;

    public Aqi aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
