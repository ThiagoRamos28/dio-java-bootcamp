import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        int numeroDois = scanner.nextInt();

        System.out.println("A soma dos números é.............: " + (numeroUm + numeroDois));
        System.out.println("A diferença dos números é........: " + (numeroUm - numeroDois));
        System.out.println("A multiplicação dos números é....: " + (numeroUm * numeroDois));
        System.out.println("A divisão dos números é..........: " + (numeroUm / numeroDois));
    }
}
