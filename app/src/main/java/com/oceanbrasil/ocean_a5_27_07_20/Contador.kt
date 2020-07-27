package com.oceanbrasil.ocean_a5_27_07_20

// Model
data class Contador(
    private var quantidade: Int
) {
    fun contar() {
        quantidade++
    }

    fun exibir() = quantidade
}
