package br.edu.up.modelos;

public class Cliente {
    private String nomeResponsavel;
    private int qtdPessoas;

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nome) {
        this.nomeResponsavel = nome;
    }
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    
}
