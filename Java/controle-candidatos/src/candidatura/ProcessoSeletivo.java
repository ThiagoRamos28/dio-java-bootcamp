package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"MONICA", "FABRICIO", "MIRELA", "DANIELA", "THIAGO"};
        for(String candito: candidatos) {
            entrandoEmContato(candito);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do{
           atendeu= atender();
           continuarTentando = !atendeu;
           if(continuarTentando)
            tentativasRealizadas++;
           else
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NA " + tentativasRealizadas + " TENTATIVA ");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"MONICA", "FABRICIO", "MIRELA", "DANIELA", "THIAGO"};        
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abrevidade de interação for each");
        for(String candidato: candidatos){
            System.out.println("O Candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCanditados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "THIAGO"};

        int candidatosSelecionados = 0;
        int canditadoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && canditadoAtual < candidatos.length) {
            String candidato = candidatos[canditadoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$ " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O canditado " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            canditadoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCanditado(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDITADO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDITADOS");
        }
    }
}
