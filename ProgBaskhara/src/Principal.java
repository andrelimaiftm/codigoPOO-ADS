import java.util.Locale;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        int a, b, c;
        double x1,x2, delta;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para a, b e c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = Math.pow(b,2)-4*a*c;
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

        sc.close();

    }
}
