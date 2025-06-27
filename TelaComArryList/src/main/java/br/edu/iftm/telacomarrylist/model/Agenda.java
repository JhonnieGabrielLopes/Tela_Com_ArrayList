package br.edu.iftm.telacomarrylist.model;

import java.util.List;

public class Agenda {
    private List<Compromisso> compromissos;
    private Usuario usuario;

    public Agenda(){}
    public Agenda (Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Compromisso> getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(List<Compromisso> compromissos) {
        this.compromissos = compromissos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}