package com.example.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Services started",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }


    @Override
    public void onDestroy() {
        Toast.makeText(this, "Services stopped",Toast.LENGTH_LONG).show();

    }

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }
}
