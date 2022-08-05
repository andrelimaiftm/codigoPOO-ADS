public class Exemplo1{

    public static void main(String[] args) {
        
        double x = 10.35784;
        double y = 5.5;

        String nome = "Maria";
        int idade = 31;
        float renda = 4000.0f;

        //System.out.println(x);
        /*System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);*/
        //System.out.println("O RESULTADO = " + x + " METROS e " + y);
        //System.out.printf("O RESULTADO = %f METROS e %.2f", x, y);
        System.out.printf("%s tem %d de idade e possuiu renda de R$ %.2f reais",
            nome, idade, renda);


    }
    
}