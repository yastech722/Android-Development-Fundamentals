package com.example.Activitylifecycleandstate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
private TextView mTxvCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        mTxvCount= findViewById(R.id.hello_txv_count);
        Intent intent= getIntent();
        mTxvCount.setText(intent.getStringExtra(MainActivity.COUNT));
    }
}
