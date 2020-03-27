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
            textViewEvento.text = "Voce logo da seu primeiro passa na grama seca e dura, a besta parece designar o olhar em sua direção mais uma vez aquele olhar perdido" +
                    "mas com a direção da cabeça precisa... mas... como? voca da seu segundo passo e em instantes a besta da um bote em sua direção voce esquiva dando um pulo" +
                    "para a direitae assim que encosta novamente no chão a besta pula em sua direção e esse ciclo continua ate que sua fadiga está chegando ao fim voce consegue" +
                    "apenas dar mais alguns pulos,a adrenalina, pressão, logo voce para analisar a situação enquanto ainda foge da craitura e percebe que a criatura se move atravez do som por isso seus ataques precisos" +
                    "e olhares tão mortos, voce percebe que consegue apenas dar mais um pulo mantendo essa velocidade 1 passo em falso e talvez voce não sobreviva ao proxima ataque..."
            RbEscolha1.text = "Fazer um forte barulho batendo a espada no escudo para tentar ensurdecer a criatura então ataca-la"
            RbEscolha2.text = "Tacar o escudo para o lado contrario em que voce esta pulando a fazendo ficar de costas para voce e entao desferir um ataque em suas costas"


        }

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

                    //perder vida
                }else{

                    fazeViewModel.faze!!.fazeEscolha = 5
                    val intent = Intent(activity!!.baseContext, FinalActivity::class.java)
                    var fazeEscolha = fazeViewModel.faze.fazeEscolha
                    intent.putExtra("fazeEscolha", fazeEscolha)
                    startActivity(intent)

                }
            }
        }

    }

}
