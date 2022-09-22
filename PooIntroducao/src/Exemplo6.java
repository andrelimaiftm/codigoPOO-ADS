import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Exemplo6 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Produto p = new Produto();
        System.err.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
       // p.nome = sc.nextLine();
        System.out.print("Preco: ");
        //p.preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        //p.quantidade = sc.nextInt();

        System.out.println();
        //System.out.println("Dados do Produto: " + p);

        System.out.println();
        System.out.print("Entre com o numero de produtos que deseja adicionar no estoque: ");
        int quantidade = sc.nextInt();
        //p.adicionaEstoque(quantidade);
        
        System.out.println();
        //System.out.println("Atualização dos Dados do Produto: " + p);
        
        System.out.println();
        System.out.print("Entre com o numero de produtos que deseja remover do estoque: ");
        quantidade = sc.nextInt();
        //p.removeEstoque(quantidade);
        
        System.out.println();
        System.out.println("Atualização dos Dados do Produto: " + p);

        sc.close();
    }
    
}
