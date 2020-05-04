package com.example.testapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Quiz extends AppCompatActivity {
    private static String[][] quizData = {
            {"A ………. is an electronic device that process data, converting it into information.", "computer", "processor", "case", "stylus", "1"},
            {"The first mechanical computer designed by Charles Babbage was called ?", "Abacus", "Analytical Engine", "Calculator", "Processor", "2"},
            {"Which of the following is the most powerful type of computer ?", "Super–micro", "Super conductor", "Super computer", "Megaframe", "3"},
    };
    private int arrayIndex = 0;
    private String[][] quizResult = new String[10][4];
    private String getQuizLevel;
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

        getQuizLevel = getIntent().getExtras().getString("quiz_level");
        question = findViewById(R.id.question);
        nextButton = findViewById(R.id.nextButton);
        radioGroup = findViewById(R.id.radioGroup);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        setValues(arrayIndex);

        new CountDownTimer(1000 * 100, 1000) {
            public void onTick(long millisUntilFinished) {
                Log.d("timer", String.valueOf(millisUntilFinished/1000));
            }
            public  void onFinish() {
                // end the test
            }
        }.start();
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.quiz_menu, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Cannot Go Back", Toast.LENGTH_SHORT).show();
        return;
    }

    public void setValues(int outerIndex) {
        question.setText(quizData[outerIndex][0]);
        option1.setText(quizData[outerIndex][1]);
        option2.setText(quizData[outerIndex][2]);
        option3.setText(quizData[outerIndex][3]);
        option4.setText(quizData[outerIndex][4]);
    }

    public void onNext(View v) {
        if (arrayIndex == 10) {
//            Intent intent = new Intent(getApplicationContext(),)
        }


        if (!isChecked) {
            calcResult(111); // radio index 111 means u haven't answered and skipped the question
        } else {
            radioGroup.clearCheck();
        }
        arrayIndex += 1;
        setValues(arrayIndex);
    }

    public void calcResult(int radioIndex) {
        int resultIndex = Integer.parseInt(quizData[arrayIndex][5]);
        quizResult[arrayIndex][0] = quizData[arrayIndex][0];
        quizResult[arrayIndex][1] = String.valueOf(radioIndex);
        quizResult[arrayIndex][2] = String.valueOf(resultIndex);
        if (resultIndex == radioIndex) {
            quizResult[arrayIndex][3] = "correct";
        } else {
            quizResult[arrayIndex][3] = "incorrect";
        }
        Log.d("Array string", Arrays.deepToString(quizResult));
    }

    public void onRadioClicked(View v) {
        isChecked = ((RadioButton) v).isChecked();
        if (isChecked) {
            switch (v.getId()) {
                case R.id.option1:
                    calcResult(1);
                    break;
                case R.id.option2:
                    calcResult(2);
                    break;
                case R.id.option3:
                    calcResult(3);
                    break;
                case R.id.option4:
                    calcResult(4);
                    break;
            }
        }
    }
}

