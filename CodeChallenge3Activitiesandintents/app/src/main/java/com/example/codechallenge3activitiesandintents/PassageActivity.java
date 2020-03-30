package com.example.codechallenge3activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PassageActivity extends AppCompatActivity {
    private TextView mTxvHeader, mTxvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);

        mTxvHeader= findViewById(R.id.passage_txv_header);
        mTxvMessage=findViewById(R.id.passage_txv_body);

        Intent intent=getIntent();
        int passageTitle= intent.getIntExtra(PassageWelcomeActivity.PASSAGE_TITLE,1);
        switch (passageTitle){
            case 1:
                mTxvHeader.setText(getString(R.string.text_one));
                mTxvMessage.setText(getString(R.string.text_one_body));
                break;
            case 2:
                mTxvHeader.setText(getString(R.string.text_two));
                mTxvMessage.setText(getString(R.string.text_two_body));
                break;
            case 3:
                mTxvHeader.setText(getString(R.string.text_three));
                mTxvMessage.setText(getString(R.string.text_three_body));
                break;
            default:
                mTxvHeader.setText(getString(R.string.text_one));
                mTxvMessage.setText(getString(R.string.text_one_body));
        }
    }
}
