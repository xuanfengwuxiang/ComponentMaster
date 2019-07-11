package com.xuanfeng.componentmaster;

import android.app.Application;

import com.xuanfeng.componentlib.XFRouter;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        XFRouter.initComponent(this);
    }
}
