package com.example.exercicenavigarion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.exercicenavigarion.databinding.ActivityArticleBinding;
import com.example.exercicenavigarion.databinding.ActivityMainBinding;

public class Article extends AppCompatActivity {
    ActivityArticleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArticleBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Article");
        binding.btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Article.this, Contact.class);
                startActivity(i);
            }
        });
    }
}