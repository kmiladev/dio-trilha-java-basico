public class FormatadorCepExemplo {
    public static void main(String[] args) {
        
        String cepFormatado = formatarCep("23765064"); // lancando o cep nesse formato ele já exige o try catch por conta de ser uma classe de excecao que é estendida de exception.
    } // não se trata de um erro e sim um tratamento de excecao.
    // criação do método de formatar cep
static String formatarCep(String cep) throws CepInvalidoException{ // condição para lançar o exception
    if(cep.length() != 8)
        throw new CepInvalidoException(); // a condicao que vai ser lançado
        // simulando um cep formatado
        return "23.765-064";  // se o cep fpo diferente de 8 caracteres vai printar CepInvalidoException;
}
    /*O recurso acima com o tratamento solicitado pelo programa ficaria:
     * try{
     *      String cepFormatado = formatarCep("23765064");
     *      // System.out.println(cepFprmatado
     * } catch (CepInvalidoException e) {
     *      e.printStackTrace();
     * }
     * se eu tratar com o try catch o print na tela será o cep formatado.
     * agora se houver a digitação de um numero menor outro erro sera printado podendo tratar de outra forma. 
     * Podemos colocar abaixo do catch
     * System.out.println("O cep não corresponde com as regras de negócio.");
     * 
     */
}
