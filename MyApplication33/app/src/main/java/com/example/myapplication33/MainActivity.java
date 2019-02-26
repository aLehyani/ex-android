package com.example.myapplication33;

import android.support.v7.app.AppCompatActivity;



import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    Button start;
    Button stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=(VideoView)findViewById(R.id.Videoo);
        Uri uri=

                Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoo);

        videoView.setVideoURI(uri);
        videoView.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        videoView.suspend();
    }
    @Override
    protected void onResume() {
        super.onResume();
        videoView.resume();
    }
}