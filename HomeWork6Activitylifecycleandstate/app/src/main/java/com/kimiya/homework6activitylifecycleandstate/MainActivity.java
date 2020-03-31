package com.kimiya.homework6activitylifecycleandstate;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView mTxvCount;
private int mcount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxvCount=findViewById(R.id.main_txv_count);
        if(savedInstanceState !=null){
            mTxvCount.setText(savedInstanceState.getString("count"));
            mcount= Integer.parseInt(savedInstanceState.getString("count"));
        }
    }

    public void mainActivityAction(View view) {
        mcount++;
        mTxvCount.setText(mcount+"");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count", mTxvCount.getText().toString());
    }
}
