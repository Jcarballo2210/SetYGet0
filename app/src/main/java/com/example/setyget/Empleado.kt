package com.example.setyget

class Empleado {
   /* private var edad = 0
    private var nombre:String?=null*/

    var edad = 0
        get() = field
        set(value) {
            if(value>=18 && value<=80){
                 field = value
                println("Tienes la edad para trabajar")
            }else if(value<18){
                println("Todavia no tienes la edad para trabajar")
            }else{
                println("Eres demaciado viejo para trabajar")
            }
        }

    var nombre:String?=null
        get() = field?.toUpperCase()
        set(value) {
            if(value!!.isEmpty()) {
                println("El nombre debe de tener texto")
            }else{
                field = value

            }
        }

    /*
    public fun setEdad(_edad:Int){
        if(_edad>=18 && _edad<=80){
            edad=_edad
        }else if(_edad<18){
            println("Todavia no tienes la edad para trabajar")
        }else{
            println("Eres demaciado viejo para trabajar")
        }
    }
    public fun setNombre(_nombre:String){
        if(_nombre?.isEmpty()){
            println("El nombre debe de tener texto")
        }else{
            nombre = _nombre
        }
    }*/

}