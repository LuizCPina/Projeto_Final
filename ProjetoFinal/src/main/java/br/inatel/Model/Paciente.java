package br.inatel.Model;

public class Paciente {
    private String CPF;
    private String Nome;
    private int Idade;

    public Paciente(String CPF, String nome, int idade) {
        this.CPF = CPF;
        this.Nome = nome;
        this.Idade = idade;
    }



    public String getCPF() {
        return this.CPF;
    }

    public String getNome() {
        return this.Nome;
    }

    public int getIdade() {
        return this.Idade;
    }


}
