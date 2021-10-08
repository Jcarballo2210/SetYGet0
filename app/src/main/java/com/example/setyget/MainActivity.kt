package com.example.setyget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //empleado()

        automovil()
    }

    fun empleado(){
        var e1=Empleado()
        e1.edad=20
        println("La edad de la empleada es: "+e1.edad)
        e1.nombre="Laura"
        println("El nombre de nuestra empleada es: "+e1.nombre)
    }

    fun automovil(){
        var toyota:Automovil = Automovil("Toyota","Negro",4000)
        println("El vehiculo que tienes es "+toyota.marca+" Su color es ${toyota.color}")
        println("Su precio es $${toyota.precio}")
        toyota.apagar()

        toyota.velocidadMax = 80
        println("la velocidad maxima alcanza fue: "+toyota.velocidadMax)

        var honda = Automovil("Honda", "Gris", 6000)
        honda.encender()
    }

}