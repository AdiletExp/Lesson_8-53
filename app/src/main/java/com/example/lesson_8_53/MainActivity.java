package com.example.lesson_8_53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Life", "onCreate: Carrot");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life", "onStart: Starter Pack");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFE", "onResume: Leona");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life", "onPause: Arturia");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFE", "onStop: BB");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life", "onDestroy: game over Yugio");
    }
}