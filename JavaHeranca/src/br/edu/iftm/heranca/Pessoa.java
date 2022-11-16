package br.edu.iftm.heranca;

public class Pessoa {

    //atributos da classe
    protected String nome;
    protected int idade;
    protected char sexo;

    //metodo construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniversario(){
        String msg = String.format("Feliz Aniversário %s",this.nome);
        this.idade++;
        System.out.println(msg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
   public String toString() {
       return String.format("Pessoa{ nome=%s, idade=%d, sexo=%c }",nome, idade, sexo);
   }
}
