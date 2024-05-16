package br.edu.up.telas;

import br.edu.up.controles.ControleAcademico;
import java.util.Scanner;
import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;

public class MostrarControleAcademico {

    Scanner leitor = new Scanner(System.in);
    ControleAcademico controle = new ControleAcademico();
    int opcao;
    int novaOpcao;
    int i;

    public void mostrarControleAcademico() {
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
                    leitor.nextLine();
                    switch (novaOpcao) {
                        case 1:
                            cadastroDisciplina();
                            cadastroFinalizado();
                            break;
                        case 2:
                            cadastroProfessor();
                            cadastroFinalizado();
                            break;
                        case 3:
                            cadastroAluno();
                            cadastroFinalizado();
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
                    leitor.nextLine();
                    switch (novaOpcao) {
                        case 1:
                            System.out.printf("DIGITE O IDENTIFICADOR: ");
                            i = leitor.nextInt();
                            mostrarDisciplina(i);
                            System.out.println("<------------------------------->");
                            break;
                        case 2:
                            System.out.printf("DIGITE O NÚMERO IDENTIFICADOR: ");
                            i = leitor.nextInt();
                            mostrarProfessor(i);
                            System.out.println("<------------------------------->");
                            break;
                        case 3:
                            System.out.printf("DIGITE O RG DO ALUNO: ");
                            i = leitor.nextInt();
                            mostrarAluno(i);
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
                    leitor.nextLine();
                    switch (novaOpcao) {
                        case 1:
                            System.out.printf("DIGITE O IDENTIFICADOR: ");
                            i = leitor.nextInt();
                            excluirDisciplina(i);
                            excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                        case 2:
                            System.out.printf("DIGITE O INDICE DESEJADO: ");
                            i = leitor.nextInt();
                            excluirProfessor(i);
                            excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                        case 3:
                            System.out.printf("DIGITE O RG DO ALUNO: ");
                            i = leitor.nextInt();
                            excluirAluno(i);
                            excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                    }
                    break;
            }

            if (opcao == 4) {
                System.out.println("ENCERRANDO...");
            }
        } while (opcao != 4);

    }

    public void cadastroDisciplina() {
        Disciplina disciplina = new Disciplina();
        System.out.println("DIGITE O NOME DA DISCIPLIA: ");
        disciplina.setNomeDisciplina(leitor.nextLine());
        System.out.println("DIGITE O NÚMERO IDENTIFICADOR: ");
        disciplina.setIdentificador(leitor.nextInt());
        leitor.nextLine();
        System.out.println("DIGITE O CURRICULO: ");
        disciplina.setCurriculo(leitor.nextLine());
        System.out.println("DIGITE A COMPETÊNCIAS: ");
        disciplina.setCompetencias(leitor.nextInt());
        leitor.nextLine();
        System.out.println("DIGITE O PROFESSOR RESPONSÁVEL: ");
        disciplina.setProfessor(leitor.nextLine());
    }

    public void cadastroProfessor() {
        Professor professor = new Professor();
        System.out.println("DIGITE O NOME DO PROFESSOR: ");
        professor.setNome(leitor.nextLine());
        System.out.println("DIGITE O RG: ");
        professor.setRg(leitor.nextLine());
        System.out.println("DIGITE A MATRICULA: ");
        professor.setMatricula(leitor.nextLine());
        System.out.println("DIGITE O NÚMERO DE IDENTIFICAÇÃO: ");
        professor.setNumIdentificador(leitor.nextInt());
        leitor.nextLine();
        System.out.println("DIGITE A TITULAÇÃO: ");
        professor.setTitulacao(leitor.nextLine());
        System.out.println("DIGITE O NOME DA INSTITUIÇÃO: ");
        professor.setNomeInstituicao(leitor.nextLine());
        System.out.println("DIGITE O ANO DE CONCLUSÃO: ");
        professor.setAnoConclusao(leitor.nextInt());
        leitor.nextLine();
        System.out.println("DIGITE O NOME DO TÍTULO: ");
        professor.setNomeTitulo(leitor.nextLine());
        System.out.println("DIGITE O TÍTULO DO TRABALHO: ");
        professor.setTituloTrabalho(leitor.nextLine());
    }

    public void cadastroAluno() {
        Aluno aluno = new Aluno();
        System.out.println("DIGITE O NOME DO ALUNO: ");
        aluno.setNome(leitor.nextLine());
        System.out.println("DIGITE O RG: ");
        aluno.setRg(leitor.nextInt());
        System.out.println("DIGITE A MATRICULA: ");
        aluno.setMatricula(leitor.nextLine());
        System.out.println("DIGITE O ANO DE INGRESSÃO: ");
        aluno.setAnoIngressao(leitor.nextInt());
        leitor.nextLine();
        System.out.println("DIGITE O NOME DO CURSO: ");
        aluno.setNomeCurso(leitor.nextLine());
        System.out.println("DIGITE O TURNO: ");
        aluno.setTurno(leitor.nextInt());
        leitor.nextLine();
    }

    public void cadastroFinalizado() {
        System.out.println("<--------------------------------->");
        System.out.println("CADASTRO FINALIZADO COM SUCESSO!!!");
    }

    public void mostrarDisciplina(int i) {
        Disciplina disciplina = controle.mostrarDisciplina(i);
        if (disciplina != null) {
            System.out.println(disciplina);
        }
    }

    public void mostrarProfessor(int i) {
        Professor professor = controle.mostrarProfessor(i);
        if (professor != null) {
            System.out.println(professor);
        }
    }

    public void mostrarAluno(int rg) {
        Aluno aluno = controle.mostrarAluno(rg);
        if (aluno != null) {
            System.out.println(aluno);
        }
    }

    public void excluirDisciplina(int i) {
        controle.excluirDisciplina(i);
    }

    public void excluirProfessor(int i) {
        controle.excluirProfessor(i);
    }

    public void excluirAluno(int rg) {
        controle.excluirAluno(rg);
    }

    public void excluirFinalizado() {
        System.out.println("<--------------------------------->");
        System.out.println("EXCLUIDO COM SUCESSO!!!");
    }
}
