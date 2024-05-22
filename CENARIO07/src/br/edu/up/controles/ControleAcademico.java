package br.edu.up.controles;

import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;

public class ControleAcademico {

    private Disciplina[] disciplinas = new Disciplina[3];
    private Professor[] professores = new Professor[5];
    private Aluno[] alunos = new Aluno[10];

    public void incluirDisciplina(Disciplina disciplina, int i) {
        disciplinas[i] = disciplina;
    }

    public void cadastroProfessor(Professor professor, int i) {
        professores[i] = professor;
    }

    public void cadastroAluno(Aluno aluno, int i) {
        alunos[i] = aluno;
    }

    public Disciplina buscarPorNome(String nome) {

        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i].getNomeDisciplina().equals(nome)) {
                return disciplinas[i];
            }
        }
        return null;

    }

    public Professor buscarPorNumIdent(int num) {
        for (int i = 0; i < 5; i++) {
            if (professores[i] != null && professores[i].getNumIdentificador() == num) {
                return professores[i];
            }
        }
        return null;
    }

    public Aluno buscarPorRG(int rg) {
        for (int i = 0; i < 10; i++) {
            if (alunos[i] != null && alunos[i].getRg() == rg) {
                return alunos[i];
            }
        }
        return null;
    }

    public void excluirDisciplina(int numIdent) {
        for (int i = 0; i < 3; i++) {
            if (disciplinas[i] != null && disciplinas[i].getIdentificador() == numIdent) {
                disciplinas[i].setCompetencias(0);
                disciplinas[i].setCurriculo(null);
                disciplinas[i].setIdentificador(0);
                disciplinas[i].setNomeDisciplina(null);
                disciplinas[i].setProfessor(null);
            }
        }
    }

    public void excluirProfessor(String rg) {
        for (int i = 0; i < 5; i++) {
            if (professores[i] != null && professores[i].getRg().equals(rg)) {
                professores[i].setAnoConclusao(0);
                professores[i].setMatricula(null);
                professores[i].setNome(null);
                professores[i].setNomeInstituicao(null);
                professores[i].setNomeTitulo(null);
                professores[i].setNumIdentificador(0);
                professores[i].setRg(null);
                professores[i].setTitulacao(null);
                professores[i].setTituloTrabalho(null);
            }
        }
    }

    public void excluirAluno(int rgAluno) {
        for (int i = 0; i < 10; i++) {
            if (alunos[i] != null && alunos[i].getRg() == rgAluno) {
                alunos[i].setAnoIngressao(0);
                alunos[i].setMatricula(null);
                alunos[i].setNome(null);
                alunos[i].setNomeCurso(null);
                alunos[i].setRg(0);
                alunos[i].setTurno(0);
            }
        }
    }
}
