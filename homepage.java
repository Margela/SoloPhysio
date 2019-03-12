package com.example.margelanoryaly.solophysio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {

    Button backexercise;
    Button sprainexercise;
    Button strainexercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        backexercise = (Button) findViewById(R.id.backexercise);
        sprainexercise = (Button) findViewById(R.id.sprainexercise);
        strainexercise = (Button) findViewById(R.id.strainexercise);

        backexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backintent = new Intent(homepage.this,backexercise.class);
                homepage.this.startActivity(backintent);
            }
        });

        sprainexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sprainintent = new Intent(homepage.this, sprainexercise.class);
                homepage.this.startActivity(sprainintent);


            }
        });


        strainexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent strainintent = new Intent(homepage.this, sprainexercise.class);
                homepage.this.startActivity(strainintent); }

            });
        }

            }


