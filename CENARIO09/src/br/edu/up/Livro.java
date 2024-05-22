package br.edu.up;

public class Livro {
    private String nome = "";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "NOME: " + getNome();
    }
    
}
