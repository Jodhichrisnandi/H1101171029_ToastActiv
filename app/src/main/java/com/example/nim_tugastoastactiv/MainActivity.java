package com.example.nim_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int naik = 29;
    Button button_hellojodhi, button_countup, button_countdown;
    TextView angka29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button_hellojodhi = (Button) findViewById(R.id.button_hellojodhi);
        button_countup = (Button) findViewById(R.id.button_countup);
        button_countdown = (Button) findViewById(R.id.button_countdown);
        angka29 = (TextView) findViewById(R.id.angka29);

        button_hellojodhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Jodhi Chrisnandi", Toast.LENGTH_SHORT).show();
            }
        });

        button_countup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik++;
                angka29.setText(Integer.toString(naik));
            }
        });

        button_countdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik--;
                angka29.setText(Integer.toString(naik));

            }
        });

    }
}
