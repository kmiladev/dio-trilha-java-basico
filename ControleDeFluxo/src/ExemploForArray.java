public class ExemploForArray {
    public static void main(String[] args) {
        
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //enquanto o indice for menor que o tamanho do array vai implementar
        for ( int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
        }
    } 
    // para arrays e coleções usamos bastante o for each
    /*String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
     * for(String aluno ; alunos){
     * System.out.println("O nome do aluno é; " + aluno);}
     * Onde String aluno é o elemento e os dois pontos indicam que a cada interação de alunos o índice atual
     * vai atualizar o índice automaticamente desta variável.
      */
}
