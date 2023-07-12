package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaEditarCursoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_editar_curso);

        Button btnFechar = findViewById(R.id.btnVoltar6);
        btnFechar.setOnClickListener(v -> {
            finish();
        });

    }
}