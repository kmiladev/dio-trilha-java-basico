import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
// alt+insert para atalho 
    
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

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando Nova Aba");
        
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Atualizando Página da Web");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo Página da Web: https://google.com.br");
        
    }

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
