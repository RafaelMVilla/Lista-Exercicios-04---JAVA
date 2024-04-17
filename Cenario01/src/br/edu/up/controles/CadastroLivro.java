package br.edu.up.controles;

import br.edu.up.modelos.Livro;

public class CadastroLivro {
    private Livro[] livros;

    public CadastroLivro() {
        this.livros = new Livro[2];

        Livro livro01 = new Livro();
        livro01.setCodigo("1598FHK");
        livro01.setTitulo("Core Java 2");
        livro01.setAutores("Cay S. Horstmann", "Gary Cornell");
        livro01.setAno(2005);

        this.livros[0] = livro01;

        Livro livro02 = new Livro();
        livro02.setCodigo("9865PLO");
        livro02.setTitulo("Java, How to Program");
        livro02.setAutores("Harvey Deitel");
        livro02.setAno(2015);

        this.livros[1] = livro02;
    }

    public String getLivroString() {
        String funcString = "";

        for (int i = 0; i < livros.length; i++) {
            Livro n = livros[i];
            funcString += "Livro: " + (i + 1) + "\n";
            funcString += "Código: " + n.getCodigo() + "\n";
            funcString += "Título: " + n.getTitulo() + "\n";
            funcString += "Autores: ";
            for (int cont = 0; cont < n.getAutores().length; cont++) {
                if (n.getAutores()[i] != null) {
                    funcString += n.getAutores()[i] + " ";
                }
            }
            funcString += "\n";

            funcString += "Ano: " + n.getAno() + "\n";
        }

        return funcString;
    }
}
