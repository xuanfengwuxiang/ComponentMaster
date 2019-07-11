package com.xuanfeng.testcomponent;

import android.app.Application;

import com.xuanfeng.componentlib.IAppInterface;
import com.xuanfeng.componentlib.ServiceFactory;

//此类初始化通过主工程反射调用
public class TestApplication extends Application implements IAppInterface {

    private static Application application;

    public static Application getInstance(){
        return application;
    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setTestInterface(new TestService());
    }
}
