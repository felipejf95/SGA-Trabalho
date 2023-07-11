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

        Button btnAbrirActivity = findViewById(R.id.btnAtividades);
        btnAbrirActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para abrir a Activity desejada
                Intent intent = new Intent(TelaPrincipalAlunoActivity.this, ProgressoDisciplinasActivity.class);
                startActivity(intent);
            }
        });
    }
}