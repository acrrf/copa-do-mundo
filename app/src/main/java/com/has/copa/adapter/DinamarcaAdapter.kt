package com.has.copa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.has.copa.R
import com.has.copa.model.Dinamarca
import org.w3c.dom.Text

class DinamarcaAdapter (private val context: Context,
                        private val dataset: List<Dinamarca>):
    RecyclerView.Adapter<DinamarcaAdapter.DinamarcaViewHolder>() {

    class DinamarcaViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.jogador_imagem)
        val nomeView: TextView = view.findViewById(R.id.item_nome)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DinamarcaViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_dinamarca, parent, false)

        return DinamarcaViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DinamarcaViewHolder, position: Int) {
        val item = dataset[position]

        holder.nomeView.text = context.resources.getString(item.nomeResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}