package com.example.testapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ResultScreen extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Result");


        ArrayList resultList = getResultList();
        ListView listView = (ListView) findViewById(R.id.result_list);
        CustomListAdapter customListAdapter = new CustomListAdapter(this, resultList);
        listView.setAdapter(customListAdapter);

    }

    private ArrayList getResultList() {
        ArrayList<ListItem> result = new ArrayList<>();
        for(int i=0; i< Quiz.quizResult.length; i++) {
            ListItem listItem = new ListItem();
            listItem.setQuestion(Quiz.quizResult[i][0]);
            listItem.setUserAnswer(Quiz.quizResult[i][1]);
            listItem.setCorrectAnswer(Quiz.quizResult[i][2]);
            listItem.setIsCorrect(Quiz.quizResult[i][3]);
            result.add(listItem);
        }
        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.result_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.restart_quiz:
                final Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                break;
            case R.id.quit_quiz:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Confirmation");
                alert.setMessage("Do you want to Quit");
                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent quitIntent = new Intent(getBaseContext(), MainActivity.class);
                        quitIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        quitIntent.putExtra("EXIT", true);
                        startActivity(quitIntent);
                    }
                });
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
