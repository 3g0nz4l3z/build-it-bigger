package com.test.ceibal.displayjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public final static String JOKE_DISPLAY_ACTIVITY_JOKE = "JOKE";
    String joke;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        joke = getIntent().getStringExtra(JOKE_DISPLAY_ACTIVITY_JOKE);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(joke);
    }
}
