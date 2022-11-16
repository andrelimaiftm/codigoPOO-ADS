package classes;

public class ContaEmpresarial  extends Conta{

    private Double limiteEmprestimo;

    public ContaEmpresarial(){
        super();
    }

    public ContaEmpresarial(Integer numero, String proprietario,
     Double saldo, Double limiteEmprestimo) {
        super(numero, proprietario, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public void saque(Double quantia){
        super.saque(quantia);
        this.saldo -= 2.0;
    }

    public void pegarEmprestimo(Double quantia){
        if(quantia <= this.limiteEmprestimo){
            this.saldo += quantia - 10.0;
        }
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public String toString() {
        return "ContaEmpresarial [numero=" + numero + ", proprietario=" + proprietario +
         ", saldo=" + saldo + "limiteEmprestimo=" + limiteEmprestimo + "]";
    }

    

    

    




    
}
