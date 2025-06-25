package br.edu.iftm.telacomarrylist.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.edu.iftm.telacomarrylist.model.Compromisso;

public class CompromissoController {
    public LocalDateTime converterDataHora(String data, String hora) {
        String dataHoraStr = data+ " " +hora;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraDt = LocalDateTime.parse(dataHoraStr, formato);
        return dataHoraDt;
    }

    public Compromisso novoCompromisso(String nome, String descricao, 
                                       String dataInicio, String horaInicio, 
                                       String dataFim, String horaFim) {
        LocalDateTime dataHoraInicio = converterDataHora(dataInicio, horaInicio);
        LocalDateTime dataHoraFim = converterDataHora(dataFim, horaFim);
        return new Compromisso(nome, descricao, dataHoraInicio, dataHoraFim);
    }

    public boolean alterarCompromisso(Compromisso compromisso, 
                                      String nome, String descricao, 
                                      String dataInicio, String horaInicio, 
                                      String dataFim, String horaFim) {
        try {
            if (!nome.isEmpty()) {
                compromisso.setNome(nome);
            }
            if (!descricao.isEmpty()) {
                compromisso.setDescricao(descricao);
            }
            if (!dataInicio.isEmpty() && !horaInicio.isEmpty()) {
                LocalDateTime dataHoraInicio = converterDataHora(dataInicio, horaInicio);
                compromisso.setDataHoraInicio(dataHoraInicio);
            }
            if (!dataFim.isEmpty() && !horaFim.isEmpty()) {
                LocalDateTime dataHoraFim = converterDataHora(dataFim, horaFim);
                compromisso.setDataHoraFim(dataHoraFim);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}