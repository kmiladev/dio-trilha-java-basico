package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
// classe ListaTarefa criada após a classe Tarefa

//atributo
private List<Tarefa> tarefaList;

// criar construtor para que sempre que chamar objeto do tipo listaTarefa criar list vazia para adicionar elementos, 
//remover etc.

public ListaTarefa(List<Tarefa> tarefaList) {
    this.tarefaList = new ArrayList<>();
}

// implementar os métodos

//adicionando tarefa na list

public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
}
//removendo tarefa na list
/*criação do método com lista vazia
 * criação de laço de repetição para percorrer toda a lista
 * se percorrer e encontrar item igual parametro executa o tarefaList.removeAll
 */

public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();  // criacao de lista vazia tarefasParaRemover onde vai adicionar as tarefas conforme descrição do parâmetro.
    for(Tarefa t : tarefaList) {  // neste laço pego cada tarefa dentro do tarefaList
        if(t.getDescricao().equalsIgnoreCase(descricao)){  //se a descrição da tarefa for igual a descrição que está no parâmentro
            tarefasParaRemover.add(t);                     // eu vou adicionar o tarefasParaRemover onde vai percorrer toda a lista e comparar.
        }
    }
    tarefaList.removeAll(tarefasParaRemover); // remover todos os elementos repetidos 
}

// obter numero total de tarefas

public int obterNumeroTotalDeTarefas(){
    return tarefaList.size();
}

// obter descricoes tarefas

public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
}
}
