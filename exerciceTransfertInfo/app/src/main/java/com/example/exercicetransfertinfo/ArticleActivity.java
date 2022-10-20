package com.example.exercicetransfertinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.exercicetransfertinfo.databinding.ActivityArticleBinding;
import com.example.exercicetransfertinfo.databinding.ActivityMainBinding;

import java.sql.Struct;

public class ArticleActivity extends AppCompatActivity {
    ActivityArticleBinding binding ;
    String lorem;
    Integer nbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArticleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //recuperation du nombre
        nbr = getIntent().getIntExtra("repetition",0);
        setTitle("Article" + nbr);

        //ecriture de n lorem ipsum
        String loremRepeter = ecrireLorem(nbr);

        binding.article.setText(loremRepeter);

        binding.btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArticleActivity.this,ContactActivity.class);
                startActivity(i);
            }
        });



    }

    private String ecrireLorem(Integer i) {
        String text = "kiko rocks he's the best overwatch and valolo player and he has the best family ever 😄😄😄  \n";
        String textVide ="";
        for (int j = 0; j < i; j++) {

            textVide +=text;
        }
        return textVide;
    }
}