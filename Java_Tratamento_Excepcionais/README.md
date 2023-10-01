<h1 align="center">Java e Tratamento de Excepcionais ☭</h1>

<h2>Exemplos de tratamaneto Try..Catch</h2>

exemplo 1 :

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome : ");
        String nome=scanner.next();

        System.out.println("Digite seu sobrenome : ");
        String sobrenome=scanner.next();

        System.out.println("Digite sua idade : ");
        int idade=scanner.nextInt();

        System.out.println("Digite sua altura : ");
        double altura=scanner.nextDouble();

        //imprimeindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo "+nome.toUpperCase()+"  "+sobrenome.toUpperCase());
        System.out.println("Tenho "+idade+" anos ");
        System.out.println("Minha altura é "+altura+" cm ");
        scanner.close();
        } catch (InputMismatchException e /*Exception e*/) {
            // TODO: handle exception
            System.err.println("Os campos idade e altura precisam ser númericos");
        }
    }
}

exemplo 2 : 
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    public static void main(String[] args) {
        
            Number valor;
            try {
                valor = NumberFormat.getInstance().parse("a1.75");
                System.out.println(valor);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            /*Double.valueOf("a1.75");*/
            

    }
    
}

exemplo 3 : 

public class CepInvalidoException extends Exception{
    
}

exemplo 4 :

public class FormatadorCep{

    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("O cep não corresponde com as regras de negócio");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8)
            throw new CepInvalidoException();

            //simulando um cep formatado
            return"23.765-064";
    }

}