package com.example.real;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ihome = new Intent(splash.this, Login.class);
                startActivity(ihome);
                finish();
            }
        }, SplashScreenManager.getInstance().getDelayTime()); // Using singleton to get delay time


    }
}