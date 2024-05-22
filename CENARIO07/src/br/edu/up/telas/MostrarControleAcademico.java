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
                            System.out.printf("DIGITE O NOME DA DISCIPLINA: ");
                            String nome = leitor.nextLine();
                            mostrarDisciplina(nome);
                            System.out.println("<------------------------------->");
                            break;
                        case 2:
                            System.out.printf("DIGITE O NÚMERO IDENTIFICADOR: ");
                            int num = leitor.nextInt();
                            mostrarProfessor(num);
                            System.out.println("<------------------------------->");
                            break;
                        case 3:
                            System.out.printf("DIGITE O RG DO ALUNO: ");
                            int rg = leitor.nextInt();
                            mostrarAluno(rg);
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
                            System.out.printf("DIGITE O NUMERO IDENTIFICADOR: ");
                            int numIdent = leitor.nextInt();
                            excluirDisciplina(numIdent);
                            excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                        case 2:
                            System.out.printf("DIGITE O RG DO PROFESSOR: ");
                            String rg = leitor.nextLine();
                            excluirProfessor(rg);
                            excluirFinalizado();
                            System.out.println("<------------------------------->");
                            break;
                        case 3:
                            System.out.printf("DIGITE O RG DO ALUNO: ");
                            int rgAluno = leitor.nextInt();
                            excluirAluno(rgAluno);
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
        for (int i = 0; i < 3; i++) {
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

            controle.incluirDisciplina(disciplina, i);
        }
    }

    public void cadastroProfessor() {
        for (int i = 0; i < 5; i++) {

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

            controle.cadastroProfessor(professor, i);
        }
    }

    public void cadastroAluno() {
        for (int i = 0; i < 10; i++) {

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

            controle.cadastroAluno(aluno, i);
        }
    }

    public void cadastroFinalizado() {
        System.out.println("<--------------------------------->");
        System.out.println("CADASTRO FINALIZADO COM SUCESSO!!!");
    }

    public void mostrarDisciplina(String nome) {
        Disciplina disciplina = controle.buscarPorNome(nome);

        if (disciplina != null) {
            System.out.println(disciplina);
        }
    }

    public void mostrarProfessor(int num) {
        Professor professor = controle.buscarPorNumIdent(num);
        if (professor != null) {
            System.out.println(professor);
        }
    }

    public void mostrarAluno(int rg) {
        Aluno aluno = controle.buscarPorRG(rg);
        if (aluno != null) {
            System.out.println(aluno);
        }
    }

    public void excluirDisciplina(int numIdent) {
        controle.excluirDisciplina(numIdent);
    }

    public void excluirProfessor(String rg) {
        controle.excluirProfessor(rg);
    }

    public void excluirAluno(int rgAluno) {
        controle.excluirAluno(rgAluno);
    }

    public void excluirFinalizado() {
        System.out.println("<--------------------------------->");
        System.out.println("EXCLUIDO COM SUCESSO!!!");
    }
}
