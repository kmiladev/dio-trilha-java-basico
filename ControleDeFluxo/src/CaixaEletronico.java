public class CaixaEletronico {
    
    // início escopo de método
    public static void main(String[] args) {

        // declaração de variáveis locais
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        // controle de fluxo    
        if(valorSolicitado < saldo) // se a condição for satisfatória, será executado o bloco dentro do if.
            saldo = saldo - valorSolicitado; // reatribuindo valor do saldo
            // caso a operação não seja satisfatória vai pular esse bloco e irá direto para o fluxo de impressão.

        System.out.println(saldo); // impressão do saldo atualizado.    
    }
    // fim escopo de método
}

// Estrutura condicional simples onde somente será executado
// o bloco do if se a condição for positiva ou verdadeira.