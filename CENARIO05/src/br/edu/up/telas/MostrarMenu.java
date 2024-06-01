package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.controles.ControleReserva;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.Evento;

public class MostrarMenu {

    Scanner leitor = new Scanner(System.in);
    ControleReserva controle = new ControleReserva();
    int indiceEvento = 0;
    int indiceCliente = 0;

    public void menuEvento() {
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
                    leitor.nextLine();
                    switch (opcao) {
                        case 1:
                            registrarEvento();
                            break;
                        case 2:
                            registrarReserva();
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
                            leitor.nextLine();
                            switch (opcao) {
                                case 1:
                                    System.out.println("DIGITE O NOME DO EVENTO: ");
                                    String nome = leitor.nextLine();
                                    alterarNomeEvento(nome);
                                    break;
                                case 2:
                                    System.out.println("DIGITE O NOME DO EVENTO: ");
                                    nome = leitor.nextLine();
                                    alterarDia(nome);
                                    break;
                                // case 3:
                                // alterarMes();
                                // break;
                                // case 4:
                                // evento.alterarAno();
                                // break;
                                // case 5:
                                // evento.alterarLocal();
                                // break;
                                // case 6:
                                // evento.alterarLotacao();
                                // break;
                                // case 7:
                                // evento.alterarPreco();
                                // break;
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
                                    // evento.alterarNomeResponsavel();
                                    break;
                                case 2:
                                    // evento.alterarQtdPessoas();
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
                    leitor.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.println("DIGITE O NOME: ");
                            String nome = leitor.nextLine();
                            listarEvento(nome);
                            break;
                        case 2:
                            // evento.listarCliente();
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
                            // evento.excluirEvento();
                            break;
                        case 2:
                            // evento.excluirCliente();
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

    public void registrarEvento() {
        Evento evento = new Evento();

        System.out.println("DIGITE O NOME: ");
        evento.setNome(leitor.nextLine());

        System.out.println("DIGITE O DIA: ");
        evento.setDia(leitor.nextInt());

        System.out.println("DIGITE O MÊS: ");
        evento.setMes(leitor.nextInt());

        System.out.println("DIGITE O ANO: ");
        evento.setAno(leitor.nextInt());

        leitor.nextLine();

        System.out.println("DIGITE O LOCAL: ");
        evento.setLocal(leitor.nextLine());

        System.out.println("DIGITE A LOTAÇÃO MÁXIMA DO EVENTO: ");
        evento.setLotacaoMax(leitor.nextInt());

        System.out.println("DIGITE O PREÇO DO INGRESSO: ");
        evento.setPrecoIngresso(leitor.nextDouble());
        leitor.nextLine();

        controle.registrarEvento(evento);

    }

    public void registrarReserva() {
        for (int i = 0; i < 2; i++) {
            Cliente cliente = new Cliente();
            System.out.println("DIGITE O NOME DO RESPONSÁVEL PELA RESERVA: ");
            cliente.setNomeResponsavel(leitor.nextLine());

            System.out.println("DIGITE A QUANTIDADE DE PESSOAS: ");
            cliente.setQtdPessoas(leitor.nextInt());

            controle.registrarReserva(cliente, i);
        }
    }

    public void alterarNomeEvento(String nome) {

        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("DIGITE O NOVO NOME: ");
            String nomeNovo = leitor.nextLine();
            controle.alterarNome(nomeNovo);
            alteradoSucesso();
        }

    }

    public void alterarDia(String nome) {
        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("DIGITE O NOVO DIA: ");
            int dia = leitor.nextInt();
            controle.alterarDia(dia);
            alteradoSucesso();
        }
    }

    // public void alterarMes() {
    // System.out.println("DIGITE O NOVO MÊS: ");
    // int mes = leitor.nextInt();

    // System.out.println("DIGITE O INDICE DO EVENTO: ");
    // int indice = leitor.nextInt();

    // controle.alterarMes(mes, indice);

    // alteradoSucesso();
    // }

    public void alteradoSucesso() {
        System.out.println("ALTERADO COM SUCESSO!");
    }

    public void listarEvento(String nome) {

        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("<--------------- EVENTO --------------->");
            System.out.println(evento);
        }

    }
}
