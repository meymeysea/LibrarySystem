package com.example.librarysystem;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo=findViewById(R.id.logobook);
        int imgResource= getResources().getIdentifier("@drawable/booklogo1",null,this.getPackageName());
        logo.setImageResource(imgResource);

        ImageButton admin=findViewById(R.id.Admin);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(MainActivity.this,Choice_log_regis.class);
                startActivity(myintent);

            }
        });
        ImageButton student=findViewById(R.id.Student);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent= new Intent(MainActivity.this,Choice_log_regis.class);
                startActivity(myintent);

            }
        });


    }
}
