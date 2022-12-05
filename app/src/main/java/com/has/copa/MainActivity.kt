package com.has.copa


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class MainActivity : AppCompatActivity() {

    companion object {
        const val item = "Resultados dos Jogos da Dinamarca Copa 2022"
        const val SEARCH_PREFIX = "https://www.google.com/search?q="
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sendEscalacao(view: View) {
        val intent = Intent(this, GrupoD::class.java).apply {  }
        startActivity(intent)
    }

    fun verResultados(view: View) {
        val queryUrl: Uri= Uri.parse("${SEARCH_PREFIX}${item}")
        val intent=Intent(Intent.ACTION_VIEW, queryUrl)

        startActivity(intent)
    }
}