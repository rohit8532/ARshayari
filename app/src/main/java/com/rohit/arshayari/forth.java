package com.rohit.arshayari;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class forth extends AppCompatActivity {
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        btn=findViewById(R.id.btn10);
        btn.setOnClickListener(view -> {
            Intent i = new Intent(forth.this, second.class);
            startActivity(i);
        });
        btn=findViewById(R.id.btn11);
        btn.setOnClickListener(view -> finishAffinity());
    }
}