/*
 * Peça ao usuário três notas, calcule a média e 
 * use if-else para determinar se o aluno está aprovado (média >= 6),
 * em recuperação (média entre 4 e 6), 
 * ou reprovado (média < 4). Exiba a situação do aluno.
 */

package IfElseSwitchCase_GPT;
import java.util.Scanner;

public class Ex04MediaEscolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String resultado = media >= 6 ? "Aprovado!" : media >= 4 && media < 6 ? "Em Recuperação!" : "Reprovado!";

        System.out.println("A média final é: " + media + ". O aluno está: " + resultado);
    }
    
}
