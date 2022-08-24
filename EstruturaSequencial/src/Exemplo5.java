
import java.util.Locale;
import java.util.Scanner;

public class Exemplo5 {

    public static void main(String[] args) {

        String x;
        int y;
        double z;
        char c;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra, um numero, valor quebrado e um caracter: ");
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        c = sc.next().charAt(0);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("c = " + c);

        sc.close();

    }

}
