package com.rohit.arshayari;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class second extends AppCompatActivity {
Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn=findViewById(R.id.btn3);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(second.this,MainActivity.class);
            startActivity(i);
        });

        btn=findViewById(R.id.btn4);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(second.this,third.class);
            startActivity(i);
        });

        btn=findViewById(R.id.btn5);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(second.this,forth.class);
            startActivity(i);
        });

        btn=findViewById(R.id.btn6);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(second.this,fifth.class);
            startActivity(i);
        });
        btn=findViewById(R.id.btn7);
        btn.setOnClickListener(view -> finishAffinity());

    }
}