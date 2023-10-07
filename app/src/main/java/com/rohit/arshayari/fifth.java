package com.rohit.arshayari;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class fifth extends AppCompatActivity {
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        btn=findViewById(R.id.btn12);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(fifth.this, second.class);
            startActivity(i);
        });
        btn=findViewById(R.id.btn13);
        btn.setOnClickListener(view -> finishAffinity());
    }
}