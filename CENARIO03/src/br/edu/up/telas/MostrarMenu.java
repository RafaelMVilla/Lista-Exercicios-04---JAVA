package br.edu.up.telas;

import br.edu.up.controles.ControleCompromisso;
import br.edu.up.modelos.Compromisso;

import java.util.Scanner;

public class MostrarMenu {

    Scanner leitor = new Scanner(System.in);
    ControleCompromisso controle = new ControleCompromisso();

    public void menu() {

        int opcao = 0;
        do {
            System.out.println("-------------- DIGITE UMA OPÇÃO --------------");
            System.out.println("1. Cadastrar compromisso.");
            System.out.println("2. Listar compromisso.");
            System.out.println("3. Excluir compromisso.");
            System.out.println("4. Sair.");
            System.out.println("Seleciona a opção desejada: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    cadastroCompromisso();
                    break;
                case 2:
                    System.out.println("Digite o nome da pessoa: ");
                    String nomePessoa = leitor.nextLine();
                    listaCompromisso(nomePessoa);
                    break;
                case 3:
                    System.out.println("Digite o nome da pessoa: ");
                    nomePessoa = leitor.nextLine();
                    excluirCompromisso(nomePessoa);
                    break;
                case 4:
                    System.out.println("ENCERRANDO...");
                    break;
            }

        } while (opcao != 4);

    }

    public void cadastroCompromisso() {

        for (int i = 0; i < 5; i++) {

            Compromisso compromisso = new Compromisso();

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
                compromisso.setMes(leitor.nextInt());
                if (compromisso.getMes() > 12 || compromisso.getMes() < 0) {
                    System.out.println("ERRO!!! MÊS INDISPONÍVEL!!!");
                }
                // mes.verificadorDias(mes.getNome());
            } while (compromisso.getMes() > 12 || compromisso.getMes() < 0);

            System.out.println("Dia: ");
            compromisso.setDia(leitor.nextInt());

            do {
                System.out.println("Ano: ");
                compromisso.setAno(leitor.nextInt());
                if (compromisso.getAno() < 2024) {
                    System.out.println("ERRO!!! anoNovo INDISPONÍVEL!!!");
                }
            } while (compromisso.getAno() < 2024);

            controle.cadastroCompromisso(compromisso, i);

            System.out.println("CADASTRO CONCLUIDO!");

            leitor.nextLine();
        }
    }

    public void listaCompromisso(String pessoa) {
        Compromisso compromisso = controle.buscarPorPessoa(pessoa);

        if (compromisso != null) {
            System.out.println(compromisso);
        }

    }

    public void excluirCompromisso(String pessoa) {
        controle.excluirCompromisso(pessoa);
        System.out.println("Excluido com sucesso!");
    }
}
