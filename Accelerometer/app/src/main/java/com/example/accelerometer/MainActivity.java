package com.example.accelerometer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.TextView;
//import android.os.telephony.gsm.smsManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    SensorManager sensorManager;
    Sensor accelerometer;
    TextView accelerometerX;
    TextView accelerometerY;
    TextView accelerometerZ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    }
    protected void onPause()
    {
        super.onPause();
        sensorManager.unregisterListener(this, accelerometer);
    }

    protected void onResume()
    {
        super.onResume();
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public final void onSensorChanged(SensorEvent event)
    {
       if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
       {
           Toast.makeText(this,"Accelerometer X: " + event.values[0]+"Accelerometer Y: " + event.values[1]+"Accelerometer Z: " + event.values[2],Toast.LENGTH_SHORT).show();

            double choc = Math.sqrt(event.values[0]*event.values[0] + event.values[1] * event.values[1] + event.values[2] * event.values[2]);
           Toast.makeText(this,"choc" +choc ,Toast.LENGTH_SHORT).show();

            if (choc > 1) SmsManager.getDefault().sendTextMessage("50331196", null, "Hello", null, null);
       }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
