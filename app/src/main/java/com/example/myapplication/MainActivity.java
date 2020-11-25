package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    ImageView splasImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splasImage=(ImageView)findViewById(R.id.createrid);

        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.myanimation2);

        splasImage.startAnimation(myanim);


        Thread myThread= new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(3000);

                    Intent i =new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(i);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        myThread.start();

    }
}

