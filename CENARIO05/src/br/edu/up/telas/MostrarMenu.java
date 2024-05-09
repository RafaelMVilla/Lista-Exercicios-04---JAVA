package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.controles.ReservaEvento;

public class MostrarMenu {
    public void menuEvento() {
        Scanner leitor = new Scanner(System.in);
        ReservaEvento evento = new ReservaEvento();
        int opcao;
        int opcaoPrincipal;

        do {
            System.out.println("<--------------- SELECIONE UMA OPÇÃO --------------->");
            System.out.println("1. INCLUSÃO.");
            System.out.println("2. ALTERAÇÃO.");
            System.out.println("3. LISTAR");
            System.out.println("4. EXCLUIR");
            System.out.println("5. SAIR");
            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
            opcaoPrincipal = leitor.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    System.out.println("<--------------- SELECIONE UMA OPÇÃO --------------->");
                    System.out.println("1. REGISTRAR EVENTO.");
                    System.out.println("2. REGISTRAR RESERVA.");
                    System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                    opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            evento.registrarEvento();
                            break;
                        case 2:
                            evento.registrarReserva();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("<--------------- SELECIONE UMA OPÇÃO PARA ALTERAR --------------->");
                    System.out.println("1. INFORMAÇÕES EVENTO.");
                    System.out.println("2. INFORMAÇÕES RESERVA.");
                    System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                    opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("<--------------- SELECIONE UMA OPÇÃO PARA ALTERAR --------------->");
                            System.out.println("1. ALTERAR NOME");
                            System.out.println("2. ALTERAR DIA");
                            System.out.println("3. ALTERAR MÊS");
                            System.out.println("4. ALTERAR ANO");
                            System.out.println("5. ALTERAR LOCAL");
                            System.out.println("6. ALTERAR LOTAÇÃO MAX");
                            System.out.println("7. ALTERAR PREÇO INGRESSO");
                            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                            opcao = leitor.nextInt();
                            switch (opcao) {
                                case 1:
                                    evento.alterarNome();
                                    break;
                                case 2:
                                    evento.alterarDia();
                                    break;
                                case 3:
                                    evento.alterarMes();
                                    break;
                                case 4:
                                    evento.alterarAno();
                                    break;
                                case 5:
                                    evento.alterarLocal();
                                    break;
                                case 6:
                                    evento.alterarLotacao();
                                    break;
                                case 7:
                                    evento.alterarPreco();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("<--------------- SELECIONE UMA OPÇÃO PARA ALTERAR --------------->");
                            System.out.println("1. ALTERAR NOME DO RESPONSÁVEL");
                            System.out.println("2. ALTERAR QUANTIDADE DE PESSOAS");
                            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                            opcao = leitor.nextInt();
                            switch (opcao) {
                                case 1:
                                    evento.alterarNomeResponsavel();
                                    break;
                                case 2:
                                    evento.alterarQtdPessoas();
                                    break;
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("<--------------- SELECIONE UMA OPÇÃO PARA LISTAR --------------->");
                    System.out.println("1. LISTAR EVENTO");
                    System.out.println("2. LISTAR CLIENTE");
                    System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                    opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            evento.listarEvento();
                            break;
                        case 2:
                            evento.listarCliente();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("<--------------- SELECIONE UMA OPÇÃO PARA EXCLUIR --------------->");
                    System.out.println("1.  EXCLUIR EVENTO");
                    System.out.println("2. EXCLUIR CLIENTE");
                    System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                    opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            evento.excluirEvento();
                            break;
                        case 2:
                            evento.excluirCliente();
                            break;
                    }
                    break;
            }
            if (opcaoPrincipal == 5) {
                System.out.println("ENCERRANDO...");
            }
        } while (opcaoPrincipal != 5);

        leitor.close();
    }
}
