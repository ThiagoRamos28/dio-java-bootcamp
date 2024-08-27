import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu Índice de massa corporal é: " + imc);
    }
}