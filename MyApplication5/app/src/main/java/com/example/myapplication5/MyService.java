package com.example.myapplication5;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    MediaPlayer mp;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp = new MediaPlayer();
        mp = MediaPlayer.create(MyService.this, R.raw.hj);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(MyService.this, "Fml", Toast.LENGTH_SHORT).show();
        mp.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(MyService.this, "Fyl", Toast.LENGTH_SHORT).show();
        mp.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("");
    }
}
