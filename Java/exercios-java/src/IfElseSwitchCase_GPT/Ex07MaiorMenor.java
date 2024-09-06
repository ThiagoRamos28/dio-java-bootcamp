/*
 * Solicite ao usuário dois números e use if-else
 * para identificar e exibir o maior número. 
 * Se os números forem iguais, exiba uma mensagem informando isso.
 */

package IfElseSwitchCase_GPT;
import java.util.Scanner;

public class Ex07MaiorMenor {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int num2 = scanner.nextInt();

        String resultado = num1 > num2 ? "É maior" : num1 < num2 ? "É menor" : "É igual";

        System.out.println(num1 + " " + resultado + " " + num2);
    }
    
}
