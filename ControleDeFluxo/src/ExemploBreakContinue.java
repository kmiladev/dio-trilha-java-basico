public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for (int numero = 1; numero <= 5; numero ++) {
            if(numero == 3)
            break;
            
        System.out.println(numero);       
        }

        // por mais que a nossa condição determine de 1 a 5 e a condição chega no 3
        // ele interrompe todo o for.
        // printa no terminal 1 e 2 apenas
        // se colocar continue no lugar do break ele vai printar na tela 1 2 4 5
        // apenas alterou  fluxo da interação daquele momento e não interrompe o for totalmente.
        /*
         * for (int numero = 1; numero <= 5; numero ++) {
            if(numero == 3)
            break;
            
            System.out.println(numero);
         */
    }
}
