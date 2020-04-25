package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.clase3.util.Noticia;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String texto = intent.getStringExtra("nombre");

        Noticia noticia = (Noticia) intent.getSerializableExtra("noticia");

        TextView textView5 = findViewById(R.id.textView5);
        textView5.setText(noticia.getTitulo());


        TextView textView = findViewById(R.id.textView4);
        textView.setText(texto);

    }

    public void irAct1(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
