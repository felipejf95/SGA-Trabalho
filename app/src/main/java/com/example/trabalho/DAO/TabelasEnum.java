package com.example.trabalho.DAO;


public enum TabelasEnum {


    USUARIO_TB("usuario_tb");

    private final String nomeTabela;

    TabelasEnum(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }

    public String getNomeTabela() {
        return nomeTabela;
    }

}
