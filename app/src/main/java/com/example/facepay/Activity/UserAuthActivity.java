package com.example.facepay.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.facepay.R;

public class UserAuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_auth);
    }

    public void intent(View view) {
        Intent intent = new Intent(UserAuthActivity.this , UpiActivity.class);
        startActivity(intent);
        finish();
    }
}
