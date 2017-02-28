package com.saranr689.gps_settings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.saranr689.enablegps.EnableGPS;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EnableGPS.displayLocationSettingsRequest(MainActivity.this);
    }

}
