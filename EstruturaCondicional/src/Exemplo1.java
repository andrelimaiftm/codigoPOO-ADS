import java.util.Scanner;

public class Exemplo1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int horas;

        System.out.println("Digite a hora atual:");
        horas = sc.nextInt();
        
        if(horas > 0 && horas < 12){
            System.out.println("Bom dia!");
        }else if((horas >= 12) && (horas < 18)){
            System.out.println("Boa tarde!");
        }else if(horas >= 18 && horas <= 24){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Valor invalido!");
        }
        sc.close();
    }


}