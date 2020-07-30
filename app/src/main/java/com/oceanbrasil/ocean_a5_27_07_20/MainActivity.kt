package com.oceanbrasil.ocean_a5_27_07_20

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.oceanbrasil.ocean_a5_27_07_20.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

// View
class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(ContadorViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        // 1ª maneira de fazer
        binding.visibilidade = View.VISIBLE

        binding.viewModel = viewModel

        // TODO: Implementar o DataBinding

//        textView.setOnClickListener {
//            viewModel.contador.contar()
//        }

        button.setOnClickListener {
            viewModel.contador.contar(5)
        }

//        viewModel.contador.quantidade.observe(this, Observer {
//            Log.d("LIVE_DATA", "Dado atualizado para $it")

//            textView.text = "Contador: $it"

//            binding.quantidadeInt = it
//        })
    }

    fun contar(view: View) {
        viewModel.contador.contar()
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
