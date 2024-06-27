// Leitura dos dados em java
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println: imprime o texto de saída (output) pulando uma linha.abstract 

import java.util.Scanner;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //leitura dos valores de entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            //atrbui a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }else if(valorSalario >= 1100.01 && valorSalario <= 2500){
            //atrbui a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
        }else{
            //atrbui a aliquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
        }

        // calcula e imprime a saída (com duas casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

        leitorDeEntradas.close();
    }
}
