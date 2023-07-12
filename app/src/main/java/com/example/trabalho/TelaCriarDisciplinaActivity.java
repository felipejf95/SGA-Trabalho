package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaCriarDisciplinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_criar_disciplina);

        Button btnFechar = findViewById(R.id.btnVoltar7);
        btnFechar.setOnClickListener(v -> {
            finish();
        });

        Button btnAddDisciplina = findViewById(R.id.btnAddDisciplina);
        btnFechar.setOnClickListener(v -> {
            finish();
        });
    }
}