public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        
        Pessoa marcos = new Pessoa("Marcos", "123"); // objeto instanciado com duas informações previamente estabelecidas. Sempre será obrigatório instanciar o objeto com esses parâmetros solicitados.

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }
}
