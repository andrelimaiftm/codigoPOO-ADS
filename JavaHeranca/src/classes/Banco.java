package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    private List<Conta> ListaConta;
    private Scanner sc;

    public Banco(){
        ListaConta = new ArrayList<>();
        sc = new Scanner(System.in);
    }


    private void cadastraConta(){
        System.out.println("Tipo de Conta");
                    System.out.println("1 - Conta Poupanca");
                    System.out.println("2 - Conta Especial");
                    int valor = sc.nextInt();
                    System.out.println("Numero:");
                    int numero = sc.nextInt();
                    System.out.println("Nome:");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.println("Saldo: ");
                    double saldo = sc.nextDouble();
                    Conta c = new Conta();
                    if(valor == 1){
                        System.out.println("Taxa de Rendimento:(%)");
                        double taxaRendimento = sc.nextDouble();
                        c = new ContaPoupanca(numero, nome,saldo,taxaRendimento);
                        
                    }else{
                        System.out.println("Limite de Emprestimo: ");
                        double limite = sc.nextDouble();
                        c = new ContaEmpresarial(numero, nome, saldo, limite);
                    }
                    ListaConta.add(c);
    }


    public void iniciar(){
        int opcao = 0;

        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastro de Conta");
            System.out.println("2 - buscar Conta");
            System.out.println("3 - imprimir Contar");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opcao:");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cadastraConta();
                    break;
            
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("opcao invalida.");
                    break;
            }
        } while (opcao != 4);


    }


    
}
