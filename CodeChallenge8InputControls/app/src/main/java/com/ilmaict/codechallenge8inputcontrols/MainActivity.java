package com.ilmaict.codechallenge8inputcontrols;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText mEdtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtNumber= findViewById(R.id.edt_number);
        mEdtNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if(actionId== EditorInfo.IME_ACTION_SEND){
                    dialPhoneNumber();
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    private void dialPhoneNumber(){

        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel: "+mEdtNumber.getText().toString()));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }

}
