package com.example.durbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash_Screen extends AppCompatActivity {
    ImageView image;
//    public ProgressBar progressbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        image = findViewById(R.id.image);

        final Thread timer = new Thread(){

            @Override
            public void run() {

                try {
                    sleep(4000);
                    nextactivity();
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        timer.start();

    }

    public void nextactivity() {
        Intent intent = new Intent(Splash_Screen.this, MapsActivity.class);
        startActivity(intent);

    }
}
