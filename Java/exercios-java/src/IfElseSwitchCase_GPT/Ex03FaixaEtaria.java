/*
 * Crie um programa que solicite ao usuário sua idade
 *  e use if-else para classificar a idade em categorias (criança, adolescente, adulto, idoso)
 *  e exiba a categoria correspondente.
 */

package IfElseSwitchCase_GPT;
import java.util.Scanner;

public class Ex03FaixaEtaria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade da pessoa:");
        int idade = scanner.nextInt();

        String resultado = idade < 12 ? "Criança." : idade >= 12 && idade < 18 ? "Adolescente." : idade >= 18 && idade < 60 ? "Adulto(a)." : "Idoso(a).";

        System.out.println("Uma pessoa com " + idade + " anos, é considerada: " + resultado);
    }
}