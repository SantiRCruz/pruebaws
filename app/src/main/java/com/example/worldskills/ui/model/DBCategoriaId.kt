package com.example.worldskills.ui.model

data class DBCategoriaId(
    var idCategoriaID :String  = "",
    var nombre:String  = "",
    var descripcion:String  = "",
    var precio:String  = "",
    var imagen:Int  = 0,
    var idCategoria:DBCategorias = DBCategorias()
)
