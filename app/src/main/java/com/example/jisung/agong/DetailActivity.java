package com.example.jisung.agong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
    public void next(View v){
        ImageView img = (ImageView)v.findViewById(R.id.img1);
        img.setVisibility(ImageView.GONE);
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(DetailActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
