package pacotePilaresProgramacao02;
public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        MSNMessenger msn = new MSNMessenger();

        // chamar apenas métodos publicos:
        
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger facebook = new FacebookMessenger();
        
        facebook.enviarMensagem();
        facebook.receberMensagem();

        Telegram telegram = new Telegram();
        
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
