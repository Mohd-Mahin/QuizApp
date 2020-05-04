package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String pressed;
    private Button easyButton;
    private Button mediumButton;
    private Button hardButton;
    private Button startQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        easyButton = (Button) findViewById(R.id.easy_button);
        mediumButton = (Button) findViewById(R.id.medium_button);
        hardButton = (Button) findViewById(R.id.hard_button);
        startQuiz = (Button) findViewById(R.id.start_quiz);
        pressed = "no-level-selected";

        easyButton.setOnClickListener(this);
        mediumButton.setOnClickListener(this);
        hardButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        v.setBackgroundColor(Color.GRAY);
        if (v.getId() != R.id.start_quiz) {
            startQuiz.setOnClickListener(this);
        }

        switch (v.getId()) {
            case R.id.easy_button:
                pressed = "easy_mode";
                mediumButton.setBackgroundColor(Color.parseColor("#325C35"));
                hardButton.setBackgroundColor(Color.parseColor("#325C35"));
                break;
            case R.id.medium_button:
                pressed = "medium_mode";
                hardButton.setBackgroundColor(Color.parseColor("#325C35"));
                easyButton.setBackgroundColor(Color.parseColor("#325C35"));
                break;
            case R.id.hard_button:
                pressed = "hard_mode";
                mediumButton.setBackgroundColor(Color.parseColor("#325C35"));
                easyButton.setBackgroundColor(Color.parseColor("#325C35"));
                break;
            case R.id.start_quiz:
                Intent intent = new Intent(getBaseContext(), Quiz.class);
                intent.putExtra("quiz_level", pressed);
                startActivity(intent);
                break;
        }
    }
}
