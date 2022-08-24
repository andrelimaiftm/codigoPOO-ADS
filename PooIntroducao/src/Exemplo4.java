import java.util.Locale;
import java.util.Scanner;

import utils.Calculadora;

//versão 1
public class Exemplo4 {    

    public static void main(String[] args) {
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Entre com o raio: ");
       double raio = sc.nextDouble();

       Calculadora calc = new Calculadora();

       double c = calc.circunferencia(raio);

       double v = calc.volume(raio);

       System.out.printf("Circunferencia: %.2f%n", c);
       System.out.printf("Volume: %.2f%n", v);
       System.out.printf("Valor do PI: %.2f%n", calc.PI);

       sc.close();
    }        
}
