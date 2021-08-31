package com.example.worldskills.ui.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(
    context: Context?
) : SQLiteOpenHelper(context, Constants.DB_NAME, null, Constants.DB_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Constants.TABLE_CREATE_REGISTRO)
        db?.execSQL(Constants.TABLE_CREATE_CAT)
        db?.execSQL(Constants.TABLE_CREATE_CATID)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}
