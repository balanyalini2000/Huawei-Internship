package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  Intent serviceIntent;
    private Button buttonStart, buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

        serviceIntent = new Intent(getApplicationContext(), MusicService.class);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonStart:
                startService(new Intent(getApplicationContext(), MusicService.class));
                break;
            case R.id.buttonStop:
                stopService(new Intent(getApplicationContext(), MusicService.class));
                break;
        }
    }
}
