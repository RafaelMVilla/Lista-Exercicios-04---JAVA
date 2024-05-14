package br.edu.up.telas;

import br.edu.up.controles.ControleAcademico;
import java.util.Scanner;

public class MostrarControleAcademico {
    public void mostrarControleAcademico() {
        Scanner leitor = new Scanner(System.in);
        ControleAcademico controle = new ControleAcademico();
        int opcao;
        int novaOpcao;
        int i;
        do {
            System.out.println("<----------- SELECIONE UMA OPÇÃO ----------->");
            System.out.println("1. CADASTRAR.");
            System.out.println("2. LISTAR.");
            System.out.println("3. EXCLUIR");
            System.out.println("4. SAIR");
            System.out.println("Digite uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("<----------- SELECIONE UMA OPÇÃO ----------->");
                    System.out.println("1. CADASTRAR DISCIPLINA.");
                    System.out.println("2. CADASTRAR PROFESSOR.");
                    System.out.println("3. CADASTRAR ALUNO.");
                    System.out.println("DIGITE A OPÇÃO: ");
                    novaOpcao = leitor.nextInt();
                    switch (novaOpcao) {
                        case 1:
                            controle.cadastroDisciplina();
                            controle.cadastroFinalizado();
                            break;
                        case 2:
                            controle.cadastroProfessor();
                            controle.cadastroFinalizado();
                            break;
                        case 3:
                            controle.cadastroAluno();
                            controle.cadastroFinalizado();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("<----------- SELECIONE UMA OPÇÃO ----------->");
                    System.out.println("1. MOSTRAR DISCIPLINA.");
                    System.out.println("2. MOSTRAR PROFESSOR.");
                    System.out.println("3. MOSTRAR ALUNO.");
                    System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                    novaOpcao = leitor.nextInt();
                    switch (novaOpcao) {
                        case 1:
                            System.out.printf("DIGITE O INDICE DESEJADO: ");
                            i = leitor.nextInt();
                            controle.mostrarDisciplina(i);
                            System.out.println("<------------------------------->");
                            break;
                        case 2:
                            System.out.printf("DIGITE O INDICE DESEJADO: ");
                            i = leitor.nextInt();
                            controle.mostrarProfessor(i);
                            System.out.println("<------------------------------->");
                            break;
                        case 3:
                            System.out.printf("DIGITE O INDICE DESEJADO: ");
                            i = leitor.nextInt();
                            controle.mostrarAluno(i);
                            System.out.println("<------------------------------->");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("<----------- SELECIONE UMA OPÇÃO ----------->");
                    System.out.println("1. EXCLUIR DISCIPLINA.");
                    System.out.println("2. EXCLUIR PROFESSOR.");
                    System.out.println("3. EXCLUIR ALUNO.");
                    System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                    novaOpcao = leitor.nextInt();
                    switch (novaOpcao) {
                        case 1:
                            System.out.printf("DIGITE O INDICE DESEJADO: ");
                            i = leitor.nextInt();
                            controle.excluirDisciplina(i);
                            controle.excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                        case 2:
                            System.out.printf("DIGITE O INDICE DESEJADO: ");
                            i = leitor.nextInt();
                            controle.excluirProfessor(i);
                            controle.excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                        case 3:
                            System.out.printf("DIGITE O INDICE DESEJADO: ");
                            i = leitor.nextInt();
                            controle.excluirAluno(i);
                            controle.excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                    }
                    break;
            }

            if (opcao == 4) {
                System.out.println("ENCERRANDO...");
            }
        } while (opcao != 4);

        leitor.close();
    }
}
