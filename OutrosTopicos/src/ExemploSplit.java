public class ExemploSplit {

    public static void main(String[] args) {
        String s = "batata maca limao";

        String[] vetor = s.split(" ");
        String palavra1 = vetor[0];
        String palavra2 = vetor[1];
        String palavra3 = vetor[2];

        System.out.println("mensagem original: " + s);
        System.out.println("Após o uso do split");
        System.out.println("palavra 1: " + palavra1);
        System.out.println("palavra 2: " + palavra2);
        System.out.println("palavra 3: " + palavra3);
    }
    
}
