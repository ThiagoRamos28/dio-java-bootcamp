/*
Exercício 5:

Objetivo: Utilizar operadores lógicos e relacionais.
Descrição: Crie um programa que solicite ao usuário dois números e determine se o primeiro número é maior, menor ou igual ao segundo. Exiba o resultado com uma mensagem apropriada.
 */

import java.util.Scanner;

public class OperadoresLogicosRelacionais {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe um número inteiro:");
        int numeroDois = scanner.nextInt();

        String resultado = numeroUm > numeroDois ? numeroUm + " é maior que " + numeroDois : numeroUm == numeroDois ? numeroUm + " é igual ao " + numeroDois : numeroUm + " é menor que " + numeroDois;

        System.out.println(resultado);

        if (numeroUm > numeroDois) {
            System.out.println(numeroUm  + " é maior que " + numeroDois);
        }else if (numeroUm == numeroDois) {
            System.out.println(numeroUm + " é igual ao " + numeroDois);
        }else{
            System.out.println(numeroUm + " é menor que " + numeroDois);
        }
    }
}
