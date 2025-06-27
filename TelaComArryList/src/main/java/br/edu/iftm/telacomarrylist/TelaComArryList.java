package br.edu.iftm.telacomarrylist;

import br.edu.iftm.telacomarrylist.model.Agenda;
import br.edu.iftm.telacomarrylist.view.Tela;

public class TelaComArryList {
    private static Agenda agenda = new Agenda();
    
    public static void main(String[] args) {
        Tela tela = new Tela(agenda);
        tela.setVisible(true);
    }
}
