package br.edu.up.modelos;

public class Aeronave {

    private String codigoAeronave;
    private String tipoAeronave;
    private int quantidadeAssento;

    
    public Aeronave() {
    }


    public String getCodigoAeronave() {
        return codigoAeronave;
    }
    public void setCodigoAeronave(String codigoAeronave) {
        this.codigoAeronave = codigoAeronave;
    }
    public String getTipoAeronave() {
        return tipoAeronave;
    }
    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }
    public int getQuantidadeAssento() {
        return quantidadeAssento;
    }
    public void setQuantidadeAssento(int quantidadeAssento) {
        this.quantidadeAssento = quantidadeAssento;
    }

    
}
