package me.developeralfa.ninjas11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Texter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texter);
        Intent intent = getIntent();
        String action = intent.getAction();
        if(intent.hasExtra(Intent.EXTRA_TEXT))
        {
            String Message = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView textView = findViewById(R.id.text);
            textView.setText(Message);
        }
    }
}
