import java.util.Random; // importacao da classe random para atender o método 

public class ExemploDoWhile {
    public static void main(String[] args) {
        
        // enquanto joão estiver tocando o telefone vai ficar aguardando atender, quando atender o do vai ser interrompido e parte para a etapa de conversação.
        // vai executar o do enquanto a expressão for verdadeira. Precisa executar ao menos uma vez
        System.out.println("Discando...");
        do { 
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
            
        } while (tocando());

        System.out.println("Alô !!!");

    }
    private static boolean tocando(){  // método booleando para dizer se está tocando ou não
        boolean atendeu = new Random().nextInt(3) == 1; // se nesse valor entre 1 e 3 for = 1 ele atendeu
        System.out.println("Atendeu? " + atendeu); // se ele atendeu abaixo digo que nao esta mais tocando
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
