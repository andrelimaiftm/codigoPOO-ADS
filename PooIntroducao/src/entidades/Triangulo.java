package entidades;

public class Triangulo {
    
    public double a;
    public double b;
    public double c;

    public double area(){
            double p = (a+ b+ c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double comparaAreaTriangulo(double areaX, double areaY){
        double maiorArea = 0.0;
        if(areaX > areaY){
            maiorArea = areaX;
        }else{
            maiorArea = areaY;
        }
        return maiorArea;
    }    
}
