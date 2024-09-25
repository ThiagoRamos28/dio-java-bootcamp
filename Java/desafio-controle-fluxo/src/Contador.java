import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int parametroUm = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int parametroDois = scanner.nextInt();

        try {
            // Chama o método contar, passando os parâmetros
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            // Captura e exibe a exceção customizada
            System.out.println(e.getMessage());
        }
    }

    // Método contar que realiza a verificação e a contagem
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior ou igual ao segundo
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realiza o loop para contar e imprimir os números
        int quantidade = parametroDois - parametroUm;
        System.out.println("A quantidade de impressões será igual a " + quantidade);
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Impressão número " + i);
        }
    }
}
