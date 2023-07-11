package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipalAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal_aluno);

        Button btnAtividades = findViewById(R.id.btnAtividades);
        btnAtividades.setOnClickListener(v -> {
            Intent intent = new Intent(TelaPrincipalAlunoActivity.this, ProgressoDisciplinasActivity.class);
            startActivity(intent);
        });


        Button btnPerfil = findViewById(R.id.btnPerfilAluno);
        btnPerfil.setOnClickListener(v -> {
            // Lógica para abrir a Activity desejada
            Intent intent = new Intent(TelaPrincipalAlunoActivity.this, TelaPerfilVisualizacaoActivity.class);
            startActivity(intent);
        });
    }


}