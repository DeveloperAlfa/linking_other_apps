package me.developeralfa.ninjas11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareText(View view) {

        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);//Used to share things with the apps
        shareIntent.setType("text/plain");//To set the type of extra being sent
        shareIntent.putExtra(Intent.EXTRA_TEXT,"abcd");//sending th =e
        startActivity(shareIntent);
    }
}
