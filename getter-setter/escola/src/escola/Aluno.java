package escola;


// classe aluno padrão java beans, modelo padrão de objeto com seus estados.

public class Aluno{
    private String nome;
    private int idade;

    public String getNome (){
        return nome; // retorna as propriedades da linha 6.
    }
    public void setNome (String newNome){ // recebe um novo parametro
        nome = newNome; // diz que vai receber novo nome
    }
    public int getIdade (){
        return idade;
    }
    public void setIdade (int newIdade){
        this.idade = newIdade;
    }
}