package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Cliente;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservaEvento {

    List<Evento> listaEventos = new ArrayList<>();
    List<Cliente> listaClientes = new ArrayList<>();
    Evento reserva = new Evento();
    Cliente cliente = new Cliente();
    Scanner leitor = new Scanner(System.in);

    public void registrarEvento() {
        System.out.println("DIGITE O NOME: ");
        reserva.setNome(leitor.nextLine());

        System.out.println("DIGITE O DIA: ");
        reserva.setDia(leitor.nextInt());

        System.out.println("DIGITE O MÊS: ");
        reserva.setMes(leitor.nextInt());

        System.out.println("DIGITE O ANO: ");
        reserva.setAno(leitor.nextInt());

        leitor.nextLine();

        System.out.println("DIGITE O LOCAL: ");
        reserva.setLocal(leitor.nextLine());

        System.out.println("DIGITE A LOTAÇÃO MÁXIMA DO EVENTO: ");
        reserva.setLotacaoMax(leitor.nextInt());

        System.out.println("DIGITE O PREÇO DO INGRESSO: ");
        reserva.setPrecoIngresso(leitor.nextDouble());

        listaEventos.add(reserva);

        leitor.nextLine();
    }

    public void registrarReserva() {
        System.out.println("DIGITE O NOME DO RESPONSÁVEL PELA RESERVA: ");
        cliente.setNomeResponsavel(leitor.nextLine());

        do {

            System.out.println("DIGITE A QUANTIDADE DE PESSOAS: ");
            cliente.setQtdPessoas(leitor.nextInt());
            if (cliente.getQtdPessoas() > reserva.getLotacaoMax()) {
                System.out.println("ERRO!!! NÚMERO ULTRAPASSOU A QUANTIDADE MÁXIMA!!!");
            }

            reserva.setQtdVendido(cliente.getQtdPessoas());
        } while (cliente.getQtdPessoas() > reserva.getLotacaoMax());

        reserva.setQtdVendido(cliente.getQtdPessoas());

        System.out.println("DATA: " + reserva.getDia() + "/" + reserva.getMes() + "/" + reserva.getAno());

        System.out.println("VALOR TOTAL RESERVA: R$ " + reserva.getPrecoIngresso() * cliente.getQtdPessoas());

        listaClientes.add(cliente);
    }

    public void alteradoSucesso() {
        System.out.println("ALTERADO COM SUCESSO!");
    }

    public void alterarNome() {
        System.out.println("DIGITE O NOVO NOME: ");
        reserva.setNome(leitor.nextLine());
        alteradoSucesso();
    }

    public void alterarDia() {
        System.out.println("DIGITE O NOVO DIA: ");
        reserva.setDia(leitor.nextInt());
        alteradoSucesso();
    }

    public void alterarMes() {
        System.out.println("DIGITE O NOVO MÊS: ");
        reserva.setMes(leitor.nextInt());
        alteradoSucesso();
    }

    public void alterarAno() {
        System.out.println("DIGITE O NOVO ANO: ");
        reserva.setAno(leitor.nextInt());
        alteradoSucesso();
    }

    public void alterarLocal() {
        System.out.println("DIGITE O NOVO LOCAL: ");
        reserva.setLocal(leitor.nextLine());
        alteradoSucesso();
    }

    public void alterarLotacao() {
        System.out.println("DIGITE O NOVA LOTAÇÃO MAX: ");
        reserva.setLotacaoMax(leitor.nextInt());
        alteradoSucesso();
    }

    public void alterarPreco() {
        System.out.println("DIGITE O NOVO PREÇO: ");
        reserva.setPrecoIngresso(leitor.nextDouble());
        alteradoSucesso();
    }

    public void alterarNomeResponsavel() {
        System.out.println("DIGITE O NOVO NOME: ");
        cliente.setNomeResponsavel(leitor.nextLine());
        alteradoSucesso();
    }

    public void alterarQtdPessoas() {
        System.out.println("DIGITE A NOVA QUANTIDADE DE PESSOAS: ");
        cliente.setQtdPessoas(leitor.nextInt());
        alteradoSucesso();
    }

    public void listarEvento() {
        System.out.println("<--------------- EVENTO --------------->");
        System.out.println("NOME: " + reserva.getNome());
        System.out.println("DATA: " + reserva.getDia() + "/" + reserva.getMes() + "/" + reserva.getAno());
        System.out.println("LOCAL: " + reserva.getLocal());
        System.out.println("LOTAÇÃO MAX: " + reserva.getLotacaoMax());
        System.out.println("PREÇO: " + reserva.getPrecoIngresso());
        System.out.println("QUANTIDADE VENDIDO: " + reserva.getQtdVendido());
    }

    public void listarCliente() {
        System.out.println("<--------------- CLIENTE --------------->");
        System.out.println("NOME: " + cliente.getNomeResponsavel());
        System.out.println("QUANTIDADE DE PESSOAS: " + cliente.getQtdPessoas());
        System.out.println("PREÇO TOTAL: R$ " + reserva.getPrecoIngresso() * cliente.getQtdPessoas());
    }

    public void excluirEvento() {
        reserva.setNome("********");
        reserva.setDia(0);
        reserva.setMes(0);
        reserva.setAno(0);
        reserva.setLocal("********");
        reserva.setLotacaoMax(0);
        reserva.setPrecoIngresso(0);
        reserva.setQtdVendido(0);
        System.out.println("EXCLUIDO COM SUCESSO!");
        listarEvento();
    }

    public void excluirCliente() {
        cliente.setNomeResponsavel("********");
        cliente.setQtdPessoas(0);
        System.out.println("EXCLUIDO COM SUCESSO!");
        listarCliente();
    }
}
