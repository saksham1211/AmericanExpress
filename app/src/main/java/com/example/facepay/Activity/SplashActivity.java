package com.example.facepay.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import com.example.facepay.R;

public class SplashActivity extends AppCompatActivity {

    String password;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        SharedPreferences settings  = getSharedPreferences("PREFS",0);
        password = settings.getString("password","");

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(password.equals("")) {
                    Intent intent = new Intent(SplashActivity.this, AppAuthReg.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Intent intent = new Intent(SplashActivity.this, AppAuthActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 1000);
    }
}
