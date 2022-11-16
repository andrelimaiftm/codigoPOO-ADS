package br.edu.iftm.heranca;

public class Pedagoga extends Funcionario{

    public Pedagoga(String nome, int idade, char sexo, String setor, String trabalhando) {
        super(nome, idade, sexo, setor, trabalhando);
    }

    @Override
    public String toString() {
        return "Pedagoga{" +
                "setor='" + setor + '\'' +
                ", trabalhando='" + trabalhando + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
