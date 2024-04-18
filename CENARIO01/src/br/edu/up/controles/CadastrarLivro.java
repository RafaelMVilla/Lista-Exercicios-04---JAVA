package br.edu.up.controles;

import br.edu.up.modelos.Livro;

public class CadastrarLivro {
    Livro livro01 = new Livro();
    Livro livro02 = new Livro();

    public CadastrarLivro() {

        livro01.setCodigo("1598FHK");
        livro01.setTitulo("Core Java 2");
        livro01.setAutores("Cay S. Horstmann", "Gary Cornell");
        livro01.setIsbn("0130819336");
        livro01.setAno(2005);

        livro02.setCodigo("9865PLO");
        livro02.setTitulo("Java, Como programar");
        livro02.setAutores("Harvey Deitel");
        livro02.setIsbn("0130341517");
        livro02.setAno(2015);

    }

    public String getLivroString() {
        String funcString = "";

        funcString += "Livro 1" + "\n";
        funcString += "Código: " + livro01.getCodigo() + "\n";
        funcString += "Autores: " + livro01.getAutores()[0] + " e " + livro01.getAutores()[1] + "\n";
        funcString += "ISBN: " + livro01.getIsbn() + "\n";
        funcString += "Ano: " + livro01.getAno() + "\n";

        funcString += "----------------" + "\n";

        funcString += "Livro 2" + "\n";
        funcString += "Código: " + livro02.getCodigo() + "\n";
        funcString += "Autores: " + livro02.getAutores()[0] + "\n";
        funcString += "ISBN: " + livro02.getIsbn() + "\n";
        funcString += "Ano: " + livro02.getAno();

        return funcString;
    }

}
