package com.has.copa.data

import com.has.copa.R
import com.has.copa.model.Dinamarca

class Datasource {

    fun loadDinamarca(): List<Dinamarca> {
        return listOf(
            Dinamarca(R.string.jogador1),
            Dinamarca(R.string.jogador2),
            Dinamarca(R.string.jogador3),
            Dinamarca(R.string.jogador4)
        )
    }
}