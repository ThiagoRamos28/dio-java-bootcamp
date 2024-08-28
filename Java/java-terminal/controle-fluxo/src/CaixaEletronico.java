public class CaixaEletronico{
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 24.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque efetuado com sucesso!!!");
        }else{
            System.out.println("Saldo indisponível para operação.");
        }
            

        System.out.println("Saldo atual: " + saldo);

    }
}