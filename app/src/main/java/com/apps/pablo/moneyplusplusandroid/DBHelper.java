package com.apps.pablo.moneyplusplusandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pablo on 06/04/15.
 */
public class DBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "MoneyDB.sqlite";
    private static final int DB_SCHEME_VERSION = 1;

    public DBHelper(Context context) {
        super(context,DB_NAME,null,DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        for(String q : DBManager.ingresos){
            db.execSQL(q);
        }
        for(String r : DBManager.gastos){
            db.execSQL(r);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
