package com.example.forloopcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

public class main extends AppCompatActivity {

    LinearLayout layout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);

        final Handler handler = new Handler();
        Runnable colorChangeRunnable = new Runnable() {
            @Override
            public void run() {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                layout.setBackgroundColor(color);
                handler.postDelayed(this, 1000); // Run the Runnable again after 2 seconds
            }
        };
        handler.post(colorChangeRunnable); // Start the color changing process

    }
}