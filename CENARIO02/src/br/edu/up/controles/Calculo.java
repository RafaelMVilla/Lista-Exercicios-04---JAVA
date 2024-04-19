package br.edu.up.controles;

import br.edu.up.modelos.Ponto;


public class Calculo {

    Ponto ponto1 = new Ponto();
    Ponto ponto2 = new Ponto();
    Ponto novoPonto = new Ponto();
   
    
    double p = 0.0;
    
    public Calculo(){
        
        ponto1.setPontos(0,0);
        ponto2.setPontos(2, 5);
        
    }
    
    public double CalcularDistancia1(){
        
        p = (Math.sqrt((Math.pow(ponto1.getPontosx() - ponto2.getPontosx(), 2) + Math.pow(ponto1.getPontosy() - ponto2.getPontosy(), 2))));

        return p;
    }

    public double CalcularDistancia2(){
        
        novoPonto.setPontos(7, 2);

        p = (Math.sqrt((Math.pow(novoPonto.getPontosx() - ponto2.getPontosx(), 2) + Math.pow(novoPonto.getPontosy() - ponto2.getPontosy(), 2))));

        return p;
    }

    public double CalcularDistancia3(){
        
        ponto1.setPontos(10, 3);

        p = (Math.sqrt((Math.pow(ponto1.getPontosx() - ponto2.getPontosx(), 2) + Math.pow(ponto1.getPontosy() - ponto2.getPontosy(), 2))));

        return p;
    }

    public String mostrarCalculo(){

        String funcString = "";

        funcString += "Distância entre Ponto 1 (0 , 0) e Ponto 2 (2 , 5): " + CalcularDistancia1() + "\n";
        funcString += "Distância do Ponto 2 (2 , 5) até (7 , 2): " + CalcularDistancia2() + "\n";
        funcString += "Distância entre Ponto 1 (10 , 3) e Ponto 2 (2 , 5): " + CalcularDistancia3() + "\n";


        return funcString;
    }

}
