package com.rohit.arshayari;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class third extends AppCompatActivity {
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btn=findViewById(R.id.btn8);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(third.this,second.class);
            startActivity(i);
        });
        btn=findViewById(R.id.btn9);
        btn.setOnClickListener(view -> finishAffinity());

    }
}