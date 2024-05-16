package br.edu.up.modelos;

public class Aluno{
    private String nome;
    private int rg;
    private String matricula;
    private int anoIngressao;
    private String nomeCurso;
    private int turno;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAnoIngressao() {
        return anoIngressao;
    }
    public void setAnoIngressao(int anoIngressao) {
        this.anoIngressao = anoIngressao;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "NOME: " + nome + "\nRG: " + rg + "\nMATRICULA: " + matricula + "\nANO DE INGRESSÃO: " + anoIngressao + "\nNOME DO CURSO: " + nomeCurso + "\nTURNO: " + turno;
    }

}
