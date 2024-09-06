/*
 * Crie um programa que solicite ao usuário sua idade e use if-else
 * para verificar se a pessoa é elegível para votar (idade >= 16). 
 * Exiba uma mensagem correspondente.
 */

package IfElseSwitchCase_GPT;
import java.util.Scanner;

public class Ex05MaioridadeEleitoral {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade da pessoa: ");
        int idade = scanner.nextInt();

        String maioridade = idade >= 16 ? "Apto!" : "Não apto!";

        System.out.println("A pessoa está: " + maioridade + " para votar");
    }
    
}
