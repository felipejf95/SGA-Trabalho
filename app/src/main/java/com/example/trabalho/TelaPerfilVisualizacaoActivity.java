package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaPerfilVisualizacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil_visualizacao);


        Button btnFechar = findViewById(R.id.btnVoltar);
        btnFechar.setOnClickListener(v -> {
            finish();
        });


    }



}