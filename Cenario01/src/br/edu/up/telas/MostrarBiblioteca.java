package br.edu.up.telas;

import br.edu.up.controles.CadastroLivro;

public class MostrarBiblioteca {
    public void mostrarLivros() {
        CadastroLivro livros = new CadastroLivro();
        System.out.println(livros.getLivroString());
    }
}
