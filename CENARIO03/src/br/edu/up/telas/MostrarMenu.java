package br.edu.up.telas;

import br.edu.up.controles.CadastroCompromisso;
import java.util.Scanner;

public class MostrarMenu {
    public void menu() {
        Scanner leitor = new Scanner(System.in);

        CadastroCompromisso cadastroCompromisso = new CadastroCompromisso();
        int opcao = 0;
        do {
            System.out.println("-------------- DIGITE UMA OPÇÃO --------------");
            System.out.println("1. Cadastrar compromisso.");
            System.out.println("2. Listar compromisso.");
            System.out.println("3. Excluir compromisso.");
            System.out.println("4. Sair.");
            System.out.println("Seleciona a opção desejada: ");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    cadastroCompromisso.cadastroCompromisso();
                    break;
                case 2:
                    cadastroCompromisso.listaCompromisso();
                    break;
                case 3:
                    cadastroCompromisso.excluirCompromisso();
                    break;
                case 4:
                    System.out.println("ENCERRANDO...");
                    break;
            }

        } while (opcao != 4);

        leitor.close();
    }
}
