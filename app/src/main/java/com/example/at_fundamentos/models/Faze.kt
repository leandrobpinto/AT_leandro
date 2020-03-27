package com.example.at_fundamentos.models

import androidx.lifecycle.MutableLiveData
import java.io.Serializable

class Faze : Serializable {
    var fazeEscolha = 0
    var barraVida =  MutableLiveData<Int>().apply {  value =  100}



}