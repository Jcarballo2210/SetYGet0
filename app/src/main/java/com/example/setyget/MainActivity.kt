package com.example.setyget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        empleado()
    }

    fun empleado(){
        var e1=Empleado()
        e1.edad=19
        println("La edad de la empleada es: "+e1.edad)
        e1.nombre="Laura"
        println("El nombre de nuestra empleada es: "+e1.nombre)
    }
}