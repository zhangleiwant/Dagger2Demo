package com.king.zlei.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.king.zlei.daggerdemo.di.Main2Activity;
import com.king.zlei.daggerdemo.di.scope.PreActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
//    @Type("normal")
    @PreActivity
    public Apple apple;

//    @Inject
//    public Apple apple1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerAppleComponent.create().inject(this);
//        DaggerAppleComponent.builder().appleModule(new AppleModule("我是红苹果")).build().inject(this);
//        DaggerAppleComponent.builder().build().inject(this);
//        PApplication.getComponent().inject(this);

        PApplication application = (PApplication) (getApplication());
        application.getComponent().inject(this);
        Log.i("123", "onCreate: " + apple);
//        Log.i("123", "onCreate: " + apple1);

        findViewById(R.id.btn_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
