package com.google.firebase.codelab.image_labeling;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.firebase.codelab.image_labeling.R;

import androidx.appcompat.app.AppCompatActivity;




public class backexercise extends AppCompatActivity {
    Button clk;
    VideoView videov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.backexercsie);

        clk = (Button) findViewById(R.id.button);
        videov = (VideoView) findViewById(R.id.video_view);

    }

    public void videoplay(View v) {
        String videopath = "android.resource://" + getPackageName() + "/" + + R.raw.back;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videov.setMediaController(mediaController);
        mediaController.setAnchorView(videov);

    }
}
