/*
 * Peça ao usuário um número inteiro e use a estrutura if-else 
 * para verificar se o número é par ou ímpar. Exiba o resultado.
 */

package IfElseSwitchCase_GPT;
import java.util.Scanner;

public class Ex02ParImpar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        String resultado = numero % 2 == 0 ? "Número Par" : "Número Impar";

        System.out.println(numero + " é um " + resultado);
    }
}
