import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[n];
        //int[] vetor = new int[n];
        //String[] vetor = new String[n];
        //char[] vetor = new char[n];

        /*for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }*/

        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
            soma = soma + vetor[i];
        }

       double media = soma/n;
       
       System.out.printf("A media da altura: %.2f", media);
       sc.close();
    }
}
