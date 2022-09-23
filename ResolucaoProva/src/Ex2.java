import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        // 3! = 3x2x1
        //4! = 4x3x2x1 (= 4x3!)
        // n! = nx(n-1)!


        Scanner sc = new Scanner(System.in);

        int n = 0;
        int fatorial = 1;
        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();

        fatorial = fatorial(n);


        /*while(n > 0){
            fatorial = fatorial*n;
            //n = n-1;
            n--;
        }*/

        /*for (int i = n; i > 0; i--) {
            fatorial = fatorial*i;
        }*/
        
        /*for (int i = 1; i <= n ; i++) {
            fatorial = fatorial*i;
        }*/
        System.out.println("Fatorial = " + fatorial);
        sc.close();
    }

    public static int fatorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else {
            return n*fatorial(n-1);
        }
    }

}
