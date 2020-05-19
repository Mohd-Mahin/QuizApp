package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Quiz extends AppCompatActivity {
    private static String[][] quizData = new String[10][6];
    private int arrayIndex = 0;
    public static String[][] quizResult = new String[10][4];
    private String quizLevel;
    private Button nextButton;
    private boolean isChecked;

    private RadioGroup radioGroup;
    private RadioButton option1, option2, option3, option4;
    private TextView question;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        quizLevel = getIntent().getExtras().getString("quiz_level");
        quizData = QuizDB.getQuizQuestion(quizLevel);
        question = findViewById(R.id.question);
        nextButton = findViewById(R.id.nextButton);
        radioGroup = findViewById(R.id.radioGroup);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        setValues(arrayIndex);
    }

    long timer = 1000 * 5 * 60;

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.quiz_menu, menu);

        final MenuItem counter = menu.findItem(R.id.counter);
        new CountDownTimer(timer, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                long millis = millisUntilFinished;
                String minutes = "0" + (TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)));
                String second = String.valueOf((TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
                if (Integer.parseInt(second) < 10) {
                    second = "0" + (TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
                }
                String minSec = minutes + ":" + second;
                counter.setTitle(minSec);
                timer = millis;
            }

            @Override
            public void onFinish() {
                counter.setTitle("Done!!!"); // intent to final screen
            }
        }.start();
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Cannot Go Back", Toast.LENGTH_SHORT).show();
        return;
    }

    public void setValues(int outerIndex) {
        getSupportActionBar().setTitle("Question " + (arrayIndex+1));
        question.setText(quizData[outerIndex][0]);
        option1.setText(quizData[outerIndex][1]);
        option2.setText(quizData[outerIndex][2]);
        option3.setText(quizData[outerIndex][3]);
        option4.setText(quizData[outerIndex][4]);
    }

    public void onNext(View v) {
        if (arrayIndex == 8) nextButton.setText("Submit");

        if (!isChecked) calcResult(111, "Not Answered"); // radio index 111 means u haven't answered and skipped the question
        else {
            radioGroup.clearCheck();
            isChecked = false;
        }

//        Log.d("result", Arrays.deepToString(quizResult));
//        Log.d("result", String.valueOf(arrayIndex));
//        Log.d("result", String.valueOf(quizResult.length));

        if (arrayIndex == 9) {
            Intent intent = new Intent(this, ResultScreen.class);
            intent.putExtra("result", quizResult);
            startActivity(intent);
            return;
        }



        arrayIndex += 1;
        setValues(arrayIndex);



    }

    public void calcResult(int radioIndex, String answer) {
        int resultIndex = Integer.parseInt(quizData[arrayIndex][5]);
        quizResult[arrayIndex][0] = quizData[arrayIndex][0];                // storing question in quiz Result from quiz data;
//        quizResult[arrayIndex][1] = String.valueOf(radioIndex);           // saving user answer
        quizResult[arrayIndex][1] = answer;                                 // user answer
//        quizResult[arrayIndex][2] = String.valueOf(resultIndex);          // saving correct answer
        quizResult[arrayIndex][2] = quizData[arrayIndex][resultIndex];      // correct answer
        if (resultIndex == radioIndex) {
            quizResult[arrayIndex][3] = "correct";
        } else {
            quizResult[arrayIndex][3] = "incorrect";
        }
    }

    public void onRadioClicked(View v) {
        isChecked = ((RadioButton) v).isChecked();
        String answer = ((RadioButton) v).getText().toString();
        if (isChecked) {
            switch (v.getId()) {
                case R.id.option1:
                    calcResult(1, answer);
                    break;
                case R.id.option2:
                    calcResult(2, answer);
                    break;
                case R.id.option3:
                    calcResult(3, answer);
                    break;
                case R.id.option4:
                    calcResult(4, answer);
                    break;
            }
        }
    }
}

