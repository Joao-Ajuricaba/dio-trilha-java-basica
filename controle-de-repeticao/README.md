<h1 align="center"> Controle de Repetição em Java ☭ </h1>



    Neste exemplo veremos exemplos sobre controle de repetição em java

    Exemplo de controle de fluxo for: 

    public class For {
    public static void main(String[] args) throws Exception {
        
        for(int cordeirinhos=1;cordeirinhos<=20;cordeirinhos++){

            System.out.println("carneirinho's'"+cordeirinhos);

        }

            System.out.println();
            System.out.println("John dormiu");

    }
}


exemplo for usando arrays:

public class For_em_Arrays {
    public static void main(String[] args) {
        
        String alunos[] = {"branquinha","cinzinha","ludovico","grandão","leio","frida"};

        for(int i=0;i<alunos.length;i++){

            System.out.println("Aluno "+alunos[i]+" ");

            System.out.println("Indice "+i);

            System.out.println();

        }

    }
    
}

exemplo usando foreach:

public class Foreach {

    public static void main(String[] args) {
        
        String alunos[] = {"branquinha","cinzinha","ludovico","grandão","leio","frida"};

        for (String aluno : alunos) {
            
            System.out.println("Aluno : "+aluno);

        }

    }
    
}

exemplo usando break : 

public class Exemplo_Break_Continue {

    public static void main(String[] args) {
        
        for(int numero=1;numero<=5;numero++){

            if(numero==3){
                break;
            }

            System.out.println(numero);

        }

    }
    
}


exemplo usando continue:

public class Exemplo_Break_Continue {

    public static void main(String[] args) {
        
        for(int numero=1;numero<=5;numero++){

            if(numero==3){
                continue;
            }

            System.out.println(numero);

        }

    }
    
}

exemplo usando while:

import java.util.concurrent.ThreadLocalRandom;
public class While {

    public static void main(String[] args) {
        
        double mesada = 50.0;
        
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce=mesada;

                System.out.println("Doce do valor : "+valorDoce+" Valor adicionado carrinho : "+(mesada=mesada-valorDoce));
        }

        System.out.println("Mesada : "+mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces ");

        

    

    
}
private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
    
}



    



