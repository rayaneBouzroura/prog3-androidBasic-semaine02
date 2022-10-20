package com.example.exercicetransfertinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exercicetransfertinfo.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {
    ActivityContactBinding binding;
    String nom;
    EditText monEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        monEditText = binding.inputText;
        String text = monEditText.getText().toString();
        nom = binding.inputText.getText().toString();


        binding.btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ContactActivity.this,MainActivity.class);
                Toast.makeText(ContactActivity.this, "le data binding est : "+nom , Toast.LENGTH_SHORT).show();
                i.putExtra("nomContact",nom);
                startActivity(i);
            }
        });

    }
}