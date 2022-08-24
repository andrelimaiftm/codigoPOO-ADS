import java.util.Locale;
import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor, soma = 0;
        
        System.out.print("Digite a quantidade de elementos que deseja receber: ");
        valor = sc.nextInt();

        for (int i = 0; i < valor; i++) {
            System.out.print("Digite um numero inteiro: ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos numero é: " + soma);

        sc.close();

    }
}
