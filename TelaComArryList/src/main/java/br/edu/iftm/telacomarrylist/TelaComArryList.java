package br.edu.iftm.telacomarrylist;

import br.edu.iftm.telacomarrylist.model.Compromisso;
import br.edu.iftm.telacomarrylist.model.Usuario;
import br.edu.iftm.telacomarrylist.view.Tela;
import java.util.ArrayList;

public class TelaComArryList {
    
    public static void main(String[] args) {
        ArrayList<Compromisso> compromissos = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Tela tela = new Tela(compromissos, usuarios);
        tela.setVisible(true);
    }
}
