package br.edu.up.modelos;

public class Evento {
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private String local;
    private int lotacaoMax;
    private int qtdVendido;
    private double precoIngresso;

    public Evento() {

    }

    public Evento(String nome, int dia, int mes, int ano, String local, int lotacaoMax, int qtdVendido,
            double precoIngresso) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.local = local;
        this.lotacaoMax = lotacaoMax;
        this.qtdVendido = qtdVendido;
        this.precoIngresso = precoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMax() {
        return lotacaoMax;
    }

    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }

    public int getQtdVendido() {
        return qtdVendido;
    }

    public void setQtdVendido(int qtdVendido) {
        this.qtdVendido = qtdVendido;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public String toString() {
        return "NOME: " + nome + "\nDIA: " + dia + "\nMÊS: " + mes + "\nANO: " + ano + "\nLOCAL: " + local
                + "\nLOTAÇÃO MAX: " + lotacaoMax + "\nQTD VENDIDO: " + qtdVendido + "\nPREÇO INGRESSO: "
                + precoIngresso;
    }

}
