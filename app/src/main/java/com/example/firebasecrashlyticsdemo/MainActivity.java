package com.example.firebasecrashlyticsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button crash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crash = findViewById(R.id.crash);
        crash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // throw new RuntimeException("Test Crash"); // Force a crash
                Toast.makeText(MainActivity.this, "App crash", Toast.LENGTH_LONG).show();
            }
        });
    }
}