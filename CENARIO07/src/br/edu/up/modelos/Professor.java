package br.edu.up.modelos;

public class Professor {
    private String nome;
    private String rg;
    private String matricula;
    private int numIdentificador;
    private String titulacao;
    private String nomeInstituicao;
    private int anoConclusao;
    private String nomeTitulo;
    private String tituloTrabalho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        this.tituloTrabalho = tituloTrabalho;
    }

    @Override
    public String toString() {
        return "NOME: " + nome + "\nRG: " + rg + "\nMATRICULA: " + matricula + "\nNÚMERO IDENTIFICADOR: " + numIdentificador + "\nTITULAÇÃO: " + titulacao + "\nNOME DA INSTITUIÇÃO: " + nomeInstituicao + "\nANO DE CONCLUSÃO: " + anoConclusao + "\nNOME DO TÍTULO: " + nomeTitulo + "\nTÍTULO DO TRABALHO: " + tituloTrabalho;
    }

}
