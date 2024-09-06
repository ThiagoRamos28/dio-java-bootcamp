package Basico_GPT;
/*
 * Exercício 9:

Objetivo: Utilizar operadores de incremento e decremento.
Descrição: Crie um programa que declare uma variável inteira com valor 10, depois incremente e decremente o valor, exibindo o valor antes e depois de cada operação.
 */

import java.util.Scanner;

public class IncrementoDecremento {
    
    public static void main(String[] args) {
        
        int numero = 10;

        System.out.println("Numero Original: " + numero);
        System.out.println("Número apos incremento: " + ++numero);
        System.out.println("Número apos decremento: " + (--numero - 1));
        
    }
}
