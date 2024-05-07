package br.edu.up.modelos;

public class Carro {

    private String modeloCarro;
    private String placaCarro;
    private String corCarro;

    public Carro(){

    }

    public Carro(String modeloCarro, String placaCarro, String corCarro) {
        this.modeloCarro = modeloCarro;
        this.placaCarro = placaCarro;
        this.corCarro = corCarro;
    }

    

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    

    
}
