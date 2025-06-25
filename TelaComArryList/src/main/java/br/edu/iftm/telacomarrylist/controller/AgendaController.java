package br.edu.iftm.telacomarrylist.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.iftm.telacomarrylist.model.Agenda;
import br.edu.iftm.telacomarrylist.model.Compromisso;

public class AgendaController {
    private Agenda agenda;
    private CompromissoController compromissoController;

    public AgendaController(Agenda agenda) {
        this.compromissoController = new CompromissoController();
        this.agenda = agenda;
        if (agenda.getCompromissos() == null) {
            agenda.setCompromissos(new ArrayList<>());
        }
    }

    public boolean cadastrarCompromisso(List<Object> campos) {
        try {
            agenda.getCompromissos().add(compromissoController.novoCompromisso(campos.get(0).toString(), campos.get(1).toString(),
                                                                               campos.get(2).toString(), campos.get(3).toString(),
                                                                               campos.get(4).toString(), campos.get(5).toString()));
            System.out.println("\nCompromisso cadastrado!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nCompromisso não cadastrado!");
            return false;
        }
    }

    public boolean deletarCompromisso(int codCompromisso) {
        if (!agenda.getCompromissos().isEmpty()) {
            try {
                agenda.getCompromissos().remove(codCompromisso);
                System.out.println("\nCompromisso deletado!");
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("\nCompromisso não deletado!");
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean alterarCompromisso(int codCompromisso, List<Object> campos) {
        try {
            compromissoController.alterarCompromisso(agenda.getCompromissos().get(codCompromisso),
                                                     campos.get(0).toString(), campos.get(1).toString(),
                                                     campos.get(2).toString(), campos.get(3).toString(),
                                                     campos.get(4).toString(), campos.get(5).toString());
            System.out.println("\nCompromisso alterado!");
            return true;    
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nCompromisso não alterado!");
            return false;
        }
        
    }

    public List<Compromisso> listarCompromissos() {
        if (!agenda.getCompromissos().isEmpty()) {
            System.out.println("Compromissos obtidos!");
            return agenda.getCompromissos();
        } else {
            System.out.println("A agenda não possui compromissos!");
            return null;
        }
    }
}