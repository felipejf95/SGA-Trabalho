package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.example.trabalho.DAO.UsuarioDAO;
import com.example.trabalho.modelo.Usuario;

public class TelaPerfilEdicaoActivity extends AppCompatActivity {

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
    Boolean isCadastro = false;

    Usuario usr;
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


    EditText edtSenha;
    EditText edtSenha1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil_edicao);

        isCadastro = Boolean.valueOf(getIntent().getBooleanExtra("isCadastro",false));
        meuDAO = new UsuarioDAO(this);

        edtNome = findViewById(R.id.edtNome);
        edtMatricula = findViewById(R.id.edtMatricula);
        edtemail = findViewById(R.id.edtemail);
        edtTelefone = findViewById(R.id.edtTelefone) ;
        edtCurso = findViewById(R.id.edtCurso);
        edtDataInicioCurso = findViewById(R.id.edtDataInicioCurso);
        edtDataNascimento = findViewById(R.id.edtDataNascimento);
        edtCep =  findViewById(R.id.edtCep);
        edtUF =  findViewById(R.id.edtUF);
        edtLogradouro =  findViewById(R.id.edtLogradouro);
        edtBairro =  findViewById(R.id.edtBairro);
        edtCidade =  findViewById(R.id.edtCidade);
        edtSenha = findViewById(R.id.edtSenha);
        edtSenha1 = findViewById(R.id.edtSenha1);


        if(isCadastro){
            edtNome.setText("");
            edtMatricula.setText("");
            edtemail.setText("");
            edtTelefone.setText("");
            edtCurso.setText("");
            edtDataInicioCurso.setText("");
            edtDataNascimento.setText("");
            edtCep.setText("");
            edtUF.setText("");
            edtLogradouro.setText("");
            edtBairro.setText("");
            edtCidade.setText("");

        }else {

            Usuario usr = meuDAO.buscarModeloPorMatricula(String.valueOf(edtMatricula.getText()));

        }





        Button btnFechar = findViewById(R.id.btnVoltar);
        btnFechar.setOnClickListener(v -> {
            finish();
        });

        Button btnSalvar = findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(v -> {
                //if(edtSenha.getText().equals(edtSenha1.getText()) && !String.valueOf(edtMatricula.getText()).isEmpty()){

                    boolean isSalvou = false;
                    try {
                        meuDAO.abrirBanco();
                        Usuario usr = new Usuario.Builder()
                                                .matricula(String.valueOf(edtMatricula.getText()))
                                                .nome((String.valueOf(edtNome.getText())))
                                                .email(String.valueOf(edtemail.getText()))
                                                .telefone(String.valueOf(edtTelefone.getText()))
                                                .curso(String.valueOf(edtCurso.getText()))
                                                .dataInicioCurso(String.valueOf(edtDataInicioCurso.getText()))
                                                .dataNascimento(String.valueOf(edtDataNascimento.getText()))
                                                .cep(String.valueOf(edtCep.getText()))
                                                .uf(String.valueOf(edtUF.getText()))
                                                .logradouro(String.valueOf(edtLogradouro.getText()))
                                                .bairro(String.valueOf(edtBairro.getText()))
                                                .cidade(String.valueOf(edtCidade.getText()))
                                                .senha(String.valueOf(edtSenha.getText()))
                                                .isAluno(1)
                                                .build();

                        meuDAO.adicionarModelo(usr);

                        isSalvou = true;
                    }catch (Exception e){
                        Log.d("Log TelaPerfilEdicaoActivity Erro ao cadastrar/Alterar Usuário ",e.getMessage().toString());
                    }

                    meuDAO.fecharBanco();

                    if(isSalvou)
                        finish();

             //   }
        });
    }
}