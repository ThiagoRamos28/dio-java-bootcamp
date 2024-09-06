/*
Crie um programa que solicite ao usuário um número inteiro 
e use uma estrutura if-else para verificar se o número é positivo, negativo ou zero. 
Exiba uma mensagem correspondente.
*/

package IfElseSwitchCase_GPT;
import java.util.Scanner;

public class Ex01VerificaNumero {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = scanner.nextDouble();

        String resultado = numero > 0 ? "Positivo!" : numero < 0 ? "Negativo!" : "Zero!";

        System.out.println("O número: " + numero + " é: " + resultado);
    }
    
}
