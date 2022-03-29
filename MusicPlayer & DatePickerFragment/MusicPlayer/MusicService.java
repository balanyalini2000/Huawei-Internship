package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MusicService extends Service {
    private MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        Toast.makeText(this, "Service created", Toast.LENGTH_SHORT).show();
        player = MediaPlayer.create(getApplicationContext(), R.raw.home);
        player.setLooping(false);
    }

    public  void OnStart(Intent intent, int startid){
        Toast.makeText(this, "Service created", Toast.LENGTH_SHORT).show();
        player.start();
    }

    public void onDestroy(){
        Toast.makeText(this, "Service stopped", Toast.LENGTH_SHORT).show();
        player.stop();
    }

}
