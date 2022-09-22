import java.util.Locale;
import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC, areaX, areaY, p;

        System.out.println("Entre com as medidas do triangulo X (lado a, lado b e lado c):");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y (lado a, lado b e lado c):");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        p = (xA+xB+xC)/2;

        double calc = p*(p-xA)*(p-xB)*(p-xC);

        areaX = Math.sqrt(calc);

        p = (yA+yB+yC)/2;

        calc = p*(p-yA)*(p-yB)*(p-yC);

        areaY = Math.sqrt(calc);

        System.out.println("Area do triangulo X: " + areaX);
        System.out.println("Area do triangulo Y:" + areaY);
        
        if (areaX > areaY) {            
            System.out.println("Triangulo de maior area: X.");
        } else if (areaY > areaX){            
            System.out.println("Triangulo de maior area: Y.");
        }else{
            System.out.println("Area dos triangulos são iguais.");
        }
        sc.close();
    }
    
}
