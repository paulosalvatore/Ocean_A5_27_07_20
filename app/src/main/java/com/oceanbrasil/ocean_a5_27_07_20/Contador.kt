package com.oceanbrasil.ocean_a5_27_07_20

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

// Model
class Contador(
    val tempoInicio: Int = 1000,
    quantidade: Int = 0
): BaseObservable() {

    // 2ª maneira de fazer
    @get:Bindable
    var quantidade = quantidade
        set(value) {
            field = value
            notifyPropertyChanged(BR.quantidade)
        }

    fun contar(quantidadeContar: Int = 1) {
        quantidade += quantidadeContar
    }
}
