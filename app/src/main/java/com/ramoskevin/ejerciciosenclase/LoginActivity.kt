package com.ramoskevin.ejerciciosenclase

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    //Declaracion de variables
    //lateinit para iniciarlizar luego
    var buttonIngresar2 : Button? = null // No se usa en android
    lateinit var buttonIngresar: Button
    lateinit var editTextEmailAddress: EditText
    lateinit var editTextPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Zona de inicializacion de variables
        //buttonIngresar = findViewById(R.id.buttonIngresar)

        //Cambiar el nombre del action bar
        //setTittle
        val actionBar: ActionBar? = supportActionBar
        /*if(actionBar!= null){
            actionBar.title = "Otro texto adicional"
        }*/
        actionBar?.title = "Hola bb"
        actionBar!!.title = "oli"
        //para que no este en hardcore
        actionBar.setTitle(R.string.textActionBar)
        //se obtienen los values de strings
        actionBar.setTitle(getString(R.string.textActionBar))

        //var titulo = (actionBar?.title ?: "hola") + getString(R.string.textActionBar)
        //Dar funcionalidad al buton
        //Eventos clic
        /*buttonIngresar.setOnClickListener { miVista: View ->
            Toast.makeText(this, "Saludos a todos", Toast.LENGTH_LONG).show()
            miVista.setBackgroundColor(Color.GREEN)
        }*/
        //Llamar al boton para inicializar y cuando es llamado
        inicializador()
        inicializarBotones()
    }
    fun miOnclickSaludo(view:View?){

    }
    fun inicializador(){
        buttonIngresar = findViewById(R.id.buttonIngresar)
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress)
        editTextPassword = findViewById(R.id.editTextPassword)
    }
    fun inicializarBotones(){
        buttonIngresar.setOnClickListener {
            Toast.makeText(this, "Saludos a todos", Toast.LENGTH_LONG).show()
            buttonIngresar.setBackgroundColor(Color.GREEN)
        }
        editTextEmailAddress.setText("kevin.ramos01@epn.edu.ec")


    }
}