package com.example.Activitylifecycleandstate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public static final String COUNT="count";
private static final String LOG_TAG=MainActivity.class.getSimpleName();
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
        Log.d(LOG_TAG,"--------------");
        Log.d(LOG_TAG,"ON CREATE");
        if(savedInstanceState!=null){
            mTxvCount.setText(savedInstanceState.getString("count")+"");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("count:", mCount+"");
        if(Integer.parseInt(mTxvCount.getText().toString())>0){
            outState.putString("count",mTxvCount.getText().toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"--------------");
        Log.d(LOG_TAG,"ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"--------------");
        Log.d(LOG_TAG,"ON RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"--------------");
        Log.d(LOG_TAG,"ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"--------------");
        Log.d(LOG_TAG,"ON STOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"--------------");
        Log.d(LOG_TAG,"ON RESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG,"--------------");
        Log.d(LOG_TAG,"ON DESTROY");
    }

    public void mainActivityAction(View view) {
        if(view==findViewById(R.id.main_btn_toast)){
            Intent intent= new Intent(this,HelloActivity.class);
            intent.putExtra(COUNT,mTxvCount.getText().toString());
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
