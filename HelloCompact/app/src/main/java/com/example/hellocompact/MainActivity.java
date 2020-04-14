package com.example.hellocompact;

import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private TextView mTxvHello;
    private String[] mColorArray = {"red", "pink", "purple", "deep_purple",
            "indigo", "blue", "light_blue", "cyan", "teal", "green",
            "light_green", "lime", "yellow", "amber", "orange", "deep_orange",
            "brown", "grey", "blue_grey", "black" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxvHello= findViewById(R.id.main_txv_hello);

        if(savedInstanceState != null) {
            mTxvHello.setTextColor(savedInstanceState.getInt("color"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("color",mTxvHello.getCurrentTextColor());
    }

    public void changeColor(View view) {
        Random random = new Random();
        String colorName= mColorArray[random.nextInt(20)];
        int colorResourceName=getResources().getIdentifier(colorName,"color",getApplicationContext().getPackageName());
        int colorRes= ContextCompat.getColor(this,colorResourceName);
        mTxvHello.setTextColor(colorRes);
    }
}
