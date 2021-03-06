package com.example.homework5activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static final String COUNT="count";
    private int mCount;
    private TextView mTxvCount;
    private Button main_btn_count, main_btn_zero;
    private void init(){
        mCount=0;
        mTxvCount=(TextView)findViewById(R.id.main_txv_show_count);
        main_btn_count=(Button) findViewById(R.id.main_btn_count);
        main_btn_zero=(Button) findViewById(R.id.main_btn_zero);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void mainActivityAction(View view) {
        if(view==findViewById(R.id.main_btn_toast)){
            Intent intent= new Intent(this,HelloActivity.class);
            intent.putExtra(COUNT,mCount);
            startActivity(intent);
        }else if(view==findViewById(R.id.main_btn_zero)){
            mCount=0;
            mTxvCount.setText(mCount+"");
            main_btn_zero.setBackgroundColor(getResources().getColor(R.color.colorGrey));
        }
        else if(view==findViewById(R.id.main_btn_count)){
            mCount++;
            if (mCount > 0) {
                main_btn_zero.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            } else {
                main_btn_zero.setBackgroundColor(getResources().getColor(R.color.colorGrey));
            }
            if (mCount % 2 == 0) {
                main_btn_count.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            } else {
                main_btn_count.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
            mTxvCount.setText(mCount+"");

        }
    }
}
