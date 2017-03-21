package com.example.android.dept_management;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Shuvo on 2/20/2017.
 */

public class TeacherInfo extends SQLiteOpenHelper {
    public static final String DataBaseName="teacher.db";
    public static final String TableName="teachertable";
    public static final String Col_1="Name";
    public static final String Col_2="Rank";
    public static final String Col_3="Mob";
    public static final String Col_4="Email";
    public static final String Col_5="Course";
    public static final String Col_6="Paper";


    public TeacherInfo(Context context) {
        super(context, DataBaseName, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table"+TableName+"(Name Text,Rank Text,Mob Text,Email Text, Course Text,Paper Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists"+TableName);
        onCreate(db);

    }
    public boolean insertData(String nm,String rnk,String mob,String email,String cors,String papr){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col_1,nm);
        contentValues.put(Col_2,rnk);
        contentValues.put(Col_3,mob);
        contentValues.put(Col_4,email);
        contentValues.put(Col_5,cors);
        contentValues.put(Col_6,papr);
      long result=  db.insert(TableName,null,contentValues);
        if (result==-1)
            return false;
        else
            return true;


    }
}
