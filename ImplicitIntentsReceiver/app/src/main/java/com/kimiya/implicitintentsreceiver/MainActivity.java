package com.kimiya.implicitintentsreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private TextView mTxvUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxvUri = findViewById(R.id.main_txv_uri);

        Intent intent = getIntent();

        Uri uri = intent.getData();
        if (uri != null) {
            mTxvUri.setText("URL: " + uri.toString());
        }
    }
}
