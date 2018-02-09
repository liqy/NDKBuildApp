package com.liqy.ndkbuildapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //使用静态代码块引入cpp
    static {
        System.loadLibrary("hello-jni");
    }


    public TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello=(TextView)findViewById(R.id.hello);
        hello.setText(jniTellMeWhy("1510C"));
    }

    //声明native方法
    public native String jniTellMeWhy(String string);

}
