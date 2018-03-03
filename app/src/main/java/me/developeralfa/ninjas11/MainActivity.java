package me.developeralfa.ninjas11;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareText(View view) {

        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_VIEW);//Used to share things with the apps
        String url = "http://developeralfa.me";
        shareIntent.setData(Uri.parse(url));
        startActivity(shareIntent);


    }
}
