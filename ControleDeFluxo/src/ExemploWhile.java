
import java.util.concurrent.ThreadLocalRandom; // classe para simular valores aleatorios
// pessoa realizando compras de doces, enquanto o valor permitir ele vai adicionando ao carrinho

public class ExemploWhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;
        while(mesada > 0){  // enquanto mesada for maior que 0
            Double valorDoce = valorAleatorio(); // vai pegar uma compra com valor aleatorio.
            if(valorDoce > mesada) // se valor do doce for maior que a mesada
                valorDoce = mesada; // automaticamente estamos tornando o valor do doce igual a mesada para nao precisar fazer novas verificações
            
        System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce; // enquanto valorAleatorio atender a correspondencia positiva executa mesada e subtrae o valor do doce até igualar a 0;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    private static double valorAleatorio(){ // método criado para auxiliar a chegar no valor aleatório
        return ThreadLocalRandom.current().nextDouble(2, 8); // retorna double  e a classe TheradLocal para dar um valor entre 2 e 8 apenas para ilustrar um valor aleatorio;
    }// o 2 e o 8 representaria o valor dos doces.
}
