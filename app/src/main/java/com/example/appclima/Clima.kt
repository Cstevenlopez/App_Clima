package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.lang.Exception
import kotlin.math.log

class Clima : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clima)
        if(Network.hayRed(this))
        {

        }else{
            Toast.makeText(this, "No hay red",Toast.LENGTH_SHORT).show()
        }
    }
    fun solicitudHTTPVolley(url:String)
    {
        val queve =Volley.newRequestQueue(this)
        val solicitud = StringRequest(Request.Method.GET,url,Response.Listener<String>{
           response ->
            try{
                Log.d("ResultadoVolley",responde)
            } catch (e:Exception){

            }

        },Response.ErrorListener {

        })
    }
}