package com.has.copa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.has.copa.adapter.DinamarcaAdapter
import com.has.copa.data.Datasource


class GrupoD : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grupo_d)

        val myDataset = Datasource().loadDinamarca()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = DinamarcaAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}