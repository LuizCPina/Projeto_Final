package br.inatel.Model;

public class Diagnostico{
    private String idDiagnostico;

    private String Descricao;

    private String Consulta_IdConsulta;
    public Diagnostico(String idDiagnostico, String descricao, String consulta_IdConsulta) {
        this.idDiagnostico = idDiagnostico;
        this.Descricao = descricao;
        this.Consulta_IdConsulta = consulta_IdConsulta;

    }

    public String getIdDiagnostico() {
        return idDiagnostico;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getConsulta_IdConsulta() {
        return Consulta_IdConsulta;
    }
}
