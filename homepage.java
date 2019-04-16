package com.google.firebase.codelab.image_labeling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Margela Noryaly
 */
public class homepage extends AppCompatActivity {

    Button backexercise;
    Button sprainexercise;
    Button strainexercise;
    Button remediespage;
    Button reminderspage;
    Button sprainexercise2;
    Button strainexercise2;
    Button motionsensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        motionsensor=(Button) findViewById(R.id.motionsensor);

        motionsensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent motionintent = new Intent(homepage.this, HomeActivity.class);
                homepage.this.startActivity(motionintent);
            }

        });
        reminderspage=(Button) findViewById(R.id.reminderspage);

        reminderspage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remindersintent = new Intent(homepage.this, reminderspage.class);
                homepage.this.startActivity(remindersintent);
            }

        });

        remediespage=(Button) findViewById(R.id.remediespage);

        remediespage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remediesintent = new Intent(homepage.this, remediespage.class);
                homepage.this.startActivity(remediesintent);
            }

        });
        remediespage=(Button) findViewById(R.id.remediespage);

        remediespage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent remediesintent = new Intent(homepage.this, remediespage.class);
                homepage.this.startActivity(remediesintent);
            }

        });

        backexercise = (Button) findViewById(R.id.backexercise);
        sprainexercise = (Button) findViewById(R.id.sprainexercise);
        sprainexercise2 = (Button) findViewById(R.id.sprainexercise2);
        strainexercise = (Button) findViewById(R.id.strainexercise);
        strainexercise2 = (Button) findViewById(R.id.strainexercise2);

        backexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backintent = new Intent(homepage.this, backexercise.class);
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

        sprainexercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sprainintent = new Intent(homepage.this, sprainexercise2.class);
                homepage.this.startActivity(sprainintent);


            }
        });
        strainexercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent strainintent = new Intent(homepage.this, strainexercise2.class);
                homepage.this.startActivity(strainintent);


            }
        });

        strainexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent strainintent = new Intent(homepage.this, strainexercise.class);
                homepage.this.startActivity(strainintent);
            }

        });

    }
}