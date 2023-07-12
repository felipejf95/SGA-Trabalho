package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaEditarDisciplinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_editar_disciplina);

        Button btnFechar = findViewById(R.id.btnVoltar5);
        btnFechar.setOnClickListener(v -> {
            finish();
        });

    }
}