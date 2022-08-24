import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double tempF, tempC;
        char escolha = 's';

        do {
            if(escolha == 's' || escolha == 'S'){
                System.out.println("Digite a temperatura em Celsius: ");
                tempC = sc.nextDouble();
                tempF = (9*tempC)/5 + 32;
                System.out.printf("Equivalente em Fahrenheit: %.2f%n",tempF);
            }else{
                System.out.println("opcao invalida!");
            }
            
            System.out.println("Deseja repetir (s/n): ");
            escolha = sc.next().charAt(0);            
        } while (escolha != 'n' && escolha != 'N');

        sc.close();
    }
    
}
