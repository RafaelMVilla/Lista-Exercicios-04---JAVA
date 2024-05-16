package br.edu.up.modelos;

public class Pessoal extends Contato{

    private String aniversario;

    private Contato contato;

    
    public Pessoal(){
        
    }
    
    public Pessoal(int codigo, String nome, String telefone, String aniversario){
        
    }
    
    public String getAniversario() {
        return aniversario;
    }
    
    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    public Contato getContato() {
        return contato;
    }
}
