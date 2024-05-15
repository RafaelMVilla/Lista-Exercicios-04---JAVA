package br.edu.up.telas;

import br.edu.up.controles.ControleAereo;
import java.util.Scanner;

public class MostrarMenu {

    public void mostrar() {

        ControleAereo objControleAereo = new ControleAereo();

        Scanner ler = new Scanner(System.in);

        int opcao = 0;
        int opcaoCadastro = 0;
        int opcaoExcluir = 0;

        System.out.println("---------------------------------------------");
        System.out.println("MENU DE CONTROLE AÉREO");
        System.out.println("---------------------------------------------");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Excluir");
        System.out.println("3 - Sair");
        System.out.println("---------------------------------------------");
        opcao = ler.nextInt();
        ler.nextLine();

        switch (opcao) {
            case 1:

                System.out.println("---------------------------------------------");
                System.out.println("1 - Cadastrar Passageiro");
                System.out.println("2 - Cadastrar Comandante");
                System.out.println("3 - Cadastrar Comissário");
                System.out.println("4 - Cadastrar Aeronave");
                System.out.println("5 - Sair");
                System.out.printf("Digite a opção desejada: ");
                opcaoCadastro = ler.nextInt();
                ler.nextLine();

                switch (opcaoCadastro) {

                    case 1:

                        System.out.println("---------------------------------------------");
                        objControleAereo.CadastrarPassageiro();

                        break;

                    case 2:

                        System.out.println("---------------------------------------------");
                        objControleAereo.CadastrarComandante();

                        break;

                    case 3:

                        System.out.println("---------------------------------------------");
                        objControleAereo.CadastrarComissario();

                        break;

                    case 4:

                        System.out.println("---------------------------------------------");
                        objControleAereo.CadastrarAeronave();

                        break;
                }

                break;

            case 2:

                System.out.println("---------------------------------------------");
                System.out.println("1 - Excluir Passageiro");
                System.out.println("2 - Excluir Comandante");
                System.out.println("3 - Excluir Comissário");
                System.out.println("4 - Excluir Aeronave");
                System.out.println("5 - Sair");
                System.out.printf("Digite a opção desejada: ");
                opcaoExcluir = ler.nextInt();
                ler.nextLine();

                switch (opcaoExcluir) {
                    case 1:

                        System.out.println("---------------------------------------------");
                        objControleAereo.ExcluirPassageiro();

                        break;

                    case 2:

                        System.out.println("---------------------------------------------");
                        objControleAereo.ExcluirComandante();

                        break;

                    case 3:

                        System.out.println("---------------------------------------------");
                        objControleAereo.ExcluirComissario();

                        break;

                    case 4:

                        System.out.println("---------------------------------------------");
                        objControleAereo.ExcluirAeronave();

                        break;

                    case 5:

                        System.out.println("---------------------------------------------");
                        System.out.println("ENCERRANDO...");
                        System.out.println("---------------------------------------------");

                        break;
                }
                break;
            case 3:

                System.out.println("---------------------------------------------");
                System.out.println("ENCERRANDO...");
                System.out.println("---------------------------------------------");

                break;
        }

        ler.close();
    }
}
