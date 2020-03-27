package com.example.at_fundamentos.models;

import androidx.lifecycle.MutableLiveData;

import java.io.Serializable;

public class Faze2 implements Serializable {

    private int fazeEscolha;
    private MutableLiveData<Integer> barraVida;
    public Faze2(){
        fazeEscolha = 0;
    }


    public int getFazeEscolha() {
        return fazeEscolha;
    }

    public void setFazeEscolha(int fazeEscolha) {
        this.fazeEscolha = fazeEscolha;
    }


    public MutableLiveData<Integer> getCurrentName() {
        if (barraVida == null) {
            barraVida = new MutableLiveData<Integer>();
        }
        return barraVida;
    }


}

