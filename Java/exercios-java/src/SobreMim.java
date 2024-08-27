import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + " " + sobrenome + "." + " Você tem " + idade + " anos.");
    }
}
