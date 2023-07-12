package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaEditarExtracurricularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_editar_extracurricular);

        Button btnFechar = findViewById(R.id.btnVoltar4);
        btnFechar.setOnClickListener(v -> {
            finish();
        });

    }
}