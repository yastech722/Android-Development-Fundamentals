package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private static final String LOG_TAG= MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(LOG_TAG,"VERBOSE");
        Log.d(LOG_TAG,"DEBUG");
        Log.i(LOG_TAG,"INFO");
        Log.w(LOG_TAG,"WARNING");
        Log.e(LOG_TAG,"ERROR");
        Log.wtf(LOG_TAG,"What a Terrible Failure");
    }
}
