package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    boolean isAluno = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnAbrirActivity = findViewById(R.id.btnEntrar);
        btnAbrirActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para abrir a Activity desejada
                Intent intent = null;
                if(isAluno)
                 intent = new Intent(MainActivity.this,
                        TelaPrincipalAlunoActivity.class);
                else{
                    intent = new Intent(MainActivity.this,
                            TelaPrincipalAdmActivity.class);
                }

              if(Objects.nonNull(intent))
                startActivity(intent);
            }
        });
    }
}