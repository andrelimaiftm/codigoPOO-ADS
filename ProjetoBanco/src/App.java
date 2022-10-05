import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta c;
        System.out.println("Entre com o numero da conta:");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com nome do titular:");
        String nome =  sc.nextLine();
        System.out.println("Voce deseja realizar um deposito inicial (s/n)?");
        char verificaDeposito = sc.next().charAt(0);
        if(verificaDeposito == 's'){
            System.out.println("Entre com valor do deposito inicial:");
            double depositoInicial = sc.nextDouble();
            c = new Conta(nome, depositoInicial, numero);
        }else{
            c = new Conta(nome, numero);
        }
        System.out.println("Dados da conta:" + c);
        System.out.println("Entre com um valor para deposito:");
        double valorDeposito = sc.nextDouble();
        c.depositar(valorDeposito);
        System.out.println("Atualizando dados da conta:" + c);
        System.out.println();
        System.out.println("Entre com um valor para saque:");
        double valorSaque = sc.nextDouble();
        c.sacar(valorSaque);
        System.out.println("Atualizando dados da conta:" + c);
        sc.close();
    }
}
