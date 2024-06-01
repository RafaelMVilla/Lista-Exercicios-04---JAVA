package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Cliente;

public class ControleReserva {

    Evento evento = new Evento();
    Cliente[] clientes = new Cliente[10];

    public void registrarEvento(Evento evento) {
        this.evento = evento;
    }

    public void registrarReserva(Cliente cliente, int indiceCliente) {
        clientes[indiceCliente] = cliente;
        this.evento.setQtdVendido(cliente.getQtdPessoas());
    }

    public Evento buscarPorNomeEvento(String nome) {
        if (evento.getNome().equals(nome)) {
            return evento;
        }
        return null;
    }

    public void alterarNome(String novoNome) {
        this.evento.setNome(novoNome);
    }

    public void alterarDia(int diaNovo) {
        this.evento.setDia(diaNovo);
    }

    // public void alterarMes(int mes, int indice) {
    // eventos[indice].setMes(mes);
    // }

    // public void alterarAno() {
    // System.out.println("DIGITE O NOVO ANO: ");
    // reserva.setAno(leitor.nextInt());
    // alteradoSucesso();
    // }

    // public void alterarLocal() {
    // System.out.println("DIGITE O NOVO LOCAL: ");
    // reserva.setLocal(leitor.nextLine());
    // alteradoSucesso();
    // }

    // public void alterarLotacao() {
    // System.out.println("DIGITE O NOVA LOTAÇÃO MAX: ");
    // reserva.setLotacaoMax(leitor.nextInt());
    // alteradoSucesso();
    // }

    // public void alterarPreco() {
    // System.out.println("DIGITE O NOVO PREÇO: ");
    // reserva.setPrecoIngresso(leitor.nextDouble());
    // alteradoSucesso();
    // }

    // public void alterarNomeResponsavel() {
    // System.out.println("DIGITE O NOVO NOME: ");
    // cliente.setNomeResponsavel(leitor.nextLine());
    // alteradoSucesso();
    // }

    // public void alterarQtdPessoas() {
    // System.out.println("DIGITE A NOVA QUANTIDADE DE PESSOAS: ");
    // cliente.setQtdPessoas(leitor.nextInt());
    // alteradoSucesso();
    // }

    // public void listarCliente() {
    // System.out.println("<--------------- CLIENTE --------------->");
    // System.out.println("NOME: " + cliente.getNomeResponsavel());
    // System.out.println("QUANTIDADE DE PESSOAS: " + cliente.getQtdPessoas());
    // System.out.println("PREÇO TOTAL: R$ " + reserva.getPrecoIngresso() *
    // cliente.getQtdPessoas());
    // }

    // public void excluirEvento() {
    // reserva.setNome("********");
    // reserva.setDia(0);
    // reserva.setMes(0);
    // reserva.setAno(0);
    // reserva.setLocal("********");
    // reserva.setLotacaoMax(0);
    // reserva.setPrecoIngresso(0);
    // reserva.setQtdVendido(0);
    // System.out.println("EXCLUIDO COM SUCESSO!");
    // listarEvento();
    // }

    // public void excluirCliente() {
    // cliente.setNomeResponsavel("********");
    // cliente.setQtdPessoas(0);
    // System.out.println("EXCLUIDO COM SUCESSO!");
    // listarCliente();
    // }
}
