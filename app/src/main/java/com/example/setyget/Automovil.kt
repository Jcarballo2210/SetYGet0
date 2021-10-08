package com.example.setyget

class Automovil(mar:String,col:String,pre:Int) {
    var marca = mar
    var color = col
    var precio = pre
    var velocidadMax = 0
        get() = field + 10
        set(value) {
            field = value
        }

    fun encender(){
        println("El auto se ha encendido")
    }
    fun apagar(){
        println("El vehiculo esta apagado")
    }

    fun acelerar(){
        println("El carro esta acelerando")
    }

    fun detener(){
        println("El coche se ha detenido")
    }
}