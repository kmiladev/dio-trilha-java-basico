import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        // Exibir as mensagens para o usuário
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem final da conta criada.
        Scanner scanner = new java.util.Scanner(System. in );
        
        System.out.println("Por favor, informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.println("Informe o valor de depósito incial: ");
        Double saldo = scanner.nextDouble();




        System.out.println("Olá," + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + "e seu saldo : " + saldo + "já está disponível para saque.");
    }
}
/* Exemplo para entender meu erro
package desafio_dio_conta_bancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: (1234)");
		numero = sc.nextInt();

		System.out.println("Agora digite o número da Agência: (123-8)");
		agencia = sc.next();

		System.out.println("Me informe seu nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();
	}

} */
