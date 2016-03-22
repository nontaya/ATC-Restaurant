package com.example.com1test.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{
    //Explicit
    public static final String database_name = "Atc.db";
    private static final int database_version = 1;

    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primery key, " +
            "User text, " +
            "Password text," +
            "Name text);";

    private static final String create_food_table = "create table foodTABLE (" +
            "_id integer primery key, " +
            "Food text, " +
            "Price text," +
            "Source text);";

    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_food_table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   //Main Class
