package br.inatel.Model;

public class Consulta {

    private String Data;
    private String Sala;
    private String Descricao;
    private String Paciente_CPF;
    private String Medico_CRM;
    private String IdConsulta;

    public Consulta(String data, String sala, String paciente_CPF, String medico_CRM, String IdConsulta) {
        this.Data = data;
        this.Sala = sala;
        this.Paciente_CPF = paciente_CPF;
        this.Medico_CRM = medico_CRM;
        this.IdConsulta = IdConsulta;
    }

    public String getData() {
        return this.Data;
    }

    public String getSala() {
        return this.Sala;
    }

    public String getPaciente_CPF() {
        return this.Paciente_CPF;
    }

    public String getMedico_CRM() {
        return this.Medico_CRM;
    }


    public String getIdConsulta() {
        return this.IdConsulta;
    }
}
