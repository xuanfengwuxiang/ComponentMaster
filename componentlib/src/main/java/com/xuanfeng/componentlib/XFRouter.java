package com.xuanfeng.componentlib;

import android.app.Application;

//组件化库的对外类
public class XFRouter {


    //初始化所有组件的Application
    public static void initComponent(Application app) {

        for (String component : AppConfig.COMPONENT) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppInterface) {
                    ((IAppInterface) object).initialize(app);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
