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
                                case 3:
                                    System.out.println("DIGITE O NOME DO EVENTO: ");
                                    nome = leitor.nextLine();
                                    alterarMes(nome);
                                    break;
                                case 4:
                                    System.out.println("DIGITE O NOME DO EVENTO: ");
                                    nome = leitor.nextLine();
                                    alterarAno(nome);
                                    break;
                                case 5:
                                    System.out.println("DIGITE O NOME DO EVENTO: ");
                                    nome = leitor.nextLine();
                                    alterarLocal(nome);
                                    break;
                                case 6:
                                    System.out.println("DIGITE O NOME DO EVENTO: ");
                                    nome = leitor.nextLine();
                                    alterarLotacao(nome);
                                    break;
                                case 7:
                                    System.out.println("DIGITE O NOME DO EVENTO: ");
                                    nome = leitor.nextLine();
                                    alterarPreco(nome);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("<--------------- SELECIONE UMA OPÇÃO PARA ALTERAR --------------->");
                            System.out.println("1. ALTERAR NOME DO RESPONSÁVEL");
                            System.out.println("2. ALTERAR QUANTIDADE DE PESSOAS");
                            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                            opcao = leitor.nextInt();
                            leitor.nextLine();
                            switch (opcao) {
                                case 1:
                                    System.out.println("DIGITE O NOME DO RESPONSÁVEL: ");
                                    String nomeResposavel = leitor.nextLine();
                                    alterarNomeResponsavel(nomeResposavel);
                                    break;
                                case 2:
                                    System.out.println("DIGITE O NOME DO RESPONSÁVEL: ");
                                    nomeResposavel = leitor.nextLine();
                                    alterarQtdPessoas(nomeResposavel);
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
                            System.out.println("DIGITE O NOME DO RESPONSÁVEL: ");
                            String nomeResponsavel = leitor.nextLine();
                            listarCliente(nomeResponsavel);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("<--------------- SELECIONE UMA OPÇÃO PARA EXCLUIR --------------->");
                    System.out.println("1.  EXCLUIR EVENTO");
                    System.out.println("2. EXCLUIR CLIENTE");
                    System.out.println("DIGITE A OPÇÃO DESEJADA: ");
                    opcao = leitor.nextInt();
                    leitor.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.println("DIGITE O NOME DO EVENTO QUE DESEJA EXCLUIR: ");
                            String nomeEvento = leitor.nextLine();
                            excluirEvento(nomeEvento);
                            break;
                        case 2:
                            System.out.println("DIGITE O NOME DO CLIENTE QUE DESEJA EXCLUIR: ");
                            String nomeCliente = leitor.nextLine();
                            excluirCliente(nomeCliente);
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
            leitor.nextLine();

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

    public void alterarMes(String nome) {
        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("DIGITE O NOVO MÊS: ");
            int mes = leitor.nextInt();
            controle.alterarMes(mes);
            alteradoSucesso();
        }

    }

    public void alterarAno(String nome) {
        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("DIGITE O NOVO ANO: ");
            int ano = leitor.nextInt();
            controle.alterarAno(ano);
            alteradoSucesso();
        }
    }

    public void alterarLocal(String nome) {
        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("DIGITE O NOVO LOCAL: ");
            String local = leitor.nextLine();
            controle.alterarLocal(local);
            alteradoSucesso();
        }
    }

    public void alterarLotacao(String nome) {
        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("DIGITE A NOVA LOTAÇÃO: ");
            int lotacao = leitor.nextInt();
            controle.alterarLotacao(lotacao);
            alteradoSucesso();
        }
    }

    public void alterarPreco(String nome) {
        Evento evento = controle.buscarPorNomeEvento(nome);

        if (evento != null) {
            System.out.println("DIGITE O NOVO PREÇO DO INGRESSO: ");
            double preco = leitor.nextDouble();
            controle.alterarPreco(preco);
            alteradoSucesso();
        }
    }

    public void alterarNomeResponsavel(String nomeResposavel) {
        Cliente cliente = controle.buscarPorNomeResponsavel(nomeResposavel);
        String nomeResponsavel = nomeResposavel;
        if (cliente != null) {
            System.out.println("DIGITE O NOVO NOME DO RESPONSÁVEL: ");
            String novoNomeResponsavel = leitor.nextLine();
            controle.alterarNomeResponsavel(nomeResponsavel, novoNomeResponsavel);
            alteradoSucesso();
        }
    }

    public void alterarQtdPessoas(String nomeResposavel) {
        Cliente cliente = controle.buscarPorNomeResponsavel(nomeResposavel);

        String nome = nomeResposavel;

        if (cliente != null) {
            System.out.println("DIGITE A NOVA QUANTIDADE DE PESSOAS: ");
            int novaQtdPessoas = leitor.nextInt();
            controle.alterarQtdPessoas(nome, novaQtdPessoas);
            alteradoSucesso();
        }
    }

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

    public void listarCliente(String nomeResponsavel) {
        Cliente cliente = controle.buscarPorNomeResponsavel(nomeResponsavel);

        if (cliente != null) {
            System.out.println("<--------------- RESERVA --------------->");
            System.out.println(cliente);
        }
    }

    public void excluirEvento(String nomeEvento) {
        Evento evento = controle.buscarPorNomeEvento(nomeEvento);

        if (evento != null) {
            controle.excluirEvento(nomeEvento);
            System.out.println("EXCLUIDO COM SUCESSO!");
        }
    }

    public void excluirCliente(String nomeCliente){
        Cliente cliente = controle.buscarPorNomeResponsavel(nomeCliente);

        if(cliente != null){
            controle.excluirCliente(nomeCliente);
            System.out.println("EXCLUIDO COM SUCESSO!");
        }
    }
}
