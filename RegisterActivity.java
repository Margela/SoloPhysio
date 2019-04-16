package com.google.firebase.codelab.image_labeling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText mTextName;
    EditText mTextSurname;
    EditText mTextEmail;
    EditText mTextPassword;
    EditText mTextcnfpassword;
    Button mButtonregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);

        db = new DatabaseHelper(this);
        mTextName = (EditText) findViewById(R.id.edittext_Name);
        mTextSurname = (EditText) findViewById(R.id.edittext_Surname);
        mTextPassword = (EditText) findViewById(R.id.edittext_Password);
        mTextcnfpassword = (EditText) findViewById(R.id.edittext_cnf_password);
        mTextEmail = (EditText) findViewById(R.id.edittext_Email);
        mButtonregister = (Button) findViewById(R.id.button_register);
        mButtonregister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegisterActivity.this, LoginPage.class);
                startActivity(LoginIntent);

            }
        });
        mButtonregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mTextName.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                String cnf_pwd = mTextcnfpassword.getText().toString().trim();

                if (pwd.equals((cnf_pwd))) {
                    long val = db.addUser(user, pwd);
                    if (val > 0) {

                        Toast.makeText(RegisterActivity.this, "You have registered", Toast.LENGTH_SHORT).show();
                        Intent moveToLogin = new Intent(RegisterActivity.this, LoginPage.class);
                        startActivity(moveToLogin);

                    } else {
                        Toast.makeText(RegisterActivity.this, "Registration Error", Toast.LENGTH_SHORT).show();
                    }


                } else {
                    Toast.makeText(RegisterActivity.this, "password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }

        });




    }
}