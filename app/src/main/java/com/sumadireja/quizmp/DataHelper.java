package com.sumadireja.quizmp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "quizzzz";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table course(courseid integer primary key, nama text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO course (courseid, nama) VALUES ('1', 'Imron');";
        db.execSQL(sql);

        sql = "create table major(majorid integer primary key, nama text null);";
        Log.d("Data1", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO major (majorid, nama) VALUES('11', 'Imron');";
        db.execSQL(sql);

        sql = "create table student(studentid integer primary key, nama text null, majorid integer);";
        Log.d("Data2", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO student(studentid, nama, majorid) VALUES ('111', 'Imron', '11');";
        db.execSQL(sql);

        sql = "create table studentcourse(runningid integer primary key, nama text null, courseid integer, grade text not null);";
        Log.d("Data3", "onCreate3: "+ sql);
        db.execSQL(sql);
        sql = "INSERT INTO studentcourse(runningid, nama, courseid, grade) VALUES ('1111', 'Imron', '111', 'A');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }
}
