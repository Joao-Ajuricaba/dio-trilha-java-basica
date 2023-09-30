import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        Scanner entrada = new Scanner(System.in);
        int numeroConta;
        String agencia,nomeCliente;
        double saldoConta;

        //Obter pela classe Scanner os valores digitados no terminal

        System.out.println("------Conta Corrente-----");
        System.out.println();
        System.out.println("Por favor digite número da conta bancária : Ex 1234");
        numeroConta=entrada.nextInt();
        System.out.println("Por favor digite número da agência bancária : Ex 123-4");
        agencia=entrada.next();
        System.out.println("Por favor digite seu nome : Ex Andre Marx");
        nomeCliente=entrada.next();
        entrada.nextLine();
        System.out.println("Agora digite saldo da conta bancária : Ex 1234,09");
        saldoConta=entrada.nextDouble();


        //Exibir as mensagens para o nosso usuário
        System.out.println();
        System.out.println("Número da Conta   : "+numeroConta);
        System.out.println("Número da Agência : "+agencia);
        System.out.println("Nome do Cliente   : "+nomeCliente);
        System.out.println("Saldo da Conta    : "+saldoConta);


        

        //Exibir as mensagens da conta criada
    }
}
