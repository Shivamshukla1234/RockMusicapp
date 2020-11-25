package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;


public class Main2Activity extends AppCompatActivity {

    ImageView splashImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        splashImage=(ImageView)findViewById(R.id.imagesplash);

        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.myanimation);

        splashImage.startAnimation(myanim);


        Thread myThread= new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(5000);

                    Intent i =new Intent(Main2Activity.this,MainActivity.class);
                    startActivity(i);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        myThread.start();

    }
}

