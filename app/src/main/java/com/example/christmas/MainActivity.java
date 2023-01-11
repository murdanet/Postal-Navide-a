package com.example.christmas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nombre;
    TextView apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView postal = (CardView) findViewById(R.id.postal);
        postal.setBackgroundColor(100);

        nombre=findViewById(R.id.Nom);

        Bundle b = getIntent().getExtras();

        nombre.setText(b.getString("nom"));



    }
}