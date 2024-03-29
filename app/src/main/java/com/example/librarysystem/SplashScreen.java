package com.example.librarysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView logo=findViewById(R.id.logobook);
        int imgResource= getResources().getIdentifier("@drawable/booklogo1",null,this.getPackageName());
        logo.setImageResource(imgResource);

        Thread mythread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mythread.start();
    }
}
