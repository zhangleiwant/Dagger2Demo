package com.king.zlei.daggerdemo.di.module;

import com.king.zlei.daggerdemo.Apple;
import com.king.zlei.daggerdemo.di.scope.PreActivity;

import dagger.Module;
import dagger.Provides;

/**
 * <b>Create Date:</b> 2017/8/22<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

@Module
public class AppleModule {
    /**
     * 1种方法
     */
//    private String name;
//
//    public AppleModule(String name) {
//        this.name = name;
//    }
//
//    @Provides
//    public String provideName(){
//        return name;
//    }


//    /**
//     * 第二种方式
//     * @return
//     */
//    @Provides
//    public String provideName(){
//        return "我是青苹果";
//    }
//
//    @Provides
//    public Knife provideKnife(){
//        return new Knife();
//    }

    /**
     * 自定义限定符的方式
     * @return
     */
    @Provides
//    @Type("normal")
//    @Singleton
    @PreActivity
    public Apple provideApple(){
        return new Apple();
    }

//    @Provides
//    @Type("name")
//    public Apple provideAppleName(){
//        return new Apple("红色的");
//    }

}
