public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // ideal ter um construtor padrão sem argumentos e um construtor com os argumentos essenciais para a existencia do objeto.

    public Pessoa() {
        super();
    }
     
    public Pessoa(String nome, String cpf) { //construtor
        this.nome = nome;
        this.cpf = cpf;
    }  

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    
}
