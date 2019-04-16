package com.google.firebase.codelab.image_labeling;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class reminderspage extends AppCompatActivity {
    @SuppressLint("StaticFieldLeak")

    private static SeekBar seek_bar;
    @SuppressLint("StaticFieldLeak")
    private static TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminderspage);
        seekbar();
    }

    public void seekbar( ){
        seek_bar = (SeekBar)findViewById(R.id.seekBar);
        text_view =(TextView)findViewById(R.id.textView);
        text_view.setText("Progress : " + seek_bar.getProgress() + " / " +seek_bar.getMax());

        seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_view.setText("Progress : " + progress + " / " +seek_bar.getMax());
                        Toast.makeText(reminderspage.this,"SeekBar in progress",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(reminderspage.this,"SeekBar in StartTracking",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText("Progress : " + progress_value + " / " +seek_bar.getMax());
                        Toast.makeText(reminderspage.this,"SeekBar in StopTracking",Toast.LENGTH_LONG).show();
                    }
                }
        );

    }

 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;


    }
    */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.seekBar) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

