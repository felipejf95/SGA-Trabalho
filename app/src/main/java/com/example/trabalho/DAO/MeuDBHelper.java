package com.example.trabalho.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.HashMap;

public class MeuDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "SGA.db";
    private static final int DATABASE_VERSION = 1;


    public MeuDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    }


    @Override
    public void onCreate(SQLiteDatabase db) {


            System.out.println("Nome da tabela: " + TabelasEnum.USUARIO_TB);
            String query = "CREATE TABLE "+TabelasEnum.USUARIO_TB+" (nome TEXT " +
                    ", matricula TEXT PRIMARY KEY" +
                    ", email TEXT" +
                    ", telefone TEXT" +
                    ", curso TEXT" +
                    ", dataInicioCurso TEXT" +
                    ", dataNascimento TEXT" +
                    ", cep TEXT" +
                    ", uf TEXT" +
                    ", logradouro TEXT" +
                    ", bairro TEXT" +
                    ", cidade TEXT" +
                    ", senha TEXT" +
                    ", isAluno INTEGER)";

            db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


            System.out.println("Nome da tabela: " + TabelasEnum.USUARIO_TB);
            String query = String.format("DROP TABLE IF EXISTS "+ TabelasEnum.USUARIO_TB);
            db.execSQL(query);


        onCreate(db);
    }
}
