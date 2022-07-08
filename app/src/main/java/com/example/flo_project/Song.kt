package com.example.flo_project

data class Song(
    val title : String = "",
    val signer : String = "",
    var second : Int = 0,
    var playTime : Int = 0,
    var isPlaying : Boolean = false
)
