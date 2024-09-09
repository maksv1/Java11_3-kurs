package com.example.praktos1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img;
    private Button startBtn;
    private Button pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main2);
        img=findViewById(R.id.img_blink);
        startBtn=findViewById(R.id.start_tween);
        pauseBtn=findViewById(R.id.pause_tween);

        Animation blinkAnimation= AnimationUtils.loadAnimation(this,R.anim.blink_animation);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {img.startAnimation(blinkAnimation);}
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {img.clearAnimation();}
        });

    }
    public void back(View v){
        Intent intent = new Intent(this, MainActivity3.class);

        startActivity(intent);
    }
}