package com.example.at_fundamentos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.example.at_fundamentos.R
import com.example.at_fundamentos.viewmodels.FazeViewModel
import kotlinx.android.synthetic.main.fragment_primeira_fase.*
import kotlinx.android.synthetic.main.fragment_progress_bar.*

/**
 * A simple [Fragment] subclass.
 */
class progressBar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_progress_bar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var fazeViewModel: FazeViewModel
        activity?.let {
            fazeViewModel = ViewModelProviders.of(it).get(FazeViewModel::class.java)

            fazeViewModel.faze.barraVida.observe(viewLifecycleOwner, Observer {
                progressBarVida.progress = it

            })

//            val nameObserver = Observer<String> { newName ->
//                // Update the UI, in this case, a TextView.
//                textView.text = newName
//            }
//
//            // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
//            fazeViewModel.faze!!.currentName.observe(viewLifecycleOwner, nameObserver)
//            btnAvançar.setOnClickListener {
//                val anotherName = "John Doe"
//                fazeViewModel.faze.currentName.setValue(anotherName)
//            }

            }
        }


}

