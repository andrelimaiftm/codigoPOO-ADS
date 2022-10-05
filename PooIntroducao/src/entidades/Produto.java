package entidades;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(){
        
    }
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        //this.quantidade = 10;
    }
    
    public double valorTotalEstoque(){
        return preco*quantidade;
    }
    
    public void adicionaEstoque(int quantidade){
        //this.quantidade = this.quantidade + quantidade;
       this.quantidade += quantidade;
    }
    
    public void removeEstoque(int quantidade){
        //this.quantidade = this.quantidade - quantidade;
        this.quantidade -= quantidade;
    }

    /*@Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }*/   

    
      public String toString(){
        return nome
        + ", R$ "
        + String.format("%.2f", preco)
        +", "
        +quantidade
        +" unidades, Total: R$ "
        + String.format("%.2f", valorTotalEstoque());        
    }

    //metodos get(getter) e set(setter)
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
    

}
