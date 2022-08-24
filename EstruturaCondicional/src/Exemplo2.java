import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os minutos gastos: ");
        int minutos = sc.nextInt();

        double valorConta = 50.0;
        if(minutos > 100){
            //     a     =      a     +        b;
            //valorConta = valorConta + (minutos - 100) * 2;
            valorConta += (minutos - 100) * 2;
            System.out.printf("Valor da conta = R$ %.2f%n", valorConta);
        }else if(minutos < 0){
            System.out.println("Valor invalido para minutos.");
        }else{
            System.out.printf("Valor da conta = R$ %.2f%n", valorConta);
        }
        sc.close();
    }
    
}
