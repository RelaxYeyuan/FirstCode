package com.yeyuan.project.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by admin on 2017/5/7
 * <p>
 * 内容摘要：okHttp数据请求
 * 版权所有: YEYUAN
 * 修改内容：
 * 修改日期
 */
public class HttpUtils {

    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
