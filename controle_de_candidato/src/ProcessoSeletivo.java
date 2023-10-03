import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       /*  System.out.println("Processo Seletivo");
        analisarCandidato(1990.0);
        analisarCandidato(2225.0);
        analisarCandidato(2000.0);*/
        //selecaoCandidato();
        //imprimirSelecionados();

        String[] candidatos = {"Marcia","Julia","Paulo","Je","Joao"};
        for (String candidato : candidatos) {

            entrandoEmContato(candidato);
            
        }
        
    }

    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas<3);

         if(atendeu){
            System.out.println("Conseguimos contato com "+candidato+" Na "+tentativasRealizadas+" tentativa");
         }else{
            System.out.println("Não conseguimos contato com "+candidato+" , número máximo de tentativas "+tentativasRealizadas+" realizada's'");
         }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Marcia","Julia","Paulo","Daniela","Joao"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0;indice<candidatos.length;indice++){
            System.out.println("O candidato "+candidatos[indice]+" é o "+(indice+1)+"º");
        }

        System.out.println("Forma abreviada de ineração for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi "+candidato);
        }

    }

    static void selecaoCandidato(){
        String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Joao"};

        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while (candidatosSelecionados<5 && candidatosAtual < candidatos.length) {

            String candidato = candidatos[candidatosAtual];
            double salarioPretendido =  valorPretendido();

            System.out.println("O candidato "+candidato+" Solicitou este valor de salario "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
            
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }

    }
}
