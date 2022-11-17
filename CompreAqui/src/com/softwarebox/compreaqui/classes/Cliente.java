package com.softwarebox.compreaqui.classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private static int numeroDeContas = 0;

    private String nome;
    private String email;
    private String cpf;
    private String endereco;

    private List<Pedido> carrinho;



    public Cliente() {
        this.carrinho = new ArrayList<>();
    }

    public Cliente(String nome, String email, String cpf, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.carrinho = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade){
        if(produto != null){
            Pedido pedido = new Pedido(produto, quantidade);
            carrinho.add(pedido);        
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static int getNumeroDeContas() {
        return numeroDeContas;
    }

    public static void setNumeroDeContas(int numeroDeContas) {
        Cliente.numeroDeContas = numeroDeContas;
    }

    public List<Pedido> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Pedido> carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", carrinho=" + carrinho +
                '}';
    }
}
