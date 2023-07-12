package com.example.trabalho.modelo;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;

import java.util.Objects;


public class Usuario {



        String nome;
        String matricula;
        String email;
        String telefone;
        String curso;
        String dataInicioCurso;
        String dataNascimento;
        String cep;
        String uf;
        String logradouro;
        String bairro;
        String cidade;
        String senha;
        Integer isAluno;

        public Usuario(int id, String nome, String matricula, String email, String telefone, String curso, String dadaInicioCurso, String dataNascimento, String cep, String uf, String logradouro, String bairro, String cidade, String senha, Integer isAluno) {

                this.nome = nome;
                this.matricula = matricula;
                this.email = email;
                this.telefone = telefone;
                this.curso = curso;
                this.dataInicioCurso = dadaInicioCurso;
                this.dataNascimento = dataNascimento;
                this.cep = cep;
                this.uf = uf;
                this.logradouro = logradouro;
                this.bairro = bairro;
                this.cidade = cidade;
                this.senha = senha;
                this.isAluno = isAluno;
        }


        private Usuario(Builder builder) {

                this.nome = builder.nome;
                this.matricula = builder.matricula;
                this.email = builder.email;
                this.telefone = builder.telefone;
                this.curso = builder.curso;
                this.dataInicioCurso = builder.dataInicioCurso;
                this.dataNascimento = builder.dataNascimento;
                this.cep = builder.cep;
                this.uf = builder.uf;
                this.logradouro = builder.logradouro;
                this.bairro = builder.bairro;
                this.cidade = builder.cidade;
                this.senha = builder.senha;
                this.isAluno = builder.isAluno;
        }

        public Usuario() {

        }


        public static class Builder {
                private int id;
                private String nome;
                private String matricula;
                private String email;
                private String telefone;
                private String curso;
                private String dataInicioCurso;
                private String dataNascimento;
                private String cep;
                private String uf;
                private String logradouro;
                private String bairro;
                private String cidade;
                private String senha;
                private Integer isAluno;

                public Builder id(int id) {
                        this.id = id;
                        return this;
                }

                public Builder nome(String nome) {
                        this.nome = nome;
                        return this;
                }

                public Builder matricula(String matricula) {
                        this.matricula = matricula;
                        return this;
                }

                public Builder email(String email) {
                        this.email = email;
                        return this;
                }

                public Builder telefone(String telefone) {
                        this.telefone = telefone;
                        return this;
                }

                public Builder curso(String curso) {
                        this.curso = curso;
                        return this;
                }

                public Builder dataInicioCurso(String dataInicioCurso) {
                        this.dataInicioCurso = dataInicioCurso;
                        return this;
                }

                public Builder dataNascimento(String dataNascimento) {
                        this.dataNascimento = dataNascimento;
                        return this;
                }

                public Builder cep(String cep) {
                        this.cep = cep;
                        return this;
                }

                public Builder uf(String uf) {
                        this.uf = uf;
                        return this;
                }

                public Builder logradouro(String logradouro) {
                        this.logradouro = logradouro;
                        return this;
                }

                public Builder bairro(String bairro) {
                        this.bairro = bairro;
                        return this;
                }

                public Builder cidade(String cidade) {
                        this.cidade = cidade;
                        return this;
                }

                public Builder senha(String senha) {
                        this.senha = senha;
                        return this;
                }

                public Builder isAluno(Integer isAluno) {
                        this.isAluno = isAluno;
                        return this;
                }
                public Usuario build() {
                        return new Usuario(this);
                }


        }

        public ContentValues getContentValues(){
                ContentValues values = new ContentValues();
                values.put("nome", this.getNome());
                values.put("matricula", this.getMatricula());
                values.put("email", this.getEmail());
                values.put("telefone", this.getTelefone());
                values.put("curso", this.getCurso());
                values.put("dataInicioCurso", this.getDadaInicioCurso());
                values.put("dataNascimento", this.getDataNascimento());
                values.put("cep", this.getCep());
                values.put("uf", this.getUf());
                values.put("logradouro", this.getLogradouro());
                values.put("bairro", this.getBairro());
                values.put("cidade", this.getCidade());
                values.put("senha", this.getSenha());
                values.put("isAluno", this.getAluno());

                return values;
        }
        @SuppressLint("Range")
        public static Usuario buildCursor(Cursor cursor){
                Usuario  usr = new Usuario();


                usr.setNome(cursor.getString(cursor.getColumnIndex("nome")));
                usr.setMatricula(cursor.getString(cursor.getColumnIndex("matricula")));
                usr.setEmail(cursor.getString(cursor.getColumnIndex("email")));
                usr.setTelefone(cursor.getString(cursor.getColumnIndex("telefone")));
                usr.setCurso(cursor.getString(cursor.getColumnIndex("curso")));
                usr.setDataInicioCurso(cursor.getString(cursor.getColumnIndex("dataInicioCurso")));
                usr.setDataNascimento(cursor.getString(cursor.getColumnIndex("dataNascimento")));
                usr.setCep(cursor.getString(cursor.getColumnIndex("cep")));
                usr.setUf(cursor.getString(cursor.getColumnIndex("uf")));
                usr.setLogradouro(cursor.getString(cursor.getColumnIndex("logradouro")));
                usr.setBairro(cursor.getString(cursor.getColumnIndex("bairro")));
                usr.setCidade(cursor.getString(cursor.getColumnIndex("cidade")));
                usr.setSenha(String.valueOf(cursor.getColumnIndex("senha")));
                usr.setAluno(cursor.getColumnIndex("isAluno"));


                return usr;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getMatricula() {
                return matricula;
        }

        public void setMatricula(String matricula) {
                this.matricula = matricula;
        }

        public String getEmail() {
                return  Objects.isNull(email)?"":this.email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getTelefone() {
                return  Objects.isNull(telefone)?"":this.telefone;
        }

        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }

        public String getCurso() {
                return   Objects.isNull(curso)?"":this.curso;
        }

        public void setCurso(String curso) {
                this.curso = curso;
        }

        public String getDadaInicioCurso() {
                return  Objects.isNull(dataInicioCurso)?"":this.dataInicioCurso;
        }

        public void setDataInicioCurso(String dataInicioCurso) {
                this.dataInicioCurso = dataInicioCurso;
        }

        public void setDataNascimento(String dataNascimento) {
                this.dataNascimento = dataNascimento;
        }

        public String getCep() {
                return    Objects.isNull(cep)?"":this.cep;
        }

        public void setCep(String cep) {
                this.cep = cep;
        }

        public String getUf() {
                return   Objects.isNull(uf)?"":this.uf;
        }

        public void setUf(String uf) {
                this.uf = uf;
        }

        public String getLogradouro() {
                return  Objects.isNull(logradouro)?"":this.logradouro ;
        }

        public void setLogradouro(String logradouro) {
                this.logradouro = logradouro;
        }

        public String getBairro() {
                return Objects.isNull(bairro)?"":this.bairro ;
        }

        public void setBairro(String bairro) {
                this.bairro = bairro;
        }

        public String getCidade() {
                return Objects.isNull(cidade)?"":this.cidade;
        }

        public void setCidade(String cidade) {
                this.cidade = cidade;
        }

        public String getSenha() {
                return Objects.isNull(senha)?" ":this.senha;
        }

        public void setSenha(String senha) {
                this.senha = senha;
        }

        public Integer getAluno() {
                return Objects.isNull(isAluno)?1:this.isAluno;
        }

        public void setAluno(int aluno) {
              this.isAluno = aluno ;
        }


        public String getNome() {
                return nome;
        }

        public String getDataNascimento(){
                return this.dataNascimento;
        }
}
