package com.example.labactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void showUSTWebsite(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ust.edu.ph/"));
        startActivity(i);
    }

    public void showMyUste(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myuste.ust.edu.ph/"));
        startActivity(i);
    }

    public void showBlackboard(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ust.blackboard.com/"));
        startActivity(i);
    }
}
