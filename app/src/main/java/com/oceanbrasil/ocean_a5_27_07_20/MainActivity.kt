package com.oceanbrasil.ocean_a5_27_07_20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

// View
class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(ContadorViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: Implementar o DataBinding

        textView.setOnClickListener {
            viewModel.contador.contar()

            // TODO: Resolver problema de chamar a mesma função para atualizar
            // TODO: o texto mais de uma vez
            atualizarExibicaoTexto()
        }

        // TODO: Resolver
        atualizarExibicaoTexto()
    }

    private fun atualizarExibicaoTexto() {
        // TODO: Mudar abordagem
        textView.text = "Texto clicado: ${viewModel.contador.exibir()}"
    }

/*
// Persistência de dados utilizando savedInstanceState
var i = 0

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    textView.text = "Texto inicial"

    if (i > 0) {
        atualizarExibicaoTexto()
    }

    textView.setOnClickListener {
        i++

        atualizarExibicaoTexto()
    }
}

override fun onPostCreate(savedInstanceState: Bundle?) {
    super.onPostCreate(savedInstanceState)

    if (i > 0) {
        atualizarExibicaoTexto()
    }
}

override fun onSaveInstanceState(outState: Bundle) {
    outState.putInt("CONTADOR", i)
    super.onSaveInstanceState(outState)
}

override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    super.onRestoreInstanceState(savedInstanceState)
    i = savedInstanceState.getInt("CONTADOR")
}

private fun atualizarExibicaoTexto() {
    textView.text = "Texto clicado: $i"
}
*/
}
