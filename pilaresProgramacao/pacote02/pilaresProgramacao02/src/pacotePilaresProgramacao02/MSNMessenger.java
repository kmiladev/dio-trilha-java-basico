package pacotePilaresProgramacao02;
import apps.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem(){
        System.out.println("Enviando Mensagem pelo MSN");
        
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo MSN");
        
    }


}

   /* 
   Antes de implementar a classe Pai ServicoMensagemInstantanea, esse era o c´podigo desfrutando
   apenas do encapsulamento.
   Após implementar a classe pai para usar o polimorfismo e herança, chamamos apenas o método e 
   suas respectivas mensagens.

   public void enviarMensagem(){
        validarConectadoInternet(); // aplico o método privado aqui para fazer a validacao antes de chamar o método publico no main.
        System.out.println("Enviando Mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){// aplico o método privado aqui para fazer a validacao antes de chamar o método publico no main.
        validarConectadoInternet();
        System.out.println("Recebendo Mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }

    // métodos privados, visíveis somente na classe.
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado na Internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico da Mensagem");
    }
    */


//encapsulamento - nem tudo precisa ficar disponível ou public ao chamar a função.
// etapas que ficam disponíveis apenas na classe disponível serão private
// o que poderá ser encapsulado.

/*Classe inicial: com métodos todos public / sem o pilar de encapsulamento.
 * MSNMessenger
 * +enviarMensagem(): void
 * +receberMensagem(): void
 * +validarConectadoInternet(): void (pode ser encapsulado)
 * +salvarHistoricoMensagem(): void. (pode ser encapsulado)
 * 
 * instancia: MSNMessenger msn = new MSNMEssenger();
 * chamar métodos publicos:
 * msn.validarConectadoInternet()
 * msn.enviarMensagem()
 * msn.salvarHistoricoMensagem()
 */