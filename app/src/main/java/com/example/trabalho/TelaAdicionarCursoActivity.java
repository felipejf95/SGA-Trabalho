package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaAdicionarCursoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adicionar_curso);

        Button btnFechar = findViewById(R.id.btnVoltar9);
        btnFechar.setOnClickListener(v -> {
            finish();
        });

        Button btnAddCurso = findViewById(R.id.btnAddCurso);
        btnFechar.setOnClickListener(v -> {
            finish();
        });
    }
}