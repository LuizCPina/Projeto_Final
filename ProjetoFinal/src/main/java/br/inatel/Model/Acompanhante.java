package br.inatel.Model;

public class Acompanhante {

    private String CPF;
    private String Nome;
    private int Idade;
    private String Paciente_CPF;

    public Acompanhante(String CPF, String nome, int idade, String paciente_CPF) {
        this.CPF = CPF;
        this.Nome = nome;
        this.Idade = idade;
        this.Paciente_CPF = paciente_CPF;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getCpf() {
        return this.CPF;
    }

    public int getIdade() {
        return this.Idade;
    }

    public String getPaciente_CPF() {
        return this.Paciente_CPF;
    }
}
