package br.edu.up.controles;

import br.edu.up.modelos.Compromisso;
import br.edu.up.modelos.Dia;
import br.edu.up.modelos.Mes;
import br.edu.up.modelos.Ano;

public class ControleCompromisso {
    Compromisso[] compromisso = new Compromisso[5];
    Dia dia = new Dia();
    Mes mes = new Mes();
    Ano ano = new Ano();

    public void cadastroCompromisso(Compromisso compromisso, int i) {
        this.compromisso[i] = compromisso;
    }

    public Compromisso buscarPorPessoa(String pessoa) {
        for (int i = 0; i < compromisso.length; i++) {
            if (compromisso[i].getPessoa().equals(pessoa)) {
                return compromisso[i];
            }
        }
        return null;
    }

    public void excluirCompromisso(String pessoa) {

        for (int j = 0; j < 5; j++) {
            if (compromisso[j].getPessoa().equals(pessoa)) {

                compromisso[j].setPessoa("");
                compromisso[j].setLocal("");
                compromisso[j].setHora(0);
                compromisso[j].setAssunto("");
                compromisso[j].setMes(0);
                compromisso[j].setDia(0);
                compromisso[j].setAno(0);
            }
        }
    }
}
