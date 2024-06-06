package br.edu.up.modelos;

public class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;
    private int hora;
    private int dia;
    private int mes;
    private int ano;

    public Compromisso(){
        
    }

    public Compromisso(String pessoa, String local, String assunto, int hora) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
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

    @Override
    public String toString() {
        return "Pessoa: " + pessoa + "\nLocal: " + local + "\nAssunto: " + assunto + "\nHora: " + hora + "\nDia: " + dia + "\nMes: " + mes + "\nAno: " + ano;
    }
}
