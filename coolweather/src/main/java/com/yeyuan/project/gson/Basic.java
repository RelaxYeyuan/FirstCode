package com.yeyuan.project.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017/5/29
 * <p>
 * 内容摘要：${TODO}
 * 版权所有: YEYUAN
 * 修改内容：
 * 修改日期
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
