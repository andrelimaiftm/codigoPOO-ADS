public class Conta {
    
    private String nome;
    private double saldo;
    private int numero;

    public Conta(String nome, double saldo, int numero) {
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
    }

    public Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;        
    }
    /**
     * Metodo que realiza o depoisto do valor na conta
     * @param valorDeposito
     */
    public void depositar(double valorDeposito){
        //this.saldo = this.saldo + valorDeposito;
        this.saldo += valorDeposito;
    }

    /**
     * Metodo que realiza o saque do valor na conta
     * @param valorSaque
     */
    public void sacar(double valorSaque){
        //this.saldo = this.saldo - (valorSaque + 5.00);
        this.saldo -= (valorSaque + 5.00);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }   

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta [nome=" + nome + ", saldo=" + saldo + ", numero=" + numero + "]";
    }  
    
}