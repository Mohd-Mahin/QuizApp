package com.example.testapp;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Quiz extends AppCompatActivity {
//    private static mediumQues =
    private String getQuizLevel;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        getQuizLevel = getIntent().getExtras().getString("quiz_level");

    }
}

