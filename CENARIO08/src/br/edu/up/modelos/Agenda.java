package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> listaContatos;

    public Agenda(){

        this.listaContatos = new ArrayList<>();
    }

    public List<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(List<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }


    public void adicionar(Pessoal objPessoal){
        this.listaContatos.add(objPessoal);
    }

    public void adicionar(Comercial comercial){
        this.listaContatos.add(comercial);
    }

    public void excluir(Contato objContato){
        this.listaContatos.add(objContato);
    }
}