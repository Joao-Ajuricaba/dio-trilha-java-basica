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
