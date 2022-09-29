import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Exemplo6 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Produto p = new Produto();
        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        //p.nome = sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Preco: ");
        //p.preco = sc.nextDouble();
        double preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        //p.quantidade = sc.nextInt();
        int quantidade = sc.nextInt();
        Produto p = new Produto(nome, preco, quantidade);
        p.setPreco(19.90);
        p.setNome("Chinelo Havaianas Hackeado");

        System.out.println();
        //System.out.println("Dados do Produto: " + p);
        System.out.println("Dados do produto:");
        System.out.println(p.getNome());
        System.out.println(p.getQuantidade());
        System.out.println(p.getPreco());
        
        System.out.print("Entre com o numero de produtos que deseja adicionar no estoque: ");
        quantidade = sc.nextInt();
        p.adicionaEstoque(quantidade);
        
        System.out.println();
        System.out.println("Atualização dos Dados do Produto: " + p);
        
        System.out.println();
        System.out.print("Entre com o numero de produtos que deseja remover do estoque: ");
        quantidade = sc.nextInt();
        p.removeEstoque(quantidade);
        
        System.out.println();
        System.out.println("Atualização dos Dados do Produto: " + p);

        sc.close();
    }
    
}
