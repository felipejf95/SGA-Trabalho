package com.example.trabalho.modelo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Usuario {

        int id;
        String nome;
        String matricula;
        String email;
        String telefone;
        String curso;
        String dadaInicioCurso;
        String dataNascimento;
        String cep;
        String uf;
        String logradouro;
        String bairro;
        String cidade;
        String senha;




}
