package com.example.codechallenge3activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    public static final String SECOND_REPLY = "reply";
    private TextView mTxvMessage;
    private EditText mEdtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent= getIntent();
        mTxvMessage=findViewById(R.id.second_txv_message);
        mEdtMessage=findViewById(R.id.second_edt_message);
        mTxvMessage.setText(intent.getStringExtra(MessageActivity.MAIN_MESSAGE));
    }

    public void secondActivityAction(View view) {
        Intent intent= new Intent();
        intent.putExtra(SECOND_REPLY, mEdtMessage.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
