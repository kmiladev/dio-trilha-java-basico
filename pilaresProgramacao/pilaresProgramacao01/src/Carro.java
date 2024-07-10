package pilares01;

public class Carro extends Veiculo{

    
        // somente esse método fica disponível para outras classe. com as ações private (encapsuladas).
    
    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    //encapsulamento de ações que serão executadas somente dentro da classe Carro
    private void confereCombustivel(){
        System.out.println("Confere Combustível");
    }
    private void confereCambio(){
    System.out.println("Confere Câmbio");
    }
}
