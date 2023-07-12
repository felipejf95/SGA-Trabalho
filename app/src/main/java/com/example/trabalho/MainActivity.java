package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trabalho.DAO.MeuDBHelper;
import com.example.trabalho.DAO.TabelasEnum;
import com.example.trabalho.DAO.UsuarioDAO;
import com.example.trabalho.modelo.Usuario;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    boolean isAluno = true;
    Intent intent = null;
    TextView edtLogin;
    TextView edtSenha;

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
        setContentView(R.layout.activity_main);

        meuDAO = new UsuarioDAO(this);

        System.out.println(TabelasEnum.USUARIO_TB);

        TextView txtCriarConta = findViewById(R.id.txtCriarConta);
         edtLogin = findViewById(R.id.edtLogin);
         edtSenha = findViewById(R.id.edtSenha);


        txtCriarConta.setOnClickListener(v -> {

            intent = new Intent(MainActivity.this,
                    TelaPerfilEdicaoActivity.class);
            intent.putExtra("isCadastro", true);

            if(Objects.nonNull(intent))
                startActivity(intent);

        });

        Button btnEntrar = findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = null;
                Usuario usr = meuDAO.buscarModeloPorMatricula(edtLogin.getText().toString());

                if(Objects.nonNull(usr) && usr.getSenha().trim().equalsIgnoreCase(edtSenha.getText().toString().trim())){

                    isAluno = usr.getAluno()!=0 ? true:false;


                    if(isAluno){
                        intent = new Intent(MainActivity.this,
                                TelaPrincipalAlunoActivity.class);
                    }
                    else{
                        intent = new Intent(MainActivity.this,
                                TelaPrincipalAdmActivity.class);
                    }


                    if(Objects.nonNull(intent)){
                        intent.putExtra("matricula", edtLogin.getText().toString().trim());
                        startActivity(intent);
                    }



                }else{
                    Toast.makeText(MainActivity.this, "Usuario ou senha incorretos!", Toast.LENGTH_LONG).show();
                }


            }
        });
    }

    // Exemplo de uso do CRUD
    private void exemploCRUD() {
        // Adicionar modelo

        meuDAO.abrirBanco();
        Usuario modelo = new Usuario.Builder().nome("Douglas").matricula("36036180").isAluno(1).senha("1234").build();
        meuDAO.adicionarModelo(modelo);

        // Obter todos os modelos
        List<Usuario> modelos = meuDAO.obterTodosModelos();
        for (Usuario m : modelos) {
            Log.d("Modelo", "MATRICULA: " + m.getMatricula() + ", Nome: " + m.getNome() + ", Data de Nascimento: " + m.getDataNascimento());
        }

        // Atualizar modelo
//        Usuario modeloAtualizado = new Usuario(1, "Maria", "11/11/1988");
//        meuDAO.atualizarModelo(modeloAtualizado);

        meuDAO.fecharBanco();
        // Remover modelo
       // meuDAO.removerModelo(modeloAtualizado);
    }
}