package apps;

public class Telegram extends ServicoMensagemInstantanea {
    
    
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Telegram");
        
    }
    
    public void receberMensagem(){

        System.out.println("Recebendo Mensagem pelo Telegram");
        
    }

    public void salvarHistoricoMensagem(){
        validarConectadoInternet();
        System.out.println("Salvando histórico de Mensagem pelo Telegram");
        
    }
    
}
