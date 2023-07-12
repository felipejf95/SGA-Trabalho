package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.trabalho.DAO.UsuarioDAO;
import com.example.trabalho.modelo.Usuario;

public class TelaPerfilVisualizacaoActivity extends AppCompatActivity {


    private UsuarioDAO meuDAO;
    Intent intent;
    EditText edtNome ;
    EditText edtMatricula;
    EditText edtemail;
    EditText edtTelefone ;
    EditText edtCurso ;
    EditText edtDataInicioCurso;
    EditText edtDataNascimento;
    EditText edtCep ;
    EditText edtUF ;
    EditText edtLogradouro ;
    EditText edtBairro ;
    EditText edtCidade ;



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
        Usuario usr = null;
        if(!matricula.isEmpty()){
            meuDAO.abrirBanco();
            usr = meuDAO.buscarModeloPorMatricula(matricula);
            meuDAO.fecharBanco();
        }
        else{
            finish();
        }

        edtNome = findViewById(R.id.edtNome);
        edtMatricula = findViewById(R.id.edtMatricula);
        edtemail = findViewById(R.id.edtemail);
        edtCurso = findViewById(R.id.edtCurso);
        edtDataInicioCurso = findViewById(R.id.edtDataInicioCurso);
        edtDataNascimento = findViewById(R.id.edtDataNascimento);
        edtCep =  findViewById(R.id.edtCep);
        edtUF =  findViewById(R.id.edtUF);
        edtLogradouro =  findViewById(R.id.edtLogradouro);
        edtBairro =  findViewById(R.id.edtBairro);
        edtCidade =  findViewById(R.id.edtCidade);



        edtNome.setText(usr.getNome().trim());
        edtMatricula.setText(usr.getMatricula().trim());
        edtemail.setText(usr.getEmail().trim());
        edtCurso.setText(usr.getCurso().trim());
        edtDataInicioCurso.setText(usr.getDadaInicioCurso().trim());
        edtDataNascimento.setText(usr.getDataNascimento().trim());
        edtCep.setText(usr.getCep().trim());
        edtUF.setText(usr.getUf().trim());
        edtLogradouro.setText(usr.getLogradouro().trim());
        edtBairro.setText(usr.getBairro().trim());
        edtCidade.setText(usr.getCidade().trim());


        Button btnFechar = findViewById(R.id.btnVoltar);
        btnFechar.setOnClickListener(v -> {
            finish();
        });


        Button btnEditarPerfil = findViewById(R.id.btnEditarPerfil);
        btnEditarPerfil.setOnClickListener(v -> {
            // Lógica para abrir a Activity desejada
            intent = new Intent(TelaPerfilVisualizacaoActivity.this, TelaPerfilEdicaoActivity.class);
            intent.putExtra("matricula", matricula);
            startActivity(intent);
        });


    }



}