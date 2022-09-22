import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Exemplo1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo X (lado a, b e c):");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y (lado a, b e c):");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        double maior = x.comparaAreaTriangulo(areaX, areaY);

        if(areaX > areaY){
            System.out.println("Trinagulo X possui maior area");
        }else if (areaY > areaX){
            System.out.println("Trinagulo Y possui maior area");
        }else{
            System.out.println("area dos triangulos são iguais");
        }        
        sc.close();
    }    
}
