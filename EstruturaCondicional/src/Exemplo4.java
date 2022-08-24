public class Exemplo4 {

    public static void main(String[] args) {
        
        /*double preco = 34.0;
        double desconto;
        if(preco < 20.0){
            desconto = preco * 0.1;
        }
        else{
            desconto = preco * 0.05;
        }*/

        double preco = 34.0;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;


    }
    
}
