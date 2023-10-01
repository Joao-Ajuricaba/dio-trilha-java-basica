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
