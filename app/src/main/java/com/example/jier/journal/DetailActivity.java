package com.example.jier.journal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 *  The detailactivity purpose is just to view a whole content of Journal entry.
 *
 *  Jier Nzuanzu
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String mood = intent.getStringExtra("mood");
        String date= intent.getStringExtra("timestamp");
        String content = intent.getStringExtra("content");

        TextView viewTitle = findViewById(R.id.textViewTitle);
        TextView viewMood = findViewById(R.id.textViewMood);
        TextView viewDate = findViewById(R.id.textViewDate);
        TextView viewContent = findViewById(R.id.textViewContent);


        viewTitle.setText(title);
        viewMood.setText(mood);
        viewDate.setText(date);
        viewContent.setText(content);

//        Enable scrolling of the content if text content is larger than the screen
        viewContent.setMovementMethod(new ScrollingMovementMethod());
    }
}
