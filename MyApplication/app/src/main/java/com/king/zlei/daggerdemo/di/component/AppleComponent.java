package com.king.zlei.daggerdemo.di.component;

import com.king.zlei.daggerdemo.MainActivity;
import com.king.zlei.daggerdemo.di.Main2Activity;
import com.king.zlei.daggerdemo.di.module.AppleModule;
import com.king.zlei.daggerdemo.di.scope.PreActivity;

import dagger.Component;

/**
 * <b>Create Date:</b> 2017/8/22<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */
//@Singleton
@PreActivity
@Component(modules = AppleModule.class)
public interface AppleComponent {
    void inject(MainActivity activity);

    void inject(Main2Activity activity);
}
