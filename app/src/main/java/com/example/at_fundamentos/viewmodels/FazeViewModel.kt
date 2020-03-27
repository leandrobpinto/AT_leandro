package com.example.at_fundamentos.viewmodels

import androidx.lifecycle.ViewModel
import com.example.at_fundamentos.models.Faze
import java.io.Serializable

class FazeViewModel : ViewModel(), Serializable {
    var faze : Faze = Faze()
}