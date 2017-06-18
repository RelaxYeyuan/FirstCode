package com.yeyuan.project.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;

/**
 * Created by admin on 2017/6/17
 * <p>
 * 内容摘要：${TODO}
 * 版权所有: YEYUAN
 * 修改内容：
 * 修改日期
 */
public abstract class BaseActivity extends Activity {

    public abstract int getContentViewId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        ButterKnife.bind(this);
        initAllMembersView(savedInstanceState);
    }

    protected abstract void initAllMembersView(Bundle savedInstanceState);

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
