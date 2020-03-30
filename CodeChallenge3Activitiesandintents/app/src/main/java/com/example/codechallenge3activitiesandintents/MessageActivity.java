package com.example.codechallenge3activitiesandintents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String MAIN_MESSAGE = "message";
    public static final int REQUEST_CODE = 1;
    private TextView mTxvReply, mTxvHeader;
    private EditText edt_message;

    private void init() {
        edt_message = findViewById(R.id.main_edt_message);
        mTxvReply = findViewById(R.id.main_txv_reply);
        mTxvHeader= findViewById(R.id.main_txv_header);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        init();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            mTxvHeader.setVisibility(View.VISIBLE);
            mTxvReply.setText(data.getStringExtra(SecondActivity.SECOND_REPLY));
        }
    }

    public void messageActivityAction(View view) {
        Intent intent = new Intent(MessageActivity.this, SecondActivity.class);
        intent.putExtra(MAIN_MESSAGE, edt_message.getText().toString());
        startActivityForResult(intent, REQUEST_CODE);
    }
}
