package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(double credito) {

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSaldo(double saldo) {
        return saldo;
    }

    public double getDados(double dados) {
        return dados;
    }

    public String toString() {
        return "NOME: " + getNome() + "\nTELEFONE: " + getTelefone() + "\nEMAIL: " + getEmail()
                + "\nVALOR MAX CREDITO: " + getVlrMaxCredto() + "\nVALOR EMPRESTADO: " + getVlrEmprestado();
    }
}
