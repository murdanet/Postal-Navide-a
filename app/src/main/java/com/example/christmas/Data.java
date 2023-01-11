package com.example.christmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Data extends AppCompatActivity {

    Button generator;
    EditText nom,cognom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nom=findViewById(R.id.nom);
        generator=findViewById(R.id.generator);

        generator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Data.this, MainActivity.class);
                i.putExtra("nom", nom.getText().toString());
                startActivity(i);
            }
        });



    }
}