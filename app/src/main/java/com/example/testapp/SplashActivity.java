package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SplashActivity extends  AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        getSupportActionBar().hide();
        setContentView(R.layout.splash_screen);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    Intent intent = new Intent(getBaseContext(), MainActivity.class );
                    startActivity(intent);

                    finish();
                } catch (Exception e) {
                }
            }
        };
        thread.start();
    }
}


