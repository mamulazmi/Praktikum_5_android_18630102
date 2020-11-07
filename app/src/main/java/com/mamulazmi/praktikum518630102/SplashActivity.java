package com.mamulazmi.praktikum518630102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();

        handler.postDelayed((Runnable) () -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }, 3000);
    }
}