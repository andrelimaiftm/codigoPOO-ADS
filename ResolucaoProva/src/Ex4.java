import java.util.Locale;
import java.util.Scanner;

public class Ex4{
   
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        verificaClassicacaoGlicose(glicose);
        sc.close();
    }

    public static void verificaClassicacaoGlicose(double glicose){
        if(glicose <= 100.0){
            System.out.println("Classificacao: Normal");
        }else if(glicose > 100.0 && glicose <= 140.0){
            System.out.println("Classificacao: Elevado");
        }else if(glicose > 140.0){
            System.out.println("Classificao: Diabetes");
        }
    }
}
