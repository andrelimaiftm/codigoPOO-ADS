package br.edu.iftm.heranca;

public class Professor extends  Funcionario{

    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, char sexo,  String setor, String trabalhando, String especialidade, double salario) {
        super(nome, idade, sexo, setor, trabalhando);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(){
        //this.salario = this.salario + this.salario*0.1;
        this.salario += this.salario*0.1;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "setor='" + setor + '\'' +
                ", trabalhando='" + trabalhando + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
