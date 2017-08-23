package com.king.zlei.daggerdemo.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * <b>Create Date:</b> 2017/8/23<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PreActivity {
}
