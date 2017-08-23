package com.king.zlei.daggerdemo.di.component;

import com.king.zlei.daggerdemo.di.Main3Activity;
import com.king.zlei.daggerdemo.di.module.Main3Moudle;

import dagger.Component;

/**
 * <b>Create Date:</b> 2017/8/23<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

@Component(modules = Main3Moudle.class)
public interface Main3Component {
    void inject(Main3Activity activity);
}
