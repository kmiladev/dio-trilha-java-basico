package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    
    // os métodos serão implementados para serem chamados pelo ServicoMensagemInstantanea.
    
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo FaceBook Messenger");
        
    }
    
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo FaceBook Messenger");
        
    }

    public void salvarHistoricoMensagem(){
        validarConectadoInternet();
        System.out.println("Salvando histórico de Mensagem pelo Facebook Messenger");
        
    }

    
}
