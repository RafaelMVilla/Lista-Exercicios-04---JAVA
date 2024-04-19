package br.edu.up.modelos;

public class Ponto {

    private double x;
    private double y;
    
    public Ponto() {
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPontos(double x, double y){

        this.x = x;
        this.y = y;
    }

    public double getPontosx(){

        return x;
    }
    public double getPontosy(){

        return y;
    }

 
    
}
