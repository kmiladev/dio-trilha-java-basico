package pacotePilaresProgramacao02;
import apps.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    
    // os métopdos serão implementados para serem chamados pelo ServicoMensagemInstantanea.
    public void enviarMensagem(){
        System.out.println("Enviando Mensagem pelo FaceBook Messenger");
        
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo FaceBook Messenger");
        
    }
}
