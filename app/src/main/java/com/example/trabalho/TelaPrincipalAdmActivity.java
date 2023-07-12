package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TelaPrincipalAdmActivity extends AppCompatActivity {
    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal_adm);

        Button btnAdmAddCurso = findViewById(R.id.btnAdmAddCurso);
        btnAdmAddCurso.setOnClickListener(v -> {
            // Lógica para abrir a Activity desejada
            intent = new Intent(TelaPrincipalAdmActivity.this, TelaAdicionarCursoActivity.class);
            startActivity(intent);
        });

        Button btnAdmAddDisciplina = findViewById(R.id.btnAdmAddDisciplina);
        btnAdmAddCurso.setOnClickListener(v -> {
            // Lógica para abrir a Activity desejada
            intent = new Intent(TelaPrincipalAdmActivity.this, TelaCriarDisciplinaActivity.class);
            startActivity(intent);
        });
    }
}