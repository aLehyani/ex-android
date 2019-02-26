package com.example.service;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button butt1;
    Button butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt1=(Button)findViewById(R.id.b1);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW );
                intent.

                }
        });


        butt2=(Button)findViewById(R.id.b2);

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService();

            }
        });

    }
}
