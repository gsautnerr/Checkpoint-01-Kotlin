package carreiras.com.github.orgs.ui.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.model.Produto


//O adapter é um componente do RecyclerView que conecta seus dados à visualização da lista.
// Ele é responsável por criar viewHolder, associar dados e determinar o tamanho da lista

class ListaProdutosAdapter(private val produtos: List<Produto>) :

    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

//    override fun getItemCount(): Int {
//        return produtos.size
//    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
