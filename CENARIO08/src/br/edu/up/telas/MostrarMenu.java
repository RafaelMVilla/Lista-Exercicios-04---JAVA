package br.edu.up.telas;

import java.util.Scanner;

public class MostrarMenu {

    public void mostrar() {
        
        Scanner ler = new Scanner(System.in);

        int opcaoMenu;
    
        do {
            
            System.out.println("--------------------------------------");
            System.out.println("         AGENDA DE CONTATOS           ");
            System.out.println("--------------------------------------");
        System.out.println("    1 - Incluir um contato pessoal    ");
        System.out.println("    2 - Incluir um contato comercial  ");
        System.out.println("    3 - Excluir um contato pelo código ");
        System.out.println("    4 - Consultar um contato pelo código ");
        System.out.println("    5 - Listar todos os contatos    ");
        System.out.println("    6 - Sair    ");
        System.out.println("--------------------------------------");
        System.out.printf("Digite a opção selecionada: ");
        opcaoMenu = ler.nextInt();
        ler.nextLine();
        
        switch (opcaoMenu) {
            case 1:
            System.out.println("--------------------------------------");

                
            break;
            case 2:
            System.out.println("--------------------------------------");
            
            break;
            case 3:
            System.out.println("--------------------------------------");
            
            
            break;
            case 4:
            System.out.println("--------------------------------------");
            
            break;
            case 5:
            System.out.println("--------------------------------------");
                
                break;
            case 6:
                System.out.println("--------------------------------------");
                System.out.println("ENCERRANDO...");
                System.out.println("--------------------------------------");

                break;
        }
        
        
        
    } while (opcaoMenu != 6);

    }
}
