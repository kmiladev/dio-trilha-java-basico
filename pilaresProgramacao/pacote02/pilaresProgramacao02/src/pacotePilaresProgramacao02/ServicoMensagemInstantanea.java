package pacotePilaresProgramacao02;
public abstract class ServicoMensagemInstantanea { // aplicação do abstract para incorporar a abstração. Mesmo comportamento que vai chamar para cada classe o método específico.

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}
    /*
    antes de aplicar a abstração, esse seria o código disponivel aqui.public void enviarMensagem(){
        validarConectadoInternet(); // aplico o método privado aqui para fazer a validacao antes de chamar o método publico no main.
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){// aplico o método privado aqui para fazer a validacao antes de chamar o método publico no main.
        validarConectadoInternet();
        System.out.println("Recebendo Mensagem");
        salvarHistoricoMensagem();
    }

    // métodos privados, visíveis somente na classe.
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado na Internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico da Mensagem");
    }
}*/
