package com.kimiya.codechallenge4activitylifecycleandstate;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int RESULT_CODE = 1;
    private TextView mTxv1, mTxv2, mTxv3, mTxv4, mTxv5, mTxv6, mTxv7, mTxv8, mTxv9, mTxv10;

    private void init() {
        mTxv1 = findViewById(R.id.main_txv_one);
        mTxv2 = findViewById(R.id.main_txv_two);
        mTxv3 = findViewById(R.id.main_txv_three);
        mTxv4 = findViewById(R.id.main_txv_four);
        mTxv5 = findViewById(R.id.main_txv_five);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
if(savedInstanceState !=null){
    mTxv1.setText(savedInstanceState.getString("Txv1"));
    mTxv2.setText(savedInstanceState.getString("Txv2"));
    mTxv3.setText(savedInstanceState.getString("Txv3"));
    mTxv4.setText(savedInstanceState.getString("Txv4"));
    mTxv5.setText(savedInstanceState.getString("Txv5"));
}
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (SecondActivity.count) {
                case 1:
                    mTxv1.setText(data.getStringExtra(SecondActivity.SELECTED_ITEM));
                    break;
                case 2:
                    mTxv2.setText(data.getStringExtra(SecondActivity.SELECTED_ITEM));
                    break;
                case 3:
                    mTxv3.setText(data.getStringExtra(SecondActivity.SELECTED_ITEM));
                    break;
                case 4:
                    mTxv4.setText(data.getStringExtra(SecondActivity.SELECTED_ITEM));
                    break;
                case 5:
                    mTxv5.setText(data.getStringExtra(SecondActivity.SELECTED_ITEM));
                    break;
                default:
                    mTxv1.setText(data.getStringExtra(SecondActivity.SELECTED_ITEM));

            }

        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Txv1",mTxv1.getText().toString());
        outState.putString("Txv2",mTxv2.getText().toString());
        outState.putString("Txv3",mTxv3.getText().toString());
        outState.putString("Txv4",mTxv4.getText().toString());
        outState.putString("Txv5",mTxv5.getText().toString());

    }

    public void mainActivityAction(View view) {
        startActivityForResult(new Intent(this, SecondActivity.class), RESULT_CODE);
    }
}
