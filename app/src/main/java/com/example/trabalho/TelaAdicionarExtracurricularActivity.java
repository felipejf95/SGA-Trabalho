package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaAdicionarExtracurricularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adicionar_extracurricular);

        Button btnFechar = findViewById(R.id.btnVoltar8);
        btnFechar.setOnClickListener(v -> {
            finish();
        });

        Button  btnAddExtra= findViewById(R.id.btnAddExtra);
        btnFechar.setOnClickListener(v -> {
            finish();
        });
    }
}