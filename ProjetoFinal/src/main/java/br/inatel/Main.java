package br.inatel;

import br.inatel.DAO.connectionDAO;
import br.inatel.Model.Consulta;
import br.inatel.Model.Diagnostico;
import br.inatel.Model.Paciente;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);




        int opcao=-1;

        while (opcao != 0) {
            System.out.println("---- BEM VINDO AO SISTEMA DA CLINICA ----");
            System.out.println("SELECIONE A OPÇÃO QUE DESEJA: ");
            System.out.println();
            System.out.println("1- Cadastrar paciente ao sistema");
            System.out.println("2- Agendar consulta");
            System.out.println("3- Dar baixa em diagnóstico");
            System.out.println("4- Mostrar informacao de medico");
            System.out.println("5- Mostrar pacientes");
            System.out.println("6- Mostrar consultas");
            System.out.println("CASO QUEIRA SAIR DO MENU, DIGITE 0");
            System.out.println();

            opcao = entrada.nextInt();
            entrada.nextLine();



                switch (opcao) {
                    case 1:
                        System.out.println("Digite o cpf do paciente: ");
                        String auxcpf = entrada.nextLine();
                        System.out.println("Digite o nome do paciente: ");
                        String auxnome = entrada.nextLine();
                        System.out.println("Digite a idade do paciente: ");
                        int auxidade = entrada.nextInt();
                        entrada.nextLine();

                        Paciente pacienteaux = new Paciente(auxcpf, auxnome, auxidade);

                        connectionDAO.insertPaciente(pacienteaux);


                        pacienteaux = null;


                        break;

                    case 2:

                        System.out.println("Digite a data da consulta: ");
                        String auxdata = entrada.nextLine();
                        System.out.println("Digite a sala da consulta: ");
                        String auxsala = entrada.nextLine();
                        System.out.println("Digite o cpf do paciente: ");
                        String auxcpfC = entrada.nextLine();
                        System.out.println("Digite o crm do medico: ");
                        String auxcrmC = entrada.nextLine();
                        System.out.println("ID da consulta: ");
                        String idaux = entrada.nextLine();

                        Consulta consultaaux = new Consulta(auxdata, auxsala, auxcpfC, auxcrmC, idaux);

                        connectionDAO.insertConsulta(consultaaux);


                        consultaaux = null;


                        break;

                    case 3:
                        System.out.println("ID do diagnóstico: ");
                        String auxdiag = entrada.nextLine();
                        System.out.println("Descricao do diagnóstico: ");
                        String descaux = entrada.nextLine();
                        System.out.println("ID da consulta: ");
                        String idauxD = entrada.nextLine();

                        Diagnostico diagnosticoaux = new Diagnostico(auxdiag, descaux, idauxD);

                        connectionDAO.insertDiagnostico(diagnosticoaux);


                        diagnosticoaux = null;


                        break;

                    case 4:

                        connectionDAO.selectMedico();



                        break;

                    case 5:

                        connectionDAO.selectPaciente();

                        break;

                    case 6:

                        connectionDAO.selectConsulta();

                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }


        }



    }

}
