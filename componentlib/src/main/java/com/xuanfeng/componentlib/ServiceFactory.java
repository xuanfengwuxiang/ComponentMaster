package com.xuanfeng.componentlib;

//
public class ServiceFactory {

    private static ServiceFactory mInstance;

    public static ServiceFactory getInstance() {
        if (mInstance == null) {
            mInstance = new ServiceFactory();
        }
        return mInstance;
    }

    private ITestInterface mTestInterface;

    public ITestInterface getTestInterface() {
        return mTestInterface;
    }

    public void setTestInterface(ITestInterface testInterface) {
        mTestInterface = testInterface;
    }
}
