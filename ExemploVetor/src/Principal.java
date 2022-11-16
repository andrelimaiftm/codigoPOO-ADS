import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vetor = new Produto[n];

        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();            
            double preco = sc.nextDouble();
            Produto p = new Produto(nome, preco);
            vetor[i] = p;
            //vetor[i] = new Produto(nome, preco);
            soma = soma + vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("A media dos precos = %.2f%n", media);

        sc.close();
    }
}
