package com.example.labactivity1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class ServiceLog extends IntentService {
    public ServiceLog(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 1; i < 10; i++) {
            Log.d("ServiceLog", "Greetings: " + i);
        }
    }
}
