package br.edu.up.controles;

import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {

    Scanner leitor = new Scanner(System.in);

    List<Professor> listaProfessores = new ArrayList<>();
    List<Aluno> listAlunos = new ArrayList<>();
    List<Disciplina> listaDisciplinas = new ArrayList<>();
    Professor professor = new Professor();
    Aluno aluno = new Aluno();
    Disciplina disciplina = new Disciplina();

    public void cadastroDisciplina() {
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
        listaDisciplinas.add(disciplina);

    }

    public void cadastroProfessor() {
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

        listaProfessores.add(professor);
    }

    public void cadastroAluno() {
        System.out.println("DIGITE O NOME DO ALUNO: ");
        aluno.setNome(leitor.nextLine());
        System.out.println("DIGITE O RG: ");
        aluno.setRg(leitor.nextLine());
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

        listAlunos.add(aluno);
    }

    public void mostrarDisciplina(int i) {
        System.out.println(listaDisciplinas.get(i));
    }

    public void mostrarProfessor(int i) {
        System.out.println(listaProfessores.get(i));
    }

    public void mostrarAluno(int i) {
        System.out.println(listAlunos.get(i));
    }

    public void cadastroFinalizado() {
        System.out.println("<--------------------------------->");
        System.out.println("CADASTRO FINALIZADO COM SUCESSO!!!");
    }

    public void excluirDisciplina(int i) {
        listaDisciplinas.remove(i);
    }

    public void excluirProfessor(int i) {
        listaProfessores.remove(i);
    }

    public void excluirAluno(int i) {
        listAlunos.remove(i);
    }

    public void excluirFinalizado() {
        System.out.println("<--------------------------------->");
        System.out.println("EXCLUIDO COM SUCESSO!!!");
    }
}
