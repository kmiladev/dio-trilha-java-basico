package musica;

public class Reprodutor implements ReprodutorMusical{

    
    @Override
    public void pausar() {
        System.out.println("Pausar Música");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocar Música");
        
    }
    
}
