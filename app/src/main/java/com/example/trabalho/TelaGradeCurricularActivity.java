package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TelaGradeCurricularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_grade_curricular);

        Button btnFechar = findViewById(R.id.btnVoltar2);
        btnFechar.setOnClickListener(v -> {
            finish();
        });
    }
}