package com.king.zlei.daggerdemo.di;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.king.zlei.daggerdemo.Apple;
import com.king.zlei.daggerdemo.R;
import com.king.zlei.daggerdemo.di.component.DaggerMain3Component;

import javax.inject.Inject;

/**
 * <b>Create Date:</b> 2017/8/23<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class Main3Activity extends AppCompatActivity {
    @Inject
    public Apple apple;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        DaggerMain3Component.create().inject(this);
        Log.i("123", "Main3Activity " + apple);
    }
}
