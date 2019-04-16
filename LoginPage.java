package com.google.firebase.codelab.image_labeling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage  extends AppCompatActivity {


    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    TextView mTextViewRegister;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        db = new DatabaseHelper(this);


        mTextUsername = (EditText) findViewById(R.id.edittext_Username);
        mTextPassword = (EditText) findViewById(R.id.edittext_Password);
        mButtonLogin = (Button) findViewById(R.id.button_login);
        mTextViewRegister = (TextView) findViewById(R.id.textview_register);
        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginPage.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                Boolean res = db.checkUser(user, pwd);
                if (res == true) {
                  /*  Toast.makeText(LoginPage.this, "Succesfully Logged In", Toast.LENGTH_SHORT).show();
                    Intent homepageIntent = new Intent(LoginPage.this, homepage.class);
                    startActivity(homepageIntent); */
                    Intent homepageIntent = new Intent(LoginPage.this, homepage.class);
                    startActivity(homepageIntent);

                } else {
                    Toast.makeText(LoginPage.this, "Login Error", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}