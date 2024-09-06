package Basico_GPT;
/*
 * Exercício 4:

Objetivo: Converter tipos de dados.
Descrição: Escreva um programa que solicite ao usuário um número decimal (double) e converta-o para um número inteiro (int), exibindo o resultado antes e depois da conversão.

 */

 import java.util.Scanner;

public class ConverterDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número decimal: ");
        double numeroUm = scanner.nextDouble();

        int numeroDois = (int) numeroUm;

        System.out.println("A parte inteira de " + numeroUm + " é: " + numeroDois);


    }
    
}
