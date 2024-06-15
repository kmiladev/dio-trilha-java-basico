public class PlanoOperadora {
    public static void main(String[] args) {
        // exemplo de cenário para adequar o switch/case para melhorar o nosso algorítimo.
        // evitar repetição de instruções

        String plano = "T"; // B,M,T

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }

            // foi colocado de forma decrescente e sem o uso do break para que se pudesse imprimir na tela
            // o plano completo. Mas é muito comum usar o break.
        }

    }
    
}
