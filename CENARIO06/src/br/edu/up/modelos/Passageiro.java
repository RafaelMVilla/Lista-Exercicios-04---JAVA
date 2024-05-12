package br.edu.up.modelos;

public class Passageiro extends Pessoa{


    private String identificadorBagagem;
    private String codigoPassagem;

    private Passagem passagem;


    public Passageiro() {
    }

    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }

    public String getCodigoPassagem() {
        return codigoPassagem;
    }

    public void setCodigoPassagem(String codigoPassagem) {
        this.codigoPassagem = codigoPassagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    
}
