// usaremos classe abstrata pois não sabemos como cada veículo será ligado, pode haver formas diferentes de acordo com cada veículo.
// uma classe com uma finalidade comum e comportamentos diferentes.

public abstract class Veiculo { // essa classe pode oferecer atributos comuns para outras classes.
    
    private String chassi; // atributo de veículo que poderá ser acessado pela classe Carro e Moto através do extends
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    public abstract void ligar(); // todo veículo precisa do método ligar que será abstrato pois vai depender de cada classe 
}