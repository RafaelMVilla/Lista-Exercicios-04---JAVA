package br.edu.up.controles;

import java.util.Scanner;
import br.edu.up.modelos.Compromisso;
import br.edu.up.modelos.Dia;
import br.edu.up.modelos.Mes;
import br.edu.up.modelos.Ano;

public class CadastroCompromisso {
    Scanner leitor = new Scanner(System.in);
    Compromisso compromisso = new Compromisso();
    Dia dia = new Dia();
    Mes mes = new Mes();
    Ano ano = new Ano();

    public void cadastroCompromisso() {

        System.out.println("Pessoa: ");
        compromisso.setPessoa(leitor.nextLine());

        System.out.println("Local: ");
        compromisso.setLocal(leitor.nextLine());

        do {
            System.out.println("Horário: ");
            compromisso.setHora(leitor.nextInt());
            if (compromisso.getHora() > 24 || compromisso.getHora() < 0) {
                System.out.println("ERRO!!! HORÁRIO INDISPONIVEL!!!");
            }
        } while (compromisso.getHora() > 24 || compromisso.getHora() < 0);

        leitor.nextLine();

        System.out.println("Assunto: ");
        compromisso.setAssunto(leitor.nextLine());

        do {
            System.out.println("---------- Digite em número ----------");
            System.out.println("Mês: ");
            mes.setNome(leitor.nextInt());
            if (mes.getNome() > 12 || mes.getNome() < 0) {
                System.out.println("ERRO!!! MÊS INDISPONÍVEL!!!");
            }
            mes.verificadorDias(mes.getNome());
        } while (mes.getNome() > 12 || mes.getNome() < 0);

        do {
            System.out.println("Dia: ");
            dia.setDiaMes(leitor.nextInt());
            if (mes.getQtdeDias() < dia.getDiaMes() || dia.getDiaMes() > 31 || dia.getDiaMes() < 0) {
                System.out.println("ERRO!!! DIA INDISPONÍVEL!!!");
            }
        } while (mes.getQtdeDias() < dia.getDiaMes() || dia.getDiaMes() > 31 || dia.getDiaMes() < 0);

        do {
            System.out.println("Ano: ");
            ano.setAno(leitor.nextInt());
            if (ano.getAno() < 2024) {
                System.out.println("ERRO!!! ANO INDISPONÍVEL!!!");
            }
        } while (ano.getAno() < 2024);

        // int qtdeDiasAno

        // ano.verificadorAno(qtdeDiasAno);

    }

    public void listaCompromisso() {
        System.out.println("PESSOA: " + compromisso.getPessoa());
        System.out.println("LOCAL: " + compromisso.getLocal());
        System.out.println("HORÁRIO: " + compromisso.getHora());
        System.out.println("ASSUNTO: " + compromisso.getAssunto());
        System.out.println("MÊS: " + mes.getNome());
        System.out.println("DIA: " + dia.getDiaMes());
        System.out.println("ANO: " + ano.getAno());
    }

    public void excluirCompromisso() {
        compromisso.setPessoa("");
        compromisso.setLocal("");
        compromisso.setHora(0);
        compromisso.setAssunto("");
        mes.setNome(0);
        dia.setDiaMes(0);
        ano.setAno(0);
    }
}
