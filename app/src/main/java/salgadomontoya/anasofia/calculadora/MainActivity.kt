package salgadomontoya.anasofia.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numero0: Button= findViewById(R.id.Numero0) as Button
        var numero1: Button= findViewById(R.id.Numero1) as Button
        var numero2: Button= findViewById(R.id.Numero2) as Button
        var numero3: Button= findViewById(R.id.Numero3) as Button
        var numero4: Button= findViewById(R.id.Numero4) as Button
        var numero5: Button= findViewById(R.id.Numero5) as Button
        var numero6: Button= findViewById(R.id.Numero6) as Button
        var numero7: Button= findViewById(R.id.Numero7) as Button
        var numero8: Button= findViewById(R.id.Numero8) as Button
        var numero9: Button= findViewById(R.id.Numero9) as Button
        val suma: Button= findViewById(R.id.mas) as Button
        val resta: Button= findViewById(R.id.menos) as Button
        val multiplicacion: Button= findViewById(R.id.multi) as Button
        val division: Button= findViewById(R.id.divi) as Button
        val resultado: Button= findViewById(R.id.resultado) as Button
        val borrar: Button= findViewById(R.id.borrar) as Button
        val mostrar: TextView = findViewById(R.id.mostrar) as TextView
        val operaciones: TextView = findViewById(R.id.ingresa) as TextView
        val valor: String
        val operador: String
        val valor2: String

        numero0.setOnClickListener(){

            valor= mostrar.getText().toString()
            valor= valor + "0"
            mostrar.setText(valor)
        }
        numero1.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "1"
            mostrar.setText(valor)
        }
        numero2.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "2"
            mostrar.setText(valor)

        }
        numero3.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "3"
            mostrar.setText(valor)

        }
        numero4.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "4"
            mostrar.setText(valor)

        }
        numero5.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "5"
            mostrar.setText(valor)

        }
        numero6.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "6"
            mostrar.setText(valor)

        }
        numero7.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "7"
            mostrar.setText(valor)

        }
        numero8.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "8"
            mostrar.setText(valor)

        }
        numero9.setOnClickListener(){
            valor= mostrar.getText().toString()
            valor= valor + "9"
            mostrar.setText(valor)

        }
        suma.setOnClickListener(){
            valor= mostrar.getText().toString().toFloat()
            operador= "+"
            valor2= valor + operador
            operaciones.setText(valor2)
            mostrar.setText("")

        }
        resta.setOnClickListener(){
            valor= mostrar.getText().toString().toFloat()
            operador= "-"
            valor2= valor + operador
            operaciones.setText(valor2)
            mostrar.setText("")

        }
        multiplicacion.setOnClickListener(){
            valor= mostrar.getText().toString().toFloat()
            operador= "*"
            valor2= valor + operador
            operaciones.setText(valor2)
            mostrar.setText("")
        }
        division.setOnClickListener(){
            valor= mostrar.getText().toString().toFloat()
            operador= "/"
            valor2= valor + operador
            operaciones.setText(valor2)
            mostrar.setText("")

        }

        resultado.setOnClickListener(){
            valor= mostrar.getText().toString().toInt()
            if(operador.equals("+")) {
                mostrar= valor2.toFloat() + operaciones.getText().toString().toFloat()

            }
            if(operador.equals("-")) {
                mostrar= valor2.toFloat() - operaciones.getText().toString().toFloat()
                }

            if(operador.equals("*")) {
                mostrar= valor2.toFloat() * operaciones.getText().toString().toFloat()

            }
            if(operador.equals("/")) {
                mostrar= valor2.toFloat() / operaciones.getText().toString().toFloat()

            }
            operaciones.setText(String.valueof(mostrar)).toFloat()
            mostrar.setText(String.valueof(mostrar)).toFloat()

        }

        borrar.setOnClickListener(){
        mostrar.setText("")
        operaciones.setText("")

        }
    }

}
