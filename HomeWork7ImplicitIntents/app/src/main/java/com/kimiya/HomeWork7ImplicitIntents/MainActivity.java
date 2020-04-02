package com.kimiya.HomeWork7ImplicitIntents;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEdtWebUrl, mEdtLocation, mEdtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtWebUrl = findViewById(R.id.main_edt_web_url);
        mEdtLocation = findViewById(R.id.main_edt_location);
        mEdtText = findViewById(R.id.main_edt_text);
    }

    public void mainActivityAction(View view) {
        Intent intent;
        if (view == findViewById(R.id.main_btn_web)) {
            Uri webpage = Uri.parse(mEdtWebUrl.getText().toString());
            intent = new Intent(Intent.ACTION_VIEW, webpage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Cant handle this", Toast.LENGTH_LONG).show();
            }
        } else if (view == findViewById(R.id.main_btn_location)) {
            Uri location = Uri.parse("geo:0,0?=" + mEdtLocation.getText().toString());
            intent = new Intent(Intent.ACTION_VIEW, location);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Toast.makeText(this, "Cant handle this", Toast.LENGTH_LONG).show();
            }
        } else if (view == findViewById(R.id.main_btn_text)) {
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder
                    .from(this)
                    .setType(mimeType)
                    .setChooserTitle("Select an app to share")
                    .setText(mEdtText.getText().toString())
                    .startChooser();
        }
        else if(view==findViewById(R.id.main_btn_camera)){
             intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
             startActivity(intent);
        }
    }
}
