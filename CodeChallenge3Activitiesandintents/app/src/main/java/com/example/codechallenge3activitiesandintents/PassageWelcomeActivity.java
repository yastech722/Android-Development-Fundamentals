package com.example.codechallenge3activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PassageWelcomeActivity extends AppCompatActivity {
public static final String PASSAGE_TITLE="passage_title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage_welcome);
    }

    public void welcomePassageActivityAction(View view){
        Intent intent=new Intent(this, PassageActivity.class);;
        if(view== findViewById(R.id.welcome_passage_btn_one)){

         intent.putExtra(PASSAGE_TITLE, 1);
        }
        else if(view== findViewById(R.id.welcome_passage_btn_two)){
            intent.putExtra(PASSAGE_TITLE, 2);
        }
        else if(view== findViewById(R.id.welcome_passage_btn_three)){
            intent.putExtra(PASSAGE_TITLE, 3);
        }
        startActivity(intent);
    }
}
