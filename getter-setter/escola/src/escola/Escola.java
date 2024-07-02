package escola;

public class Escola {
    public static void main(String[] args) throws Exception {
        Aluno felipe = new Aluno(); // criação de objeto
        felipe.setNome ("Felipe"); // definição de atributos
        felipe.setIdade(8);       // definição de atributos

    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos!" ); // obter os atributos para printar na tela

    }
}
