package com.example.trabalho.DAO;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.trabalho.modelo.Usuario;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UsuarioDAO {
    private SQLiteDatabase database;
    private MeuDBHelper dbHelper;



    public UsuarioDAO(Context context) {
        dbHelper = new MeuDBHelper(context);
    }

    public void abrirBanco() {
        database = dbHelper.getWritableDatabase();

    }

    public void fecharBanco() {
        dbHelper.close();
    }

    public void adicionarModelo(Usuario modelo) {


        if(Objects.isNull(buscarModeloPorMatricula(modelo.getMatricula()))){
            ContentValues values = modelo.getContentValues();
            database.insert("usuario_tb", null, values);
        } else {
            atualizarModelo(modelo);
        }

    }

    public List<Usuario> obterTodosModelos() {
        List<Usuario> modelos = new ArrayList<>();
        Cursor cursor = database.query("usuario_tb", null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            Usuario modelo = Usuario.buildCursor(cursor);
            modelos.add(modelo);
        }
        cursor.close();
        return modelos;
    }



    public void atualizarModelo(Usuario modelo) {
        ContentValues values = modelo.getContentValues();
        String whereClause = "matricula = ?";
        String[] whereArgs = {String.valueOf(modelo.getMatricula())};
        database.update(TabelasEnum.USUARIO_TB.getNomeTabela(), values, whereClause, whereArgs);
    }



    public Usuario buscarModeloPorMatricula(String matricula ) {
        Usuario modelo = null;

        Cursor cursor = database.query("usuario_tb", null, "matricula = ?", new String[]{String.valueOf(matricula)}, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            modelo = Usuario.buildCursor(cursor);
            cursor.close();
        }

        return modelo;
    }

    public void removerModelo(Usuario modelo) {
        String whereClause = "matricula = ?";
        String[] whereArgs = {String.valueOf(modelo.getMatricula())};
        database.delete(String.valueOf(TabelasEnum.USUARIO_TB), whereClause, whereArgs);
    }
}
