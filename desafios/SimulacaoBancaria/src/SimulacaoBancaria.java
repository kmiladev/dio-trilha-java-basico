import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("------- Bem vindes ao Banco JAVA -------");
        System.out.println("Menu de opções");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Encerrar");
        System.out.println("Informe a opção desejada: ");
              


        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Informe o valor a ser depositado; ");
                    double valorDepositado = scanner.nextDouble(); 
                    saldo += valorDepositado;
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Informe o valor a ser sacado; ");
                    double valorSacado = scanner.nextDouble(); 
                    saldo-=valorSacado;
                    if(valorSacado > saldo){
                        System.out.println("Saldo Insuficiente");
                    }else
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Consultar o valor do saldo atual ");
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}