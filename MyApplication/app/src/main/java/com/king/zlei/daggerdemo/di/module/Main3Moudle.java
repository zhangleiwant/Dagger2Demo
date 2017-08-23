package com.king.zlei.daggerdemo.di.module;

import com.king.zlei.daggerdemo.Apple;

import dagger.Module;
import dagger.Provides;

/**
 * <b>Create Date:</b> 2017/8/23<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */
@Module
public class Main3Moudle {

    @Provides
    public Apple provideApple(){
        return new Apple();
    }

}
