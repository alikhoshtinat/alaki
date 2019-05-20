package com.example.market.modelview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseAccess extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "shopping.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db;

    public SQLiteDatabase getDb() {
        return db;
    }

    public void setDb(SQLiteDatabase db) {
        this.db = db;
    }

    public DatabaseAccess(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        db = getWritableDatabase();


    }
}
