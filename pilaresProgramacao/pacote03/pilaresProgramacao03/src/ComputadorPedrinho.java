import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        ServicoMensagemInstantanea smi = null;
        /*
         * não sabe qual app 
         * mas qualquer um deverá enviar e receber mensagem
         */

         String appEscolhido = "facebookMessenger";

         if(appEscolhido.equals("MSN"))
         smi = new MSNMessenger();
         else if(appEscolhido.equals("facebookMessenger"))
         smi = new FacebookMessenger();
         else if(appEscolhido.equals("Telegram"))
         smi = new Telegram();

         smi.enviarMensagem();
         smi.receberMensagem();
         
    }
}

// aplicando o polimorfismo.
