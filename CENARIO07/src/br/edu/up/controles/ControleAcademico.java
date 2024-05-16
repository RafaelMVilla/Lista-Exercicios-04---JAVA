package br.edu.up.controles;

import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {

    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Aluno> listAlunos = new ArrayList<>();
    private List<Disciplina> listaDisciplinas = new ArrayList<>();

    public void cadastroDisciplina(Disciplina disciplina) {
        listaDisciplinas.add(disciplina);
    }

    public void cadastroProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public void cadastroAluno(Aluno aluno) {
        listAlunos.add(aluno);
    }

    public Disciplina mostrarDisciplina(int i) {
        for (Disciplina disciplina : listaDisciplinas) {
            if (disciplina.getIdentificador() == i) {
                return disciplina;
            }
        }
        return null;
    }

    public Professor mostrarProfessor(int i) {
        for (Professor professor : listaProfessores) {
            if (professor.getNumIdentificador() == i) {
                return professor;
            }
        }
        return null;
    }

    public Aluno mostrarAluno(int rg) {
        for (Aluno aluno : listAlunos) {
            if (aluno.getRg() == rg) {
                return aluno;
            }
        }
        return null;
    }

    public void excluirDisciplina(int i) {
        listaDisciplinas.remove(i);
    }

    public void excluirProfessor(int i) {
        listaProfessores.remove(i);
    }

    public void excluirAluno(int rg) {
        listAlunos.remove(rg);
    }
}
