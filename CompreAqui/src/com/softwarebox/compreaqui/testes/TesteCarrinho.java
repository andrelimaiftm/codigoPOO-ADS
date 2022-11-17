package com.softwarebox.compreaqui.testes;

import com.softwarebox.compreaqui.classes.Cliente;
import com.softwarebox.compreaqui.classes.Pedido;
import com.softwarebox.compreaqui.classes.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteCarrinho {

    public static void main(String[] args) {

        List<Cliente> listaCliente = new ArrayList<>();
        List<Produto> listaProduto = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            
            System.out.println("Menu");
            System.out.println("1 - Cadastro de Cliente");
            System.out.println("2 - Cadastro de Produto");
            System.out.println("3 - Buscar Cliente");
            System.out.println("4 - Adicionar Produto no Carrinho");
            System.out.println("5 - Excluir Produto do Carrinho");
            System.out.println("6 - Imprimir nota fiscal");
            System.out.println("0 - sair");
            System.out.println("escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();


            String nomeProduto;
            Cliente cli;
            Produto prod;

            switch (opcao) {
                case 0:
                    System.out.println("Adeus"); 
                break;
                case 1:
                    System.out.println("Digite seu nome");
                    String nome = sc.nextLine();
                    System.out.println("digite seu e-mail");
                    String email = sc.nextLine();
                    System.out.println("digite seu cpf:");
                    String cpf = sc.nextLine();
                    System.out.println("digite seu endereco");
                    String endereco = sc.nextLine();
                    Cliente c = new Cliente(nome, email, cpf, endereco);
                    listaCliente.add(c);
                    break;
            
                case 2:
                    System.out.println("Digite nome do produto:");
                    nomeProduto = sc.nextLine();
                    System.out.println("preco do produto:");
                    double preco = sc.nextDouble();
                    prod = new Produto(nomeProduto, preco);
                    listaProduto.add(prod);
                    break;
                case 3:
                    cli = buscaCliente(listaCliente, sc);
                    if(cli != null){
                        System.out.println(cli);
                    }                    
                    break;
                case 4:
                    cli = buscaCliente(listaCliente, sc);
                    if(cli != null){
                        prod = buscaProduto(listaProduto, sc);
                        if(prod != null){
                            System.out.println("digite a quantidade:");
                            int qtdProduto = sc.nextInt();
                            sc.nextLine();
                            cli.adicionarProduto(prod, qtdProduto);
                        }
                    }
                break;
                case 5:
                    cli = buscaCliente(listaCliente, sc);
                    if(cli != null){
                        List<Pedido> carrinhoCompras = cli.getCarrinho();
                        System.out.println("Nome do produto que deseja remover:");
                        nomeProduto = sc.nextLine();
                        boolean existeProduto = false;
                        for (Pedido pedido : carrinhoCompras) {
                            prod = pedido.getProduto();
                            if(nomeProduto.equals(prod.getNome())){
                                carrinhoCompras.remove(pedido);
                                existeProduto = true;
                            }
                        }
                        if(existeProduto == false){
                            System.out.println("Produto nao encontrado");
                        }
                    }
                break;
                case 6:
                    cli = buscaCliente(listaCliente, sc);
                    if(cli != null){
                        double totalCarinho = 0.0;
                        System.out.println("Nota Fiscal");
                        System.out.println("Nome: " + cli.getNome());
                        System.out.println("CPF: " + cli.getCpf());
                        System.out.println("###############################################");
                        for (Pedido pedido : cli.getCarrinho()) {
                            prod = pedido.getProduto();
                            System.out.printf("Produto: %s, Qtd: %d X valor: %.2f, Total = %.2f \n",
                                prod.getNome(),
                                pedido.getQuantidade(),
                                prod.getPreco(),
                                pedido.ValorPedido());
                                //totalCarinho = totalCarinho + pedido.ValorPedido();
                                totalCarinho += pedido.ValorPedido();
                        }
                        System.out.println("###############################################");
                        System.out.printf("Total do Carrinho: %.2f\n", totalCarinho);
                        
                    }
                break;

                default:
                    System.out.println("opcao invalida!");
                    break;
            }

        } while (opcao != 0);               

    }

    private static Produto buscaProduto(List<Produto> listaProduto, Scanner sc) {
        boolean existeProduto = false;
        Produto p = null;
        System.out.println("Digite nome do produto:");
        String produtoBusca = sc.nextLine();
        for (Produto prod : listaProduto) {                            
            if(produtoBusca.equals(prod.getNome())){                
                existeProduto = true;
                p = prod;
            }                            
        }
        if(existeProduto == false){
            System.out.println("produto nao encontrado");
        }
        return p;
    }

    private static Cliente buscaCliente(List<Cliente> listaCliente, Scanner sc) {
        System.out.println("Digite o cpf do cliente:");
        String cpfBusca = sc.nextLine();
        Cliente c = null;
        boolean existeCliente = false;
        for (Cliente cli : listaCliente) {
            if(cpfBusca.equals(cli.getCpf())){
                existeCliente = true;
                c = cli;
                
            }
        }
        if(existeCliente == false){
            System.out.println("cliente nao encontrado");
        }
        return c;
    }
}
