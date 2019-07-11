package com.xuanfeng.testcomponent;

import android.content.Context;
import android.content.Intent;

import com.xuanfeng.componentlib.ITestInterface;

/**
 * 主工程跳转插件服务
 */
public class TestService implements ITestInterface {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, TestActivity.class);
        context.startActivity(intent);
    }
}
