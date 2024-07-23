package list.OperacoesBasicas;

import java.util.List;

public class ListaTarefa {
// criada após a classe Tarefa
//atributo
private List<Tarefa> tarefaList;

// criar construtor para que sempre que chamar objeto dso tipo listaTarefa criar list vazia para adicionar elementos, remover etc.

public ListaTarefa(List<Tarefa> tarefaList) {
    this.tarefaList = new ArrayList<>();
}



}
