package com.google.firebase.codelab.image_labeling;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Created by cs16mmn1 on 25/03/2019.
 */

public class sprainexercise2 extends AppCompatActivity {
    Button clk;
    VideoView videov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sprainexercise2);

        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.video_View5);

    }

    public void videoplay(View v) {
        String videopath = "android.resource://" + getPackageName() + "/" +R.raw.sprainnn;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videov.setMediaController(mediaController);
        mediaController.setAnchorView(videov);

    }
}
