public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75"); // tentando converter o valor a1.75 para um número, já percebemos que tem um caractere indevido.

        System.out.println(valor);
    }
    // na execução recebemos uma exception ; java.lang.NumberFormatException - exceção estendida da classe runtime
    // o método valueOf converte string em double
    // a classe runtime determina que a exceção que pode acontecer já está sendo tratada pelo java.
    // o erro pode acontecer mas só pode ser tratado após ocorrer.

    /*Podemos ainda etstar as exceções usando outro método:
     * import java.text.Number Format;
     * public class ExemploExcecao;
     * public static void main(String[] args){
     * Number valor = NumberFormat.getInstnce().parse("a1.75");
     * 
     * System.out.println(valor);}
     * 
     * ao tentar realizar a conversão da string par o numero  sistema já sinaliza a opção de tratamento de exceção.
     * Pedindo para inserir o try/catch
     * Ficaria dessa forma:
     * 
     * import java.text.Number Format;
     * public class ExemploExcecao;
     * public static void main(String[] args){
     * Number valor;
     * try {
     * valor = NumberFormat.getInstnce().parse("a1.75");
     * System.out.println(valor);
     * } catch (ParseEsception e) {
     * e.printStackTrace();
     * }
     * consultando essa esceção vemos que trata-se de uma exception.
     * 
     * checked e unchecked significa que vc deve tratar o erro imediatamente, já o runtime o erro pode ocorrer para depois tratar.
     */
    
}
