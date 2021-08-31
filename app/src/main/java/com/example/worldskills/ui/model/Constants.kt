package com.example.worldskills.ui.model

class Constants {
    companion object{

        val DB_NAME="ws"
        val DB_VERSION=1

        //CATEGORIA ID
        val TABLE_NAME_CATID = "categoriaid"
        val TABLE_COLUMN_1_CATID = "idCategoriaID"
        val TABLE_COLUMN_2_CATID = "nombre"
        val TABLE_COLUMN_3_CATID = "descripcion"
        val TABLE_COLUMN_4_CATID = "precio"
        val TABLE_COLUMN_5_CATID = "imagen"
        val TABLE_COLUMN_6_CATID_TABLE_COLUMN_1_CAT = "idCategoria"


        val TABLE_CREATE_CATID = " CREATE TABLE " + TABLE_NAME_CATID + " ( " +
                TABLE_COLUMN_1_CATID + " INTEGER PRIMARY KEY AUTOINCREMENT , " +
                TABLE_COLUMN_2_CATID + " TEXT NOT NULL  , " +
                TABLE_COLUMN_3_CATID + " TEXT NOT NULL  , " +
                TABLE_COLUMN_4_CATID + " TEXT NOT NULL  , " +
                TABLE_COLUMN_5_CATID + " INTEGER NOT NULL  , " +
                TABLE_COLUMN_6_CATID_TABLE_COLUMN_1_CAT + " INTEGER NOT NULL  ) "

        //CATEGORIA
        val TABLE_NAME_CAT = "categoria"
        val TABLE_COLUMN_1_CAT = "idCategoria"
        val TABLE_COLUMN_2_CAT = "categoria"
        val TABLE_COLUMN_3_CAT = "descripcion"
        val TABLE_COLUMN_4_CAT = "imagen"


        val TABLE_CREATE_CAT = " CREATE TABLE " + TABLE_NAME_CAT+ " ( " +
                TABLE_COLUMN_1_CAT + " INTEGER PRIMARY KEY AUTOINCREMENT , " +
                TABLE_COLUMN_2_CAT + " TEXT NOT NULL  , " +
                TABLE_COLUMN_3_CAT + " TEXT NOT NULL  , " +
                TABLE_COLUMN_4_CAT + " INTEGER NOT NULL  ) "


        //REGISTRO
        val TABLE_NAME_REG = "usuarios"
        val TABLE_COLUMN_1_REG = "id"
        val TABLE_COLUMN_2_REG = "nombre"
        val TABLE_COLUMN_3_REG = "ciudad"
        val TABLE_COLUMN_4_REG = "correo"
        val TABLE_COLUMN_5_REG = "contrasena"


        val TABLE_CREATE_REGISTRO = " CREATE TABLE " + TABLE_NAME_REG + " ( " +
                TABLE_COLUMN_1_REG + " INTEGER PRIMARY KEY AUTOINCREMENT , " +
                TABLE_COLUMN_2_REG + " TEXT NOT NULL  , " +
                TABLE_COLUMN_3_REG + " TEXT NOT NULL  , " +
                TABLE_COLUMN_4_REG + " TEXT NOT NULL  , " +
                TABLE_COLUMN_5_REG + " TEXT NOT NULL  ) "


    }
}