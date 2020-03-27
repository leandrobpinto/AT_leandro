package com.example.at_fundamentos.models

import androidx.lifecycle.MutableLiveData
import java.io.Serializable

class Faze : Serializable {
    var fazeEscolha = 0
    var barraVida =  MutableLiveData<Int>().apply {  value =  100}

    fun perderVida(){

        barraVida.apply { value -= 10 }
    }

//    val currentName: MutableLiveData<Int>
//        get() {
//            if (barraVida == null) {
//                barraVida = MutableLiveData()
//            }
//            return barraVida!!
//        }

}