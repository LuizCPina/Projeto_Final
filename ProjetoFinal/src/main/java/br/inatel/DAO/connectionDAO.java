package br.inatel.DAO;

import br.inatel.Model.*;

import java.sql.*;
import java.util.ArrayList;

public abstract class connectionDAO {
    static Connection con; // conexäo
    static PreparedStatement pst; // declaracåo(query) preparata
    static Statement st; //declaracäo(query)
    static ResultSet rs; //resposta do banco

    static String database = "ProjetoFinal";

    static String user = "root";
    static String password = "Gramaverde0";
    static String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPulbicKeyRetrieval=true";

    public static void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static boolean insertAcompanhante(Acompanhante user) {
        connectToDB();
        boolean sucesso = false;
        String sql = "INSERT INTO Acompanhante (Nome,CPF,Idade,Paciente_CPF) values (?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNome());
            pst.setString(2, user.getCpf());
            pst.setInt(3, user.getIdade());
            pst.setString(4, user.getPaciente_CPF());


            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean insertConsulta(Consulta user) {
        connectToDB();
        boolean sucesso = false;
        String sql = "INSERT INTO Consulta (Data,Sala,Paciente_CPF,Medico_CRM,IdConsulta) values (?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getData());
            pst.setString(2, user.getSala());
            pst.setString(3, user.getPaciente_CPF());
            pst.setString(4, user.getMedico_CRM());
            pst.setString(5, user.getIdConsulta());


            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean insertDiagnostico(Diagnostico user) {
        connectToDB();
        boolean sucesso = false;
        String sql = "INSERT INTO Diagnostico (idDiagnostico,Descricao,Consulta_IdConsulta) values (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getIdDiagnostico());
            pst.setString(2, user.getDescricao());
            pst.setString(3, user.getConsulta_IdConsulta());


            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean insertMedico(Medico user) {
        connectToDB();
        boolean sucesso = false;
        String sql = "INSERT INTO Medico (CRM,Nome,Especializacao) values (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getCRM());
            pst.setString(2, user.getNome());
            pst.setString(3, user.getEspecializacao());


            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean insertPaciente(Paciente user) {
        connectToDB();
        boolean sucesso = false;
        String sql = "INSERT INTO Paciente (CPF,Nome,Idade) values (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(2, user.getNome());
            pst.setString(1, user.getCPF());
            pst.setInt(3, user.getIdade());



            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (Exception e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean deleteAcompanhante(String cpf) {
        connectToDB();
        boolean sucesso = false;
        String sql = "DELETE FROM Acompanhante WHERE CPF = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);

            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean deleteConsulta(String id) {
        connectToDB();
        boolean sucesso = false;
        String sql = "DELETE FROM Consulta WHERE IdConsulta = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);

            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean deleteDiagnostico(String id) {
        connectToDB();
        boolean sucesso = false;
        String sql = "DELETE FROM Diagnostico WHERE idDiagnostico = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);

            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean deleteMedico(String crm) {
        connectToDB();
        boolean sucesso = false;
        String sql = "DELETE FROM Acompanhante WHERE CRM = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, crm);

            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static boolean deletePaciente(String cpf) {
        connectToDB();
        boolean sucesso = false;
        String sql = "DELETE FROM Paciente WHERE CPF = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);

            pst.execute();
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return sucesso;
    }

    public static ArrayList<Paciente> selectPaciente() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        connectToDB();
        boolean sucesso = false;
        String sql = "SELECT * FROM Paciente";
        try {
            st =  con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Pacientes: ");

            while(rs.next()){
                Paciente pacienteaux = new Paciente(rs.getString("Nome"),rs.getString("CPF"),rs.getInt("Idade"));
                System.out.println("Nome : "+pacienteaux.getNome());
                System.out.println("CPF: "+pacienteaux.getCPF());
                System.out.println("Idade: "+pacienteaux.getIdade());
                System.out.println("===============================");
                pacientes.add(pacienteaux);
            }

            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (NullPointerException e) {
                System.out.println("Erro: "+e.getMessage() );

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return pacientes;
    }

    public static ArrayList<Medico> selectMedico() {
        ArrayList<Medico> medicos = new ArrayList<>();
        connectToDB();
        boolean sucesso = false;
        String sql = "SELECT * FROM Medico";
        try {
            st =  con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Medicos: ");

            while(rs.next()){
                Medico medicoaux = new Medico(rs.getString("CRM"),rs.getString("Nome"),rs.getString("Especializacao")  );
                System.out.println("Nome : "+medicoaux.getNome());
                System.out.println("CPF: "+medicoaux.getCRM());
                System.out.println("Especializacao: "+medicoaux.getEspecializacao());
                System.out.println("===============================");
                medicos.add(medicoaux);
            }

            sucesso = true;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);

                }
            } catch (NullPointerException e) {
                System.out.println("Erro: "+e.getMessage() );

            }
        }
        return medicos;
    }

    public static ArrayList<Consulta> selectConsulta() {
        ArrayList<Consulta> consultas = new ArrayList<>();
        connectToDB();
        boolean sucesso = false;
        String sql = "SELECT * FROM Consulta";
        try {
            st =  con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Consultas: ");

            while(rs.next()){
                Consulta consultaaux = new Consulta(rs.getString("Data"),rs.getString("Sala"),rs.getString("Paciente_CPF") ,rs.getString("Medico_CRM"),rs.getString("IdConsulta") );
                System.out.println("Data: "+consultaaux.getData());
                System.out.println("Sala: "+consultaaux.getSala());
                System.out.println("CPF do paciente: "+consultaaux.getPaciente_CPF());
                System.out.println("CRM do medico: "+consultaaux.getMedico_CRM());
                System.out.println("ID da consulta: "+consultaaux.getIdConsulta());
                System.out.println("===============================");
                consultas.add(consultaaux);
            }

            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (NullPointerException e) {
                System.out.println("Erro: "+e.getMessage() );

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return consultas;
    }



}

