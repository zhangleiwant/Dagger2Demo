package com.king.zlei.daggerdemo;

import android.app.Application;

import com.king.zlei.daggerdemo.di.component.AppleComponent;
import com.king.zlei.daggerdemo.di.component.DaggerAppleComponent;
import com.king.zlei.daggerdemo.di.module.AppleModule;

/**
 * <b>Create Date:</b> 2017/8/23<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class PApplication extends Application {

    private AppleComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerAppleComponent.builder().appleModule(new AppleModule()).build();
    }

    public AppleComponent getComponent() {
        return mComponent;
    }
}
