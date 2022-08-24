import java.util.Scanner;


public class Exemplo6 {
    
    public static void main(String[] args) {
        
        int hora;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas (sem os minutos):");
        hora = sc.nextInt();

        if(hora >= 6 && hora < 12){
            System.out.println("Bom dia!");
        }else if(hora >= 12 && hora < 18){
            System.out.println("Boa tarde!");
        }else if(hora >= 18 && hora <=23){
            System.out.println("Boa noite!");
        }else if(hora < 6 && hora >= 0){
            System.out.println("Boa madrugada!");
        }else{
            System.out.println("hora invalida!");
        }
        sc.close();
    }    
}
