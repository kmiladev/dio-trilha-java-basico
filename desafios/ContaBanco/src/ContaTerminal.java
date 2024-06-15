import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        
        Scanner scanner = new java.util.Scanner(System.in );
        
        System.out.println("Por favor, informe seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        String conta = scanner.next();

        System.out.println("Informe o valor de depósito incial: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + "e seu saldo : " + saldo + " já está disponível para saque.");
    
        scanner.close();

    }
}
