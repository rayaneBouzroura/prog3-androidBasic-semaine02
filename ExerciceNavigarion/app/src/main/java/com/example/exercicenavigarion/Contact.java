package com.example.exercicenavigarion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.exercicenavigarion.databinding.ActivityContactBinding;

public class Contact extends AppCompatActivity {
    ActivityContactBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        getSupportActionBar().setTitle("Contact");
        binding.btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //bouton ne marche pas
                Intent i =new Intent(Contact.this , MainActivity.class);
                startActivity(i);
            }
        });

    }
}