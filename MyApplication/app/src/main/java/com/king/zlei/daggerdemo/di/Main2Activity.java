package com.king.zlei.daggerdemo.di;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.king.zlei.daggerdemo.Apple;
import com.king.zlei.daggerdemo.PApplication;
import com.king.zlei.daggerdemo.R;
import com.king.zlei.daggerdemo.di.scope.PreActivity;

import javax.inject.Inject;

/**
 * <b>Create Date:</b> 2017/8/23<br>
 * <b>Author:</b> Zhanglei<br>
 * <b>Description:</b> <br>
 */

public class Main2Activity extends AppCompatActivity {
    @Inject
    @PreActivity
    public Apple apple;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        PApplication application = (PApplication) (getApplication());
        application.getComponent().inject(this);
        Log.i("123", "Main2Activity " + apple);

        findViewById(R.id.btn_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
            }
        });
    }
}
