/**
 * <h1> Exercício 1: </h1>
 * <b>Objetivo:<b> Declarar e inicializar variáveis
 * de diferentes tipos primitivos (int, double, char, boolean)
 * <b>Descrição:</b> Crie um programa que declare quatro variáveis,
 * uma de cada tipo primitivo mencionado acima
 * inicialize-as com valores e exiba esses valores no console
 * 
 * @author Thiago Ramos
 * @version 1.0
 * @since 26/08/2024
 */

public class DeclararVariavel {
    /**
     * Este método será utilizado para declaração das variáveis.
     * @param varInteiro este será o primeiro parâmetro do método.
     * @param varDouble este será o segundo parâmetro do método.
     * @param varChar este será o terceiro parâmetro do método.
     * @param varBoolean este será o terceiro parâmetro do método.
     */

     public static void main(String[] args) {
        int varInteiro = 10;
        double varDouble = 10.0;
        char varChar = 'S';
        boolean varBoolean = true;

        System.out.println("Representação da variáveis:");
        System.out.println("Inteiro: " + varInteiro);
        System.out.println("Double: " + varDouble);
        System.out.println("Char: " + varChar);
        System.out.println("Boolean: " + varBoolean);
     }
}
