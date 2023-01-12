package com.example.christmas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView nombre;
    ImageView fondos;

    int messiLista[]={R.drawable.bobo_messi,R.drawable.messi_christmas2,R.mipmap.messi_christmas};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView postal = (CardView) findViewById(R.id.postal);
        postal.setBackgroundColor(100);


        fondos=(ImageView)findViewById(R.id.fondos);
        nombre=findViewById(R.id.Nom);

        Bundle b = getIntent().getExtras();

        nombre.setText(b.getString("nom"));

        Random rnd= new Random();

        int imagenEscogida=rnd.nextInt(messiLista.length);

        fondos.setImageResource(messiLista[imagenEscogida]);




    }
}