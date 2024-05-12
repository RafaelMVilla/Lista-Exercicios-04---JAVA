package br.edu.up.modelos;

public class Passagem {


    private String numeroAssento;
    private String classeAssento;
    
    private int dia;
    private int mes;
    private int ano;
    private int hora1;
    private int hora2;


    
    public Passagem() {
    }

    
    public String getNumeroAssento() {
        return numeroAssento;
    }
    public void setNumeroAssento(String numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
    public String getClasseAssento() {
        return classeAssento;
    }
    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
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
    public int getHora1() {
        return hora1;
    }
    public void setHora1(int hora1) {
        this.hora1 = hora1;
    }
    public int getHora2() {
        return hora2;
    }
    public void setHora2(int hora2) {
        this.hora2 = hora2;
    }

    

}
