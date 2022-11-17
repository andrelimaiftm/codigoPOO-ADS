package com.softwarebox.compreaqui.classes;

public class Pedido {

    private Produto produto;
    private int quantidade;

    public Pedido() {
    }

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double ValorPedido(){
        return produto.getPreco()*quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
