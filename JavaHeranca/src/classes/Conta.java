package classes;

public class Conta {

    protected Integer numero;
    protected String proprietario;
    protected Double saldo;

    public Conta(){}

    public Conta(Integer numero, String proprietario, Double saldo) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public void saque(Double quantia){
        //this.saldo = this.saldo - quantia;
        this.saldo -= quantia - 5.0;
    }

    public void deposito(Double quantia){
        this.saldo += quantia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", proprietario=" + proprietario + ", saldo=" + saldo + "]";
    }   

    
}
