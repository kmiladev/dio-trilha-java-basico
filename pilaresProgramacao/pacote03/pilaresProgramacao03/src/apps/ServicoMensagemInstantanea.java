package apps;

public abstract class ServicoMensagemInstantanea { // aplicação do abstract para incorporar a abstração. Mesmo comportamento que vai chamar para cada classe o método específico.

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // mais um método que todos os filhos vão implementar
    protected void salvarHistoricoMensgem(){
        System.out.println("Salvando histórico de Mensagem");
    }

    // somente os filhos e seus pacotes conhecem esse método (facebook, telegram, msn precisa validar o metodo antes de aparecer no main.)
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}
    
