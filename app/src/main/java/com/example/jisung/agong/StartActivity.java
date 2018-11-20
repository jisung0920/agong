package com.example.jisung.agong;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {
    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mHandler = new Handler(); mHandler.postDelayed(mMyTask, 3000); // 3초후에 실행

    }

     private Runnable mMyTask = new Runnable() { @Override public void run() {

         Intent intent = new Intent(StartActivity.this,MainActivity.class);
         startActivity(intent);
          }
    };

}
