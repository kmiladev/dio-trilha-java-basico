public class SistemaMedida {
    public static void main(String[] args) {
        // exemplo de switch case - sempre avaliar se é a melhor abordagem no lugar do if/else.
        
        String sigla = "A";

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }           
    }
    
}
