public class Operadores {

    public static void main(String[] args){
       /*  String nomeCompleto = "LINGUAGEM" + "JAVA"; // operador de soma é usado para concatenar strings.
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); */

        // operadores unários

        int numero = 5;
        System.out.println(- numero); //não afeta a variavel principal - saída -5
        //caso eu queria que altere o valor da variavel para negativo devemos
        System.out.println(numero); // saída 5
        numero = - numero; // alterando a variavel principal
        System.out.println(numero); // saída -5
        // para voltar a ser positivo podemos realizar umamultip´licação
        numero = numero * -1; // alterando a variável para positivo novamente
        System.out.println(numero); // saída 5

        // incremento de número de 2 em 2, 3 em 3, usamos a repetição.

        int num = 7;
        num++; // adicionar mais um numero a variavel
        // é a mesma coisa que fazer essa expressão: numero = numero +2;

        System.out.println(num); // saída 8 (teve o incremento em cima (num++))
        System.out.println(++ num); // saída 9 porque teve o incremento lá em cima
        System.out.println(num ++); // saída 9 porque teve o incremento lá em cima
        System.out.println(num); // saída 10 porque teve um novo incremento na linha de cima;

        // ainda podemos realizar o incremetno antes: System.out.println(++ numero); saída será 6
        // incremento depois: System.out.println(numero ++); ele imprime o numero e ao colocar outra saída ele executa e imprime o incremento.
        // a mesma regra se aplica ao decremento

        // negar expressões booleanas

        boolean variavel = true; // variavel original

        System.out.println(!variavel);
        //saída na tela será false - operador de negação.
        // para alterar a variavel reatribuimos com a negação.
        variavel = !variavel; // altera o valor original da variavel
        System.out.println(variavel); // saida sera false

        //operador ternario

        int a,b;
        a=5;
        b=6;
        String resultado = a==b ? "verdadeiro" : "falso";
        int resultadoInteiro = a==b ? 0 : 1; // podemos usar int também, não só string.
        System.out.println(resultado); // saída falso
        System.out.println(resultadoInteiro); // saída 1

        // forma abreviada usando o ternario
        // a expressão condicional sempre deve ser um booleano. (exempo de cima a==b)

        // operadores relacionais

        int n1 = 1;
        int n2 = 2;
        boolean simNão = n1 == n2;
        System.out.println("Número 1 é igual ao número 2? " + simNão);
        simNão = n1 != n2;
        System.out.println("Número 1 é diferente do número 2? " + simNão);
        simNão = n1 > n2;
        System.out.println("Número 1 é maior do que o número 2? " + simNão);
        simNão = n1 > n2;
        System.out.println("Número 1 é menor do que o número 2? " + simNão);

        if(n1 < n2){
        System.out.println("A nossa condição é verdadeira");
        } // condicional aplicada, se for verdadeira executa e imprime a informação dentro do bloco if.

        // podemos comparar textos e objetos além de numéricos.
        String nome1 = "Camila";
        String nome2 = "Camila";
        System.out.println(nome1 == nome2);

        // se for compara objeto por exemplo usamos o método equals.
        
        String nome3 = "Camila";
        String nome4 = new String("Camila");
        System.out.println(nome3.equals(nome4));

        // operador lógico and / or

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições são verdadeiras");
        }


    }
}