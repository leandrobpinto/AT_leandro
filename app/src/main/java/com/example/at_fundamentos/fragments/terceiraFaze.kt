package com.example.at_fundamentos.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.at_fundamentos.FinalActivity

import com.example.at_fundamentos.R
import com.example.at_fundamentos.viewmodels.FazeViewModel
import kotlinx.android.synthetic.main.fragment_terceira_faze.*

/**
 * A simple [Fragment] subclass.
 */
class terceiraFaze : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_terceira_faze, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var fazeViewModel: FazeViewModel
        activity?.let {
            fazeViewModel = ViewModelProviders.of(it).get(FazeViewModel::class.java)

        }
        if(fazeViewModel.faze!!.fazeEscolha == 4){
            textViewEvento.text = "Voce logo da seu primeiro passa na grama seca e dura, a besta parece designar o olhar em sua direção mais uma vez aquele olhar perdido " +
                    "mas com a direção da cabeça precisa... mas... como? voca da seu segundo passo e em instantes a besta da um bote em sua direção voce esquiva dando um pulo " +
                    "para a direitae assim que encosta novamente no chão a besta pula em sua direção e esse ciclo continua ate que sua fadiga está chegando ao fim voce consegue " +
                    "apenas dar mais alguns pulos,a adrenalina, pressão, logo voce para analisar a situação enquanto ainda foge da craitura e percebe que a criatura se move atravez do som por isso seus ataques precisos " +
                    "e olhares tão mortos, voce percebe que consegue apenas dar mais um pulo mantendo essa velocidade 1 passo em falso e talvez voce não sobreviva ao proxima ataque... "
            RbEscolha1.text = "Fazer um forte barulho batendo a espada no escudo para tentar ensurdecer a criatura então ataca-la "
            RbEscolha2.text = "Tacar o escudo para o lado contrario em que voce esta pulando a fazendo ficar de costas para voce e entao desferir um ataque em suas costas "

        btnAvançar.setOnClickListener {
            if (!RbEscolha1.isChecked && !RbEscolha2.isChecked ) {
                Toast.makeText(
                    activity!!.baseContext!!,
                    "Marque todas opções",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                if (RbEscolha1.isChecked){

                    fazeViewModel.faze!!.fazeEscolha = 6
                    val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                    var fazeEscolha = fazeViewModel.faze.fazeEscolha
                    intent.putExtra("fazeEscolha", fazeEscolha)
                    startActivity(intent)


                }else{

                    fazeViewModel.faze!!.fazeEscolha = 5
                    val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                    var fazeEscolha = fazeViewModel.faze.fazeEscolha
                    intent.putExtra("fazeEscolha", fazeEscolha)
                    startActivity(intent)
                    //morte

                }
            }
        }
    }
        if(fazeViewModel.faze!!.fazeEscolha == 7){
            textViewEvento.text = "Dito e feito voce taca seu escudo na altura do rosto da besta e acompanha seu escudo vindo logo atras com sua espada apoiada na sua" +
                    " cinturado lado esquerdo segurando com ambas as mãos assim que o escudo chega proximo da criatura ela se abaixa e rapidamente olha em sua direção avançando junto" +
                    " mas voce ja estava preparado e pula para o lado direito entao uma oportunidade aparece a criatura esta indefesa deste lado, um golpe na horizontal é executado cravando" +
                    " sua espada no pescoço da criatura ela parece parar de se mover, aparentemente morreu... mas seria facil demais não é mesmo? voce percebe que seus dedos se juntam" +
                    " direcionando todas suas garras na altura de seu peito, bem sua ultima escolha oq ue vai fazer pequeno aventureiro?"
            RbEscolha1.text = "usar seu outro braço para ter mais força e cortar a cabeça da criatura de vez"
            RbEscolha2.text = "Puxas sua espada para tras cortando o pescoço da besta como um bife"

            btnAvançar.setOnClickListener {
                if (!RbEscolha1.isChecked && !RbEscolha2.isChecked ) {
                    Toast.makeText(
                        activity!!.baseContext!!,
                        "Marque todas opções",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    if (RbEscolha1.isChecked){

                        fazeViewModel.faze!!.fazeEscolha = 7
                        val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                        var fazeEscolha = fazeViewModel.faze.fazeEscolha
                        intent.putExtra("fazeEscolha", fazeEscolha)
                        startActivity(intent)


                    }else{

                        fazeViewModel.faze!!.fazeEscolha = 8
                        val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                        var fazeEscolha = fazeViewModel.faze.fazeEscolha
                        intent.putExtra("fazeEscolha", fazeEscolha)
                        startActivity(intent)
                        //morte

                    }
                }
            }
        }

    if(fazeViewModel.faze!!.fazeEscolha == 8){
        textViewEvento.text = "A quantidade de ávores pode são descentes, voce decide procurar um corredor de árvores ou pedras mesmo que a criatura seja burra, surda," +
                " cega ou seila o que ela não tera pra onde fugir o que me resta uma confronto frente a frente, então voce corre batendo com a espada nas ávores " +
                " fazendo a criatura ataca-las e não forcar so em seus passos ate achar uma otima oportunidade, e não demorou muito uma sequencia de 5 árvores e achada" +
                " bem proximas formando uma unica passagem, freiando então olhando para a reta da criatura voce se prepara e..."
        RbEscolha1.text = "Faço um corta lateral acertando assim seu pescoço"
        RbEscolha2.text = "Faço uma estocada em linha reta na intenção de acertar a criatura assim que ela chegar em voce"


        btnAvançar.setOnClickListener {
            if (!RbEscolha1.isChecked && !RbEscolha2.isChecked ) {
                Toast.makeText(
                    activity!!.baseContext!!,
                    "Marque todas opções",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                if (RbEscolha1.isChecked){

                    fazeViewModel.faze!!.fazeEscolha = 9
                    val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                    var fazeEscolha = fazeViewModel.faze.fazeEscolha
                    intent.putExtra("fazeEscolha", fazeEscolha)
                    startActivity(intent)

                    //morte
                }else{

                    fazeViewModel.faze!!.fazeEscolha = 10
                    val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                    var fazeEscolha = fazeViewModel.faze.fazeEscolha
                    intent.putExtra("fazeEscolha", fazeEscolha)
                    startActivity(intent)


                }
            }
        }
    }
    }
}
