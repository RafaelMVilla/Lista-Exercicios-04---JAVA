package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.ControleCadastros;

public class Menu {
    public void mostrar() {
        Scanner leitor = new Scanner(System.in);
        ControleCadastros controle = new ControleCadastros();
        int opcao;

        do {
            int i = 0;
            System.out.println("<--------- SELECIONE UMA DAS OPÇÕES --------->");
            System.out.println("1. INCLUIR CLIENTE PESSOA");
            System.out.println("2. INCLUIR CLIENTE EMPRESA");
            System.out.println("3. MOSTRAR DADOS CLIENTE PESSOA");
            System.out.println("4. MOSTRAR DADOS CLIENTE EMPRESA");
            System.out.println("5. EMPRESTAR PARA CLIENTE PESSOA");
            System.out.println("6. EMPRESTAR PARA CLIENTE EMPRESA");
            System.out.println("7. DEVOLUÇÃO DE CLIENTE PESSOA");
            System.out.println("8. DEVOLUÇÃO DE CLIENTE EMPRESA");
            System.out.println("9. SAIR");
            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    controle.incluirClientePessoa();
                    break;
                case 2:
                    controle.incluirClienteEmpresa();
                    break;
                case 3:
                    System.out.println("DIGITE O INDICE: ");
                    i = leitor.nextInt();
                    controle.mostrarDadosClientePessoa(i);
                    break;
                case 4:
                    System.out.println("DIGITE O INDICE: ");
                    i = leitor.nextInt();
                    controle.mostrarDadosClienteEmpresa(i);
                    break;
                case 5:
                    controle.emprestarClientePessoa();
                    break;
                case 6:
                    controle.emprestarClienteEmpresa();
                    break;
                case 7:
                    controle.devolucaoClientePessoa();
                    break;
                case 8:
                    controle.devolucaoClienteEmpresa();
                    break;
                case 9:
                    System.out.println("ENCERRANDO...");
                    break;
            }
        } while (opcao != 9);

        leitor.close();
    }
}
