package com.kelseystudeman.musicapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SevenButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_buttons);
    }
    public void goToPause(View view){
        Intent intent = new Intent(this, Paused.class);
        startActivity(intent);
    }
}
