package com.google.firebase.codelab.image_labeling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;

/**
 * created by Margela Noryaly, 1607625
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run() {

                    startActivity(new Intent(SplashActivity.this, LoginPage.class));

                finish();
            }
        }, 3000);
    }
}
