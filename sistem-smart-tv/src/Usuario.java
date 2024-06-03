public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); // criar uma classe para ilustrar a interação dos métodos e atributos

        smartTv.diminuirVolume(); // diminui uma vez 24
        smartTv.diminuirVolume(); // diminui mais uma vez 23 
        smartTv.diminuirVolume(); // diminui mais uma vez 22
        smartTv.aumentarVolume(); // aumentei uma vez 23

        System.out.println("Volume Atual: " + smartTv.volume);


        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar(); // chamando método ligar. Não tem parâmetro
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar(); // chamando método ligar. Não tem parâmetro
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
