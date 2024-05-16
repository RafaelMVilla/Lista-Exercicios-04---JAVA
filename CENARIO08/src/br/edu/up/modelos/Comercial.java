package br.edu.up.modelos;

public class Comercial extends Contato{

    private String cnpj;
    private Contato contato;

    public Comercial(){

    }

    public Comercial(int codigo, String nome, String telefone, String cnpj){

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Contato getContato() {
        return contato;
    }
    
}
