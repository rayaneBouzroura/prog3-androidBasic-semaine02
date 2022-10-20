package com.example.exercicetransfertinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.example.exercicetransfertinfo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    NumberPicker numberPicker;
    Integer nbrRepet;
    String nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Accueil");

        //mettre le bon text
        nom = getIntent().getStringExtra("nom");
        binding.textHome.setText("Bonjour "+(nom == null ? "X":nom));
        //retourner le numero choisi
        numberPicker = binding.numPick;
        numberPicker.setMaxValue(10);
        numberPicker.setMinValue(0);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldVal, int newVal) {
                nbrRepet = newVal;
            }
        });
        binding.btnArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ArticleActivity.class);
                i.putExtra("repetition",nbrRepet);
                startActivity(i);
            }
        });
        };

}
