package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaConsultarExtracurricularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_extracurricular);

        Button btnFechar = findViewById(R.id.btnVoltar3);
        btnFechar.setOnClickListener(v -> {
            finish();
        });
    }
}