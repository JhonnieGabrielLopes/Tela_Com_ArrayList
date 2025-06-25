package br.edu.iftm.telacomarrylist;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.edu.iftm.telacomarrylist.controller.AgendaController;
import br.edu.iftm.telacomarrylist.model.Agenda;
import br.edu.iftm.telacomarrylist.model.Compromisso;
import br.edu.iftm.telacomarrylist.model.Usuario;

public class TelaComArryList {
    public static void main(String[] args) {
        Usuario login = new Usuario("Luiz", "12345"); //Usuario logado
        Agenda agenda = new Agenda(login); //Agenda do usuário
        AgendaController agendaController = new AgendaController(agenda); //Controller da Agenda

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //CADASTRO DO 1º COMPROMISSO
        List<Object> camposCadastro = new ArrayList<>();
        String nomeCompromisso = "Dentista";
        camposCadastro.add(nomeCompromisso);
        String descricaoCompromisso = "Levar documentos e Raio-X";
        camposCadastro.add(descricaoCompromisso);
        String dataInicioCompromisso = "24/06/2025";
        camposCadastro.add(dataInicioCompromisso);
        String horaInicioCompromisso = "13:00";
        camposCadastro.add(horaInicioCompromisso);
        String dataFimCompromisso = "24/06/2025";
        camposCadastro.add(dataFimCompromisso);
        String horaFimCompromisso = "17:00";
        camposCadastro.add(horaFimCompromisso);
        agendaController.cadastrarCompromisso(camposCadastro);

        //VISUALIZAÇÃO DO COMPROMISSO CADASTRADO
        List<Compromisso> compromissos = agendaController.listarCompromissos();
        int codCompromisso = 0;
        for (Compromisso compromisso : compromissos) {
            System.out.println("\n======================================");
            System.out.println("Codigo: "+codCompromisso);
            System.out.println("Nome: "+compromisso.getNome());
            System.out.println("Descrição: "+compromisso.getDescricao());
            String dataHoraInicio = compromisso.getDataHoraInicio().format(formatador);
            System.out.println("Inicio: "+dataHoraInicio);
            String dataHoraFim = compromisso.getDataHoraFim().format(formatador);
            System.out.println("Fim: "+dataHoraFim);
            System.out.println("======================================");
            codCompromisso++;
        }

        //CADASTRO DO 2º COMPROMISSO
        List<Object> camposCadastro2 = new ArrayList<>();
        nomeCompromisso = "Exame";
        camposCadastro2.add(nomeCompromisso);
        descricaoCompromisso = "Levar documentos e amostra de Urina";
        camposCadastro2.add(descricaoCompromisso);
        dataInicioCompromisso = "25/06/2025";
        camposCadastro2.add(dataInicioCompromisso);
        horaInicioCompromisso = "14:00";
        camposCadastro2.add(horaInicioCompromisso);
        dataFimCompromisso = "25/06/2025";
        camposCadastro2.add(dataFimCompromisso);
        horaFimCompromisso = "18:00";
        camposCadastro2.add(horaFimCompromisso);
        agendaController.cadastrarCompromisso(camposCadastro2);

        //VISUALIZAÇÃO DOS 2 COMPROMISSOS CADASTRADOS
        compromissos = agendaController.listarCompromissos();
        codCompromisso = 0;
        for (Compromisso compromisso : compromissos) {
            System.out.println("\n======================================");
            System.out.println("Codigo: "+codCompromisso);
            System.out.println("Nome: "+compromisso.getNome());
            System.out.println("Descrição: "+compromisso.getDescricao());
            String dataHoraInicio = compromisso.getDataHoraInicio().format(formatador);
            System.out.println("Inicio: "+dataHoraInicio);
            String dataHoraFim = compromisso.getDataHoraFim().format(formatador);
            System.out.println("Fim: "+dataHoraFim);
            System.out.println("======================================");
            codCompromisso++;
        }
        
        //ALTERAÇÃO DO 1º COMPROMISSO
        List<Object> camposAlteracao = new ArrayList<>();
        nomeCompromisso = "Tirar raio-x da boca";
        camposAlteracao.add(nomeCompromisso);
        descricaoCompromisso = "Não esquecer o pedido do exame e documentos";
        camposAlteracao.add(descricaoCompromisso);
        dataInicioCompromisso = "26/06/2025";
        camposAlteracao.add(dataInicioCompromisso);
        horaInicioCompromisso = "15:00";
        camposAlteracao.add(horaInicioCompromisso);
        dataFimCompromisso = "26/06/2025";
        camposAlteracao.add(dataFimCompromisso);
        horaFimCompromisso = "17:00";
        camposAlteracao.add(horaFimCompromisso);
        agendaController.alterarCompromisso(0, camposAlteracao);

        //VISUALIZAÇÃO DOS COMPROMISSOS COM O 1º ALTERADO
        compromissos = agendaController.listarCompromissos();
        codCompromisso = 0;
        for (Compromisso compromisso : compromissos) {
            System.out.println("\n======================================");
            System.out.println("Codigo: "+codCompromisso);
            System.out.println("Nome: "+compromisso.getNome());
            System.out.println("Descrição: "+compromisso.getDescricao());
            String dataHoraInicio = compromisso.getDataHoraInicio().format(formatador);
            System.out.println("Inicio: "+dataHoraInicio);
            String dataHoraFim = compromisso.getDataHoraFim().format(formatador);
            System.out.println("Fim: "+dataHoraFim);
            System.out.println("======================================");
            codCompromisso++;
        }

        //ALTERAÇÃO DO 2º COMPROMISSO
        List<Object> camposAlteracao2 = new ArrayList<>();
        nomeCompromisso = "Fazer exame de urina";
        camposAlteracao2.add(nomeCompromisso);
        descricaoCompromisso = "Laboratorio Carlos Chagas, não esquecer o pedido do exame";
        camposAlteracao2.add(descricaoCompromisso);
        dataInicioCompromisso = "27/06/2025";
        camposAlteracao2.add(dataInicioCompromisso);
        horaInicioCompromisso = "08:00";
        camposAlteracao2.add(horaInicioCompromisso);
        dataFimCompromisso = "27/06/2025";
        camposAlteracao2.add(dataFimCompromisso);
        horaFimCompromisso = "09:00";
        camposAlteracao2.add(horaFimCompromisso);
        agendaController.alterarCompromisso(1, camposAlteracao2);

        //VISUALIZAÇÃO DOS 2 COMPROMISSOS ALTERADOS
        compromissos = agendaController.listarCompromissos();
        codCompromisso = 0;
        for (Compromisso compromisso : compromissos) {
            System.out.println("\n======================================");
            System.out.println("Codigo: "+codCompromisso);
            System.out.println("Nome: "+compromisso.getNome());
            System.out.println("Descrição: "+compromisso.getDescricao());
            String dataHoraInicio = compromisso.getDataHoraInicio().format(formatador);
            System.out.println("Inicio: "+dataHoraInicio);
            String dataHoraFim = compromisso.getDataHoraFim().format(formatador);
            System.out.println("Fim: "+dataHoraFim);
            System.out.println("======================================");
            codCompromisso++;
        }

        //DELEÇÃO DO 1º COMPROMISSO
        agendaController.deletarCompromisso(0);

        //VISULIZAÇÃO APENAS DO 2º COMPROMISSO
        compromissos = agendaController.listarCompromissos();
        codCompromisso = 0;
        for (Compromisso compromisso : compromissos) {
            System.out.println("\n======================================");
            System.out.println("Codigo: "+codCompromisso);
            System.out.println("Nome: "+compromisso.getNome());
            System.out.println("Descrição: "+compromisso.getDescricao());
            String dataHoraInicio = compromisso.getDataHoraInicio().format(formatador);
            System.out.println("Inicio: "+dataHoraInicio);
            String dataHoraFim = compromisso.getDataHoraFim().format(formatador);
            System.out.println("Fim: "+dataHoraFim);
            System.out.println("======================================");
            codCompromisso++;
        }

        //DELEÇÃO DO ÚLTIMO COMPROMISSO
        agendaController.deletarCompromisso(0);

        //VISULIZAÇÃO DA AGENDA VAZIA
        compromissos = agendaController.listarCompromissos();

    }
}
