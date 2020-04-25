package com.example.clase3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clase3.util.Noticia;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("textoPrueba", "hola mundo");

        setContentView(R.layout.activity_main);

        String textoMostrar = "Bienvenidos estimados alumnos";

        TextView textView1 = findViewById(R.id.textView1);

        Toast t = Toast.makeText(this, textoMostrar, Toast.LENGTH_LONG);

        textView1.setText(textoMostrar);

        String textoTextView = textView1.getText().toString();


        Log.e("textoPantalla", textView1.getText().toString());
        Log.d("textoPantalla", textView1.getText().toString());
        Log.i("textoPantalla", textView1.getText().toString());
        Log.v("textoPantalla", textView1.getText().toString());
        Log.w("textoPantalla", textView1.getText().toString());

        t.show();

        Button buttonFullJava = findViewById(R.id.buttonFullJava);
        buttonFullJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Texto desde el botón Full Java",Toast.LENGTH_SHORT).show();
            }
        });

        buttonFullJava.setOnClickListener(new gestionBoton());

        Button buttonAbrirAct2 = findViewById(R.id.buttonAbrirAct2);
        buttonAbrirAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                EditText editText = findViewById(R.id.editTextNombre);
                String texto = editText.getText().toString();

                Noticia noticia = new Noticia();
                noticia.setTitulo("mensaje del presi");
                noticia.setDescripcion("cantidad de contagiados");

                intent.putExtra("nombre",texto);
                intent.putExtra("noticia",noticia);

                startActivity(intent);
            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);


    }

    class gestionBoton implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"Texto desde el botón Full Java con inner class",Toast.LENGTH_SHORT).show();
        }
    }


    public void mostrarToastPrueba(View view){
        Toast.makeText(this,"Texto desde el botón Java con UI",Toast.LENGTH_SHORT).show();
    }

}
