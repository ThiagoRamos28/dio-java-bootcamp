/*
 * Peça ao usuário o valor total de uma compra e use if-else
 * para aplicar um desconto de 10% se o valor for maior que 100.
 * Exiba o valor final da compra.
 */

package IfElseSwitchCase_GPT;
import java.util.Scanner;

public class Ex06BuscaPreco {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preçço do produto:");
        double preco = scanner.nextDouble();

        if (preco >= 100) {
            double novo_preco = preco - (preco * 0.10);
            System.out.println("Valor final da compra é: R$ " + novo_preco);
        } else {
            System.out.println("Valor final da compra é: R$ " + preco);
        }
    }
    
}
