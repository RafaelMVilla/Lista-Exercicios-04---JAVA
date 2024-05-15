package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String CNPJ;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(double credito) {

    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public double getSaldo(double saldo) {
        return saldo;
    }

    public double getDados(double dados) {
        return dados;
    }

    @Override
    public String toString() {
        return "NOME: " + getNome() + "\nTELEFONE: " + getTelefone() + "\nEMAIL: " + getEmail()
                + "\nVALOR MAX CREDITO: " + getVlrMaxCredto() + "\nVALOR EMPRESTADO: " + getVlrEmprestado();
    }
}
