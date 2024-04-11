package carreiras.com.github.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.R
import carreiras.com.github.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

//Aqui foi declarada a MainActivity (Activity Principal). Nesse caso ela está herdando os métodos da super classe Activity,
// classe que possui os principais métodos para o funcionamento da aplicação.
// Na classe Main Activity tambem encontram-se o metodo onCreate(), tendo o override fun onCreate(savedInstanceSatate: Bundle?),
// que é um metodo chamado ao ser criado uma activity, sendo um metodo de ciclo de vida de uma activiy.
// Temos tambem o super.onCreate(savedInstanceState), responsavel pela chamada do onCreate() da classe ComponentActivity,
// que garante a activity inicia com o comportamento padrão antes de qualquer customização.

class MainActivity : Activity() {

    // O Bundle é uma classe que nos permite salvar e transmitir dados entre componentes, possibilitando tambem a
    // preservação de estados e contextos, com ela Melhorando a jornada do usúario conseguir voltar de onde parou
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding: processo de vinculação do código fonte com o arquivo de layout.
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas")
//        nome.text = "Cesta de frutas"

//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e uva"

//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()
    }
}