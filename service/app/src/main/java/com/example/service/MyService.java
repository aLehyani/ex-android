package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    public void onStartCommand() {
        MediaPlayer player;
        player=MediaPlayer.Create(this,Settings.System.DEFAULT_)

    }



    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}
