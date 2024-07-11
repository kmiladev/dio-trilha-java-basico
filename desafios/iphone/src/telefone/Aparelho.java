package telefone;

public class Aparelho implements AparelhoTelefonico{

    @Override
    public void atender() {
        System.out.println("Ligação Atendida");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
        
    }
}
