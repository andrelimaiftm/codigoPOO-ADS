import java.util.Locale;
import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        while (numero != 0) {
            System.out.print("Digite um numero inteiro (0 para sair): ");
            numero = sc.nextInt();
            //soma = soma + numero
            soma += numero;
        }
        System.out.println("A soma dos numero é: " + soma);

        sc.close();

    }
}
