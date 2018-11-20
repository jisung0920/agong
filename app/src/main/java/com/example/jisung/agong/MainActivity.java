package com.example.jisung.agong;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button menu,alarm,camera;

    LinearLayout menuFram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu =  (Button)findViewById(R.id.menuBtn);
        alarm = (Button)findViewById(R.id.alarmBtn);
        camera = (Button)findViewById(R.id.cameraBtn);

        menuFram = (LinearLayout)findViewById(R.id.menuView);
        menuFram.setVisibility(View.GONE);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(menuFram.getVisibility()==View.VISIBLE)
                    menuFram.setVisibility(View.GONE);
                else
                    menuFram.setVisibility(View.VISIBLE);

            }
        });
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.setTitle("Custom Dialog");

                TextView tv = (TextView) dialog.findViewById(R.id.text);
                tv.setText("'남양' 제품 \n이물질 검출 관련 기사가 있습니다.");
                tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ajunews.com/view/20181030130900083"));
                        startActivity(intent);


                    }
                });
                ImageView iv = (ImageView) dialog.findViewById(R.id.image);
                iv.setImageResource(R.drawable.alarmitem);

                dialog.show();
                alarm.setVisibility(View.GONE);
//                Intent intent = new Intent(MainActivity.this,AlarmActivity.class);
//                startActivity(intent);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ScanActivity.class);
                startActivity(intent);
            }
        });
    }
}
