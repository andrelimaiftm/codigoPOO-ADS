package entidades;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque(){
        return preco*quantidade;
    }

    public void adicionaEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

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
