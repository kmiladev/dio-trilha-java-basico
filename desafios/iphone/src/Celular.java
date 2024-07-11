
import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;



public class Celular {
    public static void main(String[] args) {
        
       
        Iphone iphone = new Iphone();
        ReprodutorMusical rep = iphone;
        NavegadorInternet nav = iphone;
        AparelhoTelefonico tel = iphone;

        System.out.println("\n------------------------------");
        System.out.println("Iniciando Reprodutor de música");
        rep.tocar();
        System.out.println("------------------------------");
        System.out.println("Iniciando Navegador");
        nav.exibirPagina();
        System.out.println("------------------------------");
        System.out.println("Iniciando Chamada...");
        tel.ligar();
        
    }
}
