package com.example.codechallenge3activitiesandintents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mainActivityAction(View view) {

        if (view == findViewById(R.id.main_btn_passage)) {
            startActivity(new Intent(MainActivity.this, PassageWelcomeActivity.class));
        } else if (view == findViewById(R.id.main_btn_message)) {
            startActivity(new Intent(MainActivity.this, MessageActivity.class));
        }

    }
}
