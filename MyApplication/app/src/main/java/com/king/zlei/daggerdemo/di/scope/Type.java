package com.king.zlei.daggerdemo.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * <b>Create Date:</b> 2017/8/22<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Type {
    String value() default "";
}
