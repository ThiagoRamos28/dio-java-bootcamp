import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela classe scanner os valores digitados no terminal
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Informe sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Informe o saldo:"); 
        double saldo = scanner.nextDouble();       

        //Exibir a mensagem conta criada
        System.out.println("Ola, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de: R$ " + saldo + " já está disponível para saque."

        );
    }
}
