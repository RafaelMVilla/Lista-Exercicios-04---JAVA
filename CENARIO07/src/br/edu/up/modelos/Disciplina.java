package br.edu.up.modelos;

public class Disciplina {

    private String nomeDisciplina;
    private int identificador;
    private String curriculo;
    private int competencias;
    private String professor;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public int getCompetencias() {
        return competencias;
    }

    public void setCompetencias(int competencias) {
        this.competencias = competencias;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "NOME: " + nomeDisciplina + "\nIDENTIFICADOR: " + identificador + "\nCURRICULO: " + curriculo + "\nCOMPETÊNCIAS: " + competencias + "\nPROFESSOR: " + professor;
    }

}
