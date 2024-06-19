package com.example.labtest02.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.labtest02.R;

 public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout introBtn= findViewById(R.id.introBtn);
        introBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,Main_Activity.class)));

        }

 }