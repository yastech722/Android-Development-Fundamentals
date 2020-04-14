package com.example.HomeWork8ClickableImages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
private TextView mTxvOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        mTxvOrder=findViewById(R.id.order_txv_order);
        Intent intent= getIntent();
        mTxvOrder.setText(intent.getStringExtra(MainActivity.EXTRA));

    }
}
