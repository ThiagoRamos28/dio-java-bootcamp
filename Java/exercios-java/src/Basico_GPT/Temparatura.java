package Basico_GPT;
/*
 * Exercício 10:

    Objetivo: Simular um conversor de temperatura.
    Descrição: Peça ao usuário que insira uma temperatura em graus Celsius e converta essa temperatura para Fahrenheit usando a fórmula F = C * 9/5 + 32. Exiba o resultado.
 */

import java.util.Scanner;

public class Temparatura {    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFarenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.println("A temperatura após conversão é: " + temperaturaFarenheit + "°F");
    }
}
