package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("key","Oncreate is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("key","onRestart in called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("key","onResume is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("key","onDestroy is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("key","onStop is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("key","onStart is called");
    }
}