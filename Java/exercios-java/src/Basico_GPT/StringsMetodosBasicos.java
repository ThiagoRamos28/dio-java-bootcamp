package Basico_GPT;
/*
 * Exercício 7:

Objetivo: Trabalhar com strings e métodos básicos.
Descrição: Solicite ao usuário que insira uma palavra e, em seguida, exiba o comprimento da palavra, a primeira letra e a palavra em letras maiúsculas.
 */

import java.util.Scanner;

public class StringsMetodosBasicos {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String palavra = scanner.next();

        int comprimento = palavra.length();
        System.out.println("A quantidade de carateres é: " + comprimento);

        char primeiraLetra = palavra.charAt(0);
        System.out.println("A primeira letra é: " + primeiraLetra);

        String palavraMaiuscula = palavra.toUpperCase();
        System.out.println("Palavra reescrita em maiusculo: " + palavraMaiuscula);

    }
}
