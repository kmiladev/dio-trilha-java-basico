public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        
        // usando ternario para limpar o código

        int nota = 5;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";

        // podemos fazer com os if e elses encadeados
        //String resultado = nota >=7 ? "Aprovado" : nota >=5 && <7 ? "Recuperação" : "Reprovado";
        
        System.out.println(resultado);
    }
    
}
