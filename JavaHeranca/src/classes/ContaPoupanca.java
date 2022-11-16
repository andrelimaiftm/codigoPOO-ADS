package classes;

public final class ContaPoupanca  extends Conta{
    
    private Double taxaRendimento;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numero, String proprietario, 
        Double saldo, 
        Double taxaRendimento) {
        super(numero, proprietario, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public final void saque(Double quantia){
        this.saldo -= quantia;
    }

    public void renderJuros(){
        this.saldo += (this.saldo*taxaRendimento)/100;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca [ numero=" + numero + ", proprietario=" + proprietario + 
        ", saldo=" + saldo +" taxaRendimento=" + taxaRendimento + "]";
    }

    

    




}
