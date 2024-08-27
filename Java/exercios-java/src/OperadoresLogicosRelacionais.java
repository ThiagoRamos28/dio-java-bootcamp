import java.util.Scanner;

public class OperadoresLogicosRelacionais {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe um número inteiro:");
        int numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println(numeroUm  + " é maior que " + numeroDois);
        }else if (numeroUm == numeroDois) {
            System.out.println(numeroUm + " é igual ao " + numeroDois);
        }else{
            System.out.println(numeroUm + " é menor que " + numeroDois);
        }
    }
}
