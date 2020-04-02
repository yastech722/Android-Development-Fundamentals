package com.kimiya.codechallenge5ImplicitIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    public static int count = 0;
    public static final String SELECTED_ITEM = "selected item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void secondActivityAction(View view) {
        count++;
        count = (count == 7) ? 2 : count++;
        Intent intent = new Intent();
        if (view == findViewById(R.id.second_item_one)) {
            intent.putExtra(SELECTED_ITEM, getString(R.string.item_one));
        } else if(view==findViewById(R.id.second_item_two)){
            intent.putExtra(SELECTED_ITEM, getString(R.string.item_two));
        } else if(view==findViewById(R.id.second_item_three)){
            intent.putExtra(SELECTED_ITEM, getString(R.string.item_three));
        } else if(view==findViewById(R.id.second_item_four)){
            intent.putExtra(SELECTED_ITEM, getString(R.string.item_four));
        } else if(view==findViewById(R.id.second_item_five)){
            intent.putExtra(SELECTED_ITEM, getString(R.string.item_five));
        } else if(view==findViewById(R.id.second_item_six)){
            intent.putExtra(SELECTED_ITEM, getString(R.string.item_six));
        }

        setResult(RESULT_OK, intent);
        finish();


    }
}
