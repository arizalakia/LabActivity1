package com.example.labactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPortal(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void showGreeting(View view) {
        for(int i=1; i<=10; i++)
            Log.d("Greetings", "Good Day!: " + i);
    }
}
