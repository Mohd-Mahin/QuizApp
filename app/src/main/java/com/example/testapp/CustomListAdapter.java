package com.example.testapp;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.ColorRes;

public class CustomListAdapter extends BaseAdapter {
    private ArrayList<ListItem> listData;
    private LayoutInflater layoutInflater;

    public CustomListAdapter(Context customContext, ArrayList<ListItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(customContext);
    }


    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.custom_result_list, null);
            viewHolder = new ViewHolder();
            viewHolder.question = (TextView) convertView.findViewById(R.id.database_question);
            viewHolder.staticQuestion = (TextView) convertView.findViewById(R.id.static_question);
            viewHolder.correctAnswer = (TextView) convertView.findViewById(R.id.database_correct_answer);
            viewHolder.userAnswer = (TextView) convertView.findViewById(R.id.database_your_answer);
            viewHolder.isCorrect = (TextView) convertView.findViewById(R.id.database_is_correct);

            convertView.setTag(viewHolder);

            Log.d("conditionresulttrue", String.valueOf(listData.get(position).getQuestion()));
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
            Log.d("conditionresultfalse", String.valueOf(listData.get(position).getQuestion()));
        }
        
        viewHolder.question.setText(listData.get(position).getQuestion().toUpperCase());
        viewHolder.userAnswer.setText(listData.get(position).getUserAnswer().toUpperCase());
        viewHolder.correctAnswer.setText(listData.get(position).getCorrectAnswer().toUpperCase());
        viewHolder.isCorrect.setText(listData.get(position).getIsCorrect().toUpperCase());
        viewHolder.staticQuestion.setText("Question " + (position + 1));

        String isCorrect = listData.get(position).getIsCorrect();

        if (isCorrect.equals("correct")) {
            viewHolder.isCorrect.setTextColor(Color.parseColor("#006600"));
        } else {
            viewHolder.isCorrect.setTextColor(Color.parseColor("#ff0000"));
        }

        return convertView;
    }

    static class ViewHolder {
        TextView question;
        TextView userAnswer;
        TextView correctAnswer;
        TextView isCorrect;
        TextView staticQuestion;
    }
}
