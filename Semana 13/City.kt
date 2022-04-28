package edu.co.icesi.firestorestruct

data class City (
    var name:String="",
    var state:String="",
    var country:String="",
    var population:Int=0,
    var regions:ArrayList<String> = ArrayList()
)
