public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 6;

        if(nota >=7) // se for maior ou igual a nota correspondente vai entrar neste fluxo
            System.out.println("Aprovado");

        else if(nota >=5 && nota < 7)
            System.out.println("Prova de Recuperção");    

        else // se não for correspondente vem direto para esse bloco.
            System.out.println("Reprovado");
    }
    
}
// if será sempre a primeira instrução e else sempre será a última instrução;