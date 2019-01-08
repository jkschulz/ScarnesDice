package com.example.demouser.dice;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.WrappedDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rand = new Random();
    ImageView dieImage;
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = getResources();


        dieImage = findViewById(R.id.dieImage);
        TextView userScore = findViewById(R.id.userScore);
        TextView computerScore = findViewById(R.id.computerScore);
        TextView status = findViewById(R.id.status);
        Button resetButton =  findViewById(R.id.resetButton);
        Button holdButton =  findViewById(R.id.holdButton);
        Button rollButton =  findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie();
            }
        });
    }

    private int rollDie() {
      int result = rand.nextInt(6) + 1;
      switch (result) {
          case 1:
              dieImage.setImageDrawable(res.getDrawable(R.drawable.dice1));
              break;
          case 2:
              dieImage.setImageDrawable(res.getDrawable(R.drawable.dice2));
              break;
          case 3:
              dieImage.setImageDrawable(res.getDrawable(R.drawable.dice3));
              break;
          case 4:
              dieImage.setImageDrawable(res.getDrawable(R.drawable.dice4));
              break;
          case 5:
              dieImage.setImageDrawable(res.getDrawable(R.drawable.dice5));
              break;
          case 6:
              dieImage.setImageDrawable(res.getDrawable(R.drawable.dice6));
              break;
          default:
              break;
      }
      return result;
    }
}
