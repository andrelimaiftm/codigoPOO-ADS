package entidades;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;
    
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
    
}
