package com.example.stephencao.hellojnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button callJNIBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callJNIBtn = findViewById(R.id.call_jni_btn);
        callJNIBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.call_jni_btn:{
                System.loadLibrary("hello");//name without lib and .so
                Toast.makeText(this,stringFromJNI(),Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
    //make a statement for a native method helloFromC with the keyword 'native'
    public native String stringFromJNI();// call c language code by jni
}
