package com.example.at_fundamentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        var fazeEscolha = intent.getIntExtra("fazeEscolha", 0)

        if (fazeEscolha == 6){
            textViewEvento.text = "Ao bater com sua espada no escudo o corpo da besta se distorçe com o barulho e ela grita de dor colocando suas maos em sua cabeça proximo" +
                    "de onde deveriam ser aparentemente seus ouvidos voce aproveita a deixa e taca a espada como uma lança em seus olhos ficando metade da espada no local" +
                    "a craitura grita mais ainda de dor  balancando sua cabeça para os lados fazendo um enorme barulho de doer os ouvidos contudo voce não perde a oportunidade" +
                    "segura firme seu escudo coloco o outro braço atras para dar mais rigidez e corre em direção da mesma gritando para a criatura designar seu olho a voce" +
                    "então então voce pula para frente e bate com o escudo no cabo da fazendo ela entrar por inteiro atravessando-a, a criatura cai morta e voce retira sua espada" +
                    "com aquele sangue de cor esverdiada e corta sua cabeça para levar em direção a escola, voce sobrevive o restos das noites evitando conflitos e finalmente chega" +
                    "a tão esperada escola os raios de sol iluminam seu caminho e os fracos ventos gelados refrescam seu corpo cansado, dali começa nova jornada com novos desafios"
        }else{
            textViewEvento.text = "derrota"
        }

    }
}
