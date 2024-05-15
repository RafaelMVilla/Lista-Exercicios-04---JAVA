package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private double vlrMaxCredto;
    private double vlrEmprestado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getVlrMaxCredto() {
        return vlrMaxCredto;
    }

    public void setVlrMaxCredto(double vlrMaxCredto) {
        this.vlrMaxCredto = vlrMaxCredto;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado += vlrEmprestado;
    }

    public void emprestar(double valor) {
        this.vlrEmprestado += valor;
    }

    public double devolver(double valor) {
        this.vlrEmprestado -= valor;
        return vlrEmprestado;
    }

    public double getSaldo(double valor) {
        return valor;
    }

}
