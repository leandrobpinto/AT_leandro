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
import kotlinx.android.synthetic.main.fragment_primeira_fase.*
import kotlinx.android.synthetic.main.fragment_segunda_faze.*
import kotlinx.android.synthetic.main.fragment_segunda_faze.RbEscolha1
import kotlinx.android.synthetic.main.fragment_segunda_faze.RbEscolha2
import kotlinx.android.synthetic.main.fragment_segunda_faze.btnAvançar
import kotlinx.android.synthetic.main.fragment_segunda_faze.textViewEvento

/**
 * A simple [Fragment] subclass.
 */
class segundaFaze : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segunda_faze, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var fazeViewModel: FazeViewModel
        activity?.let {
            fazeViewModel = ViewModelProviders.of(it).get(FazeViewModel::class.java)

        }

        if(fazeViewModel.faze!!.fazeEscolha == 1){
            textViewEvento.text = "Uma sabia escolha... Sem muito conhecimento da criatura voce tenta apenas atingila com seu escudo, assim que voce corre na direção" +
                    "dela, a mesma lhe olha com um olhar um tanto quanto distante, seu olhar não parece estar designiado a voce mas mesmo assim a criatura avança" +
                    "com uma de suas garras em sua direção(como um soco) numa enorme rapidez, acertando seu escudo em cheio segurando o impacto. Por sorte voce estava com" +
                    "seu escudo a sua frente, ou seria um golpe direto e prejudicial ou ate fatal, bem continuando... a criatura fica sem se mover, nem parece que esta respirando" +
                    "voce começa a suar, sua mão transpira de nervosismo(afinal e sua primeira luta real), aperta o cabo de sua espada para ter mais firmeza e pensa na sua proxima jogada?"
            RbEscolha1.text = "Se aproximar devegar sem fazer movimentos bruscos e dar uma estocada no peito da criatura"
            RbEscolha2.text = "Bater a espada no escudo no intuito de atrair a criatura para uma armadilha"

            btnAvançar.setOnClickListener {
                if (!RbEscolha1.isChecked && !RbEscolha2.isChecked ) {
                    Toast.makeText(
                        activity!!.baseContext!!,
                        "Marque todas opções",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    if (RbEscolha1.isChecked){

                        fazeViewModel.faze!!.fazeEscolha = 4
                        findNavController().navigate(R.id.terceiraFaze)
                        //perder vida
                    }else{

                        fazeViewModel.faze!!.fazeEscolha = 6
                        val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                        var fazeEscolha = fazeViewModel.faze.fazeEscolha
                        intent.putExtra("fazeEscolha", fazeEscolha)
                        startActivity(intent)
                    }
                }
            }
        }

        if(fazeViewModel.faze!!.fazeEscolha == 2){
            textViewEvento.text = "Sem muita experiencia voce tenta imobilizar a criatura ou apenas tentar dificultar a moviementação dela de alguma forma, bem as" +
                    "pernas são um otimo alvo entao sem nem pensar 2 vezes voce corre em direção a criatura mas um inexperado acontece, ela parece que percebe sua intenção" +
                    "e rapidamente vira o rosto para voce so que a mesma parece não estar olhando diretamente para voce o que lhe faz se distrair e um ataque frontal é dirigido a voce" +
                    "sem muito tempo de preparado voce apenas coloco o seu escudo em sua frente e segura o ataque, mas o impacto e forte e o faz cair andar para tras alem disso braço" +
                    "tambem não parece muito legal apos essa rapida defesa. A criatura parece não se mover, esta como se estivesse procurando por algo, talvez uma forma de fugir?" +
                    "voce? bem voce esta bem na frente dela então não faria muito sentido, logo voce pensa, causar alguma distração ja que em questão de velocidade voce perderia" +
                    "logo uma abertura seria essencial para voce"
            RbEscolha1.text = "tacar o escudo em direção a criatura como distração e em seguida deferir uma estocada direta em seu peito"
            RbEscolha2.text = "Bater a espada no escudo no intuito de atrair a criatura para uma armadilha"

            btnAvançar.setOnClickListener {
                if (!RbEscolha1.isChecked && !RbEscolha2.isChecked ) {
                    Toast.makeText(
                        activity!!.baseContext!!,
                        "Marque todas opções",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    if (RbEscolha1.isChecked){

                        fazeViewModel.faze!!.fazeEscolha = 4
                        findNavController().navigate(R.id.terceiraFaze)
                    }else{

                        fazeViewModel.faze!!.fazeEscolha = 3
                        findNavController().navigate(R.id.terceiraFaze)
                    }
                }
            }
        }


    }

}
