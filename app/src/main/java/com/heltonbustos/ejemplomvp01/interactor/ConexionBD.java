package com.heltonbustos.ejemplomvp01.interactor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionBD extends SQLiteOpenHelper {
    public ConexionBD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL("create table usuarios(user text primary key, nombre text, pass text)");

        bd.execSQL("create table equipos( id int primary key, marca text, modelo text, fecha text, equipo boolean, cargador boolean, manual boolean, garantia boolean, cargaSO boolean, monitorOK boolean, audioOK boolean, touchpadOK boolean,foto1 text, foto2 text )" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
