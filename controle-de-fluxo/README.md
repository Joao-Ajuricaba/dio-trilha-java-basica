<h1 align="center"> Controle de Fluxo em Java ☭ </h1>


<p>
    Neste exemplo veremos exemplos sobre controle de fluxo em java

    Exemplo Switch Case: 
    public class SistemaMedida {

    public static void main(String[] args) {
        
        String sigla = "GG";

        switch(sigla){

            case "M":
                System.out.println("Tamanho Médio");

                break;

            case "P":
                System.out.println("Tamanho Pequeno");

                break;

            case "G":
                System.out.println("Tamanho Grande");

                break;

            default:
                System.out.println("Tamanho não definido");

            
        }


    }
    
}

</p>

<p>

Exemplo : encadeado

Mais um exemplo de controle de fluxo.


public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 8;

        if(nota >= 7)

                System.out.println("Aprovado");

            else if(nota >= 5 && nota < 7){

                System.out.println("Recuperação");

            }else

                System.out.println("Reprovado");
    }
    
}

</p>

