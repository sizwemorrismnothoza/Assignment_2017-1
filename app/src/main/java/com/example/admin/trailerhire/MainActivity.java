package com.example.admin.trailerhire;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button trailer,calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /***** https://examples.javacodegeeks.com/android/core/view/onclicklistener/android-onclicklistener-example/ ***/

        trailer =(Button)findViewById(R.id.trailer);
        trailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TrailerActivity.class);
                startActivity(i);
            }
        });

        calculator = (Button)findViewById(R.id.calculator);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(i);

            }
        });







    }
}
