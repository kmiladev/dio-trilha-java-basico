public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //se a gente escrever os tipos assim:
        //short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto = numeroNormal; //esse erro ocorre pois o numeroNormal tem precisao maior do que o numeroCurto.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto = (short) numeroNormal; // realizar uma adaptacao para colocar um valor com possível precisao maior pára uma precisao menor vc tem ciencia. casting
    
        // variável
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // constante
        final double VALOR_DE_PI = 3.14; // variável constante não pode mais ser alterado seu valor.


        //estudar tipos primitivos
        // estudar classes String

    }
}
