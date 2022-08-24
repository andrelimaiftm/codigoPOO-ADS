import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {

        String msg = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um numero de 1 a 7 (1 - Domingo, 2 - Segunda, ...");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                // System.out.println("Dia da Semana: Domingo");
                msg = "Domingo";
                break;
            case 2:
                msg = "Segunda-Feira";
                break;
            case 3:
                msg = "Terca-Feira";
                break;
            case 4:
                msg = "Quarta-Feira";
                break;
            case 5:
                msg = "Quinta-Feira";
                break;
            case 6:
                msg = "Sexta-Feira";
                break;
            case 7:
                msg = "Sabado";
                break;
            default:
                msg = "valor invalido";
                break;
        }
        System.out.println("Dia da Semana: " + msg);
        sc.close();
    }

}
