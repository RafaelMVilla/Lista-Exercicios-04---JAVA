package br.edu.up.modelos;

public class Mes {
    private int nome;
    private int qtdeDias;

    public Mes() {

    }

    public Mes(int nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public void verificadorDias(int mes) {
        switch (mes) {
            case 1:
                this.qtdeDias = 31;
                break;
            case 2:
                this.qtdeDias = 28;
                break;
            case 3:
                this.qtdeDias = 31;
                break;
            case 4:
                this.qtdeDias = 30;
                break;
            case 5:
                this.qtdeDias = 31;
                break;
            case 6:
                this.qtdeDias = 30;
                break;
            case 7:
                this.qtdeDias = 31;
                break;
            case 8:
                this.qtdeDias = 31;
                break;
            case 9:
                this.qtdeDias = 30;
                break;
            case 10:
                this.qtdeDias = 31;
                break;
            case 11:
                this.qtdeDias = 30;
                break;
            case 12:
                this.qtdeDias = 31;
                break;
        }
    }

}
