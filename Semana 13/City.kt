package edu.co.icesi.firestorestruct

data class City (
    val name:String?="",
    val state:String?="",
    val country:String?="",
    val population:Int=0,
    val regions:ArrayList<String>? = ArrayList()
)