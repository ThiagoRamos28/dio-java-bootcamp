package Basico_GPT;
/*Exercício 8:

Objetivo: Criar um programa de cálculo de média.
Descrição: Solicite ao usuário três notas (números decimais) e calcule a média dessas notas. Exiba a média com duas casas decimais.
*/

import java.util.*;

public class CalculoMedia {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota01 = scanner.nextDouble(); 

        System.out.println("Digite a segunda nota: ");
        double nota02 = scanner.nextDouble(); 

        System.out.println("Digite a terceira nota: ");
        double nota03 = scanner.nextDouble();
        
        double media = (nota01 + nota02 + nota03) / 3;

        System.out.println("A media entre a notas é: " + media);
    }

}
