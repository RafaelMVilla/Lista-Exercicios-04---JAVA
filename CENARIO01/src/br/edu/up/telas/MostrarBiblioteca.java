package br.edu.up.telas;

import br.edu.up.controles.CadastrarLivro;

public class MostrarBiblioteca {
    public void mostrar() {
        CadastrarLivro cadastrarLivro = new CadastrarLivro();
        System.out.println(cadastrarLivro.getLivroString());
    }
}
