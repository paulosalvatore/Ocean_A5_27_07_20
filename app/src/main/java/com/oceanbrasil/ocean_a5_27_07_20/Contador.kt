package com.oceanbrasil.ocean_a5_27_07_20

import androidx.lifecycle.MutableLiveData

// Model
data class Contador(
    private val quantidadeInicial: Int = 0
) {
    val quantidade = MutableLiveData<Int>()

    init {
        quantidade.value = quantidadeInicial
    }

    fun contar(quantidadeContar: Int = 1) {
        val valorAtual = quantidade.value!!
        quantidade.value = valorAtual + quantidadeContar
    }
}
