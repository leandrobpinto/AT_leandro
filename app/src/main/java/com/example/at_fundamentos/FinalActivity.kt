package com.example.at_fundamentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        var fazeEscolha = intent.getIntExtra("fazeEscolha", 0)

        if (fazeEscolha == 5){
            textViewEvento.text ="Apos seu ultimo pulo voce em seu despero taca o escudo para a outra direção de uma forma que a criatura fique de costas para voce" +
                    "  e bem pensado ela cai na armadilha e corre em direção ao escudo assim que cai no chão mas nunca é ser confiante ingenuo e confiante como um novo aventureiro" +
                    " voce corre para as costas da besta sem perceber o seu terreno pisa em um pedaço de graveto atiçando a atenção da criatura em sua direção voce, tenta" +
                    " freiar mas e tarde suas garras ja tinham atravessado seu peito voce olha com dor para a aberração é com odio por não conseguir salvar seu povo morre" +
                    " servindo de alimento para uma besta"

        }else if (fazeEscolha == 6){
            textViewEvento.text = "Ao bater com sua espada no escudo o corpo da besta se distorçe com o barulho e ela grita de dor colocando suas maos em sua cabeça proximo" +
                    " de onde deveriam ser aparentemente seus ouvidos voce aproveita a deixa e taca a espada como uma lança em seus olhos ficando metade da espada no local" +
                    " a craitura grita mais ainda de dor  balancando sua cabeça para os lados fazendo um enorme barulho de doer os ouvidos contudo voce não perde a oportunidade" +
                    " segura firme seu escudo coloco o outro braço atras para dar mais rigidez e corre em direção da mesma gritando para a criatura designar seu olho a voce" +
                    " então então voce pula para frente e bate com o escudo no cabo da fazendo ela entrar por inteiro atravessando-a, a criatura cai morta e voce retira sua espada" +
                    " com aquele sangue de cor esverdiada e corta sua cabeça para levar em direção a escola, voce sobrevive o restos das noites evitando conflitos e finalmente chega" +
                    " a tão esperada escola os raios de sol iluminam seu caminho e os fracos ventos gelados refrescam seu corpo cansado, dali começa nova jornada com novos desafios"
        }else if (fazeEscolha == 7){
            textViewEvento.text = "Colocando sua outra mão no cabo da espada de forma veloz voce tenta cortar o pescoço da criatura, porem ao fazer força" +
                    " seu braço não estava em 100% devido a defesa inesperada que teve que fazer lhe fazendo sentir uma certa dor e quando voce percebe ja é tarde" +
                    " as garras afiadas da craitura atravessam seu peito saindo pelas suas costas, o tempo para, ali voce percebeu o quão cruel é o mundo" +
                    " contudo ao menos morre com um sorriso no rosto de alguem que ao menos morreu lutando pelo seu povo"
        }else if (fazeEscolha == 8){
            textViewEvento.text = "Seu braço esta machucado não seria bom depender dele, então lhe resta apenas uma escolha, voce puxa sua espada para tras cortando" +
                    " mais ainda o pescoço da criatando fazendo um tipo de serra, voce usa toda sua forma e tudo que lhe sobrou naquele instante era tudo ou nada, entao..." +
                    " apos o ato as garras da craitura param bem na frente de seu peito apenas alguns pequenos centrimos quem sabe o teria acontecido se voce esperasse mais" +
                    " alguns pequneos milesimos, logo a criatura chega finalmente ao seu duvido lugar, no inferno a criatura cai morta e voce retira sua espada" +
                    " com aquele sangue de cor esverdiada e corta sua cabeça para levar em direção a escola, voce sobrevive o restos das noites evitando conflitos e finalmente chega" +
                    " a tão esperada escola os raios de sol iluminam seu caminho e os fracos ventos gelados refrescam seu corpo cansado, dali começa nova jornada com novos desafios"
        }else if(fazeEscolha == 9){
            textViewEvento.text = "Assim entao a criatura se aproxima rapidamente e voce se prepara e disferece seu golpe lateral contudo, esquece que esta num corredor" +
                    " de árvores e sua espada bate na árvore e fica presa com seu braço esticado deixando sua guarda bem aberta, a besta então ao escutar esse barulho" +
                    " ataque seu braço com suas garras e corta seu braço fora voce cai de joelhos gritando de dor, a besta se aproxima de seu rosto e corta seu pescoço fazendo" +
                    " sua cabeça rolar"

        }else if (fazeEscolha == 10){
            textViewEvento.text = "No momento certo voce desfere sua estocada para a criatura...sua espada atravessa seu enorme olho e para ter certeza que ela morreu" +
                    " voce gira o cabo da sua espada para a direita com forca rotacionando sua espada dentro do olho a criatura cai morta e voce retira sua espada" +
                    " com aquele sangue de cor esverdiada e corta sua cabeça para levar em direção a escola, voce sobrevive o restos das noites evitando conflitos e finalmente chega" +
                    " a tão esperada escola os raios de sol iluminam seu caminho e os fracos ventos gelados refrescam seu corpo cansado, dali começa nova jornada com novos desafios"

        }else
            textViewEvento.text =  "nenhum final encontrado para essa opção"
    }
}
