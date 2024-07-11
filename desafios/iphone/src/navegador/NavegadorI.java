package navegador;

public class NavegadorI implements NavegadorInternet {

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
}
