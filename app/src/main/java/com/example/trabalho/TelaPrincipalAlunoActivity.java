package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipalAlunoActivity extends AppCompatActivity {

    Intent intent;
    String matricula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal_aluno);

         matricula = getIntent().getStringExtra("matricula");


        Button btnAtividades = findViewById(R.id.btnAtividades);
        btnAtividades.setOnClickListener(v -> {
            intent = new Intent(TelaPrincipalAlunoActivity.this, ProgressoDisciplinasActivity.class);
            intent.putExtra("matricula", matricula);
            startActivity(intent);
        });


        Button btnPerfil = findViewById(R.id.btnPerfilAluno);
        btnPerfil.setOnClickListener(v -> {
            // Lógica para abrir a Activity desejada
            intent = new Intent(TelaPrincipalAlunoActivity.this, TelaPerfilVisualizacaoActivity.class);
            intent.putExtra("matricula", matricula);
            startActivity(intent);
        });
    }


}