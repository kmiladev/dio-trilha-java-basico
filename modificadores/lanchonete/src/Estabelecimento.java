import lanchonete.atendimento.cozinha.Almoxerife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarLanche();
       

        Almoxerife almoxerife = new Almoxerife();
        almoxerife.controlarEntrada();
        
    }
}
