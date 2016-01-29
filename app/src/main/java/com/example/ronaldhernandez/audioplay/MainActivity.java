package com.example.ronaldhernandez.audioplay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         sound = MediaPlayer.create(this, R.raw.rain);
    }

    public void playSound(View view){

        sound.start();

    }

    public void pauseSound(View view){

    sound.pause();
    }
}
