package com.yeyuan.project.db;

import com.yeyuan.project.entity.DatabaseRequest;

/**
 * Created by admin on 2017/5/7
 * <p>
 * 内容摘要：省会
 * 版权所有：YEYUAN
 * 修改内容：
 * 修改日期
 */
public class Province extends DatabaseRequest {

    private String provinceName;

    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
