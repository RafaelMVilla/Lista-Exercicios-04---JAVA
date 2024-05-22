package br.edu.up;

// import br.edu.up.telas.Menu;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        // Menu menu = new Menu();
        // menu.mostrar();

        Scanner leitor = new Scanner(System.in);

        Livro[] livros = new Livro[5];

        for (int i = 0; i < livros.length; i++) {
            Livro livro = new Livro();
            System.out.println("Nome: ");
            livro.setNome(leitor.nextLine());
            livros[i] = livro;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        leitor.close();

    }
}