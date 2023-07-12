package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.trabalho.DAO.UsuarioDAO;
import com.example.trabalho.modelo.Usuario;

public class TelaPerfilVisualizacaoActivity extends AppCompatActivity {


    private UsuarioDAO meuDAO;


    @Override
    protected void onResume() {
        super.onResume();
        meuDAO.abrirBanco();
    }

    @Override
    protected void onPause() {
        super.onPause();
        meuDAO.fecharBanco();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil_visualizacao);
        meuDAO = new UsuarioDAO(this);

        String matricula = getIntent().getStringExtra("matricula");
        Usuario usr = meuDAO.buscarModeloPorMatricula(matricula);



        Button btnFechar = findViewById(R.id.btnVoltar);
        btnFechar.setOnClickListener(v -> {
            finish();
        });


        Button btnEditarPerfil = findViewById(R.id.btnEditarPerfil);
        btnEditarPerfil.setOnClickListener(v -> {
            // Lógica para abrir a Activity desejada
            Intent intent2 = new Intent(TelaPerfilVisualizacaoActivity.this, TelaPerfilEdicaoActivity.class);
            intent2.putExtra("matricula", matricula);
            startActivity(intent2);
        });


    }



}