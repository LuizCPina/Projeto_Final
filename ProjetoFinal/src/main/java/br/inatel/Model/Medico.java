package br.inatel.Model;

public class Medico {
    private String CRM;
    private String Nome;
    private String Especializacao;


    public Medico(String CRM, String nome, String Especializacao) {
        this.CRM = CRM;
        this.Nome = nome;
        this.Especializacao = Especializacao;
    }

    public String getCRM() {
        return this.CRM;
    }

    public String getNome() {
        return this.Nome;
    }

    public String getEspecializacao() {
        return this.Especializacao;
    }
}
