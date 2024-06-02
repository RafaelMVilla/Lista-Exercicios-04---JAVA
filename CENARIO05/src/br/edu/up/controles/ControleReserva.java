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

    public Cliente buscarPorNomeResponsavel(String nomeResponsavel) {
        for (int i = 0; i < 2; i++) {
            if (clientes[i].getNomeResponsavel().equals(nomeResponsavel)) {
                return clientes[i];
            }
        }
        return null;
    }

    public void alterarNome(String novoNome) {
        this.evento.setNome(novoNome);
    }

    public void alterarDia(int diaNovo) {
        this.evento.setDia(diaNovo);
    }

    public void alterarMes(int mes) {
        this.evento.setMes(mes);
    }

    public void alterarAno(int ano) {
        this.evento.setAno(ano);
    }

    public void alterarLocal(String local) {
        this.evento.setLocal(local);
    }

    public void alterarLotacao(int lotacao) {
        this.evento.setLotacaoMax(lotacao);
    }

    public void alterarPreco(double preco) {
        this.evento.setPrecoIngresso(preco);
    }

    public void alterarNomeResponsavel(String nomeResponsavel, String novoNomeResponsavel) {
        for (int i = 0; i < 2; i++) {
            if (clientes[i].getNomeResponsavel().equals(nomeResponsavel)) {
                this.clientes[i].setNomeResponsavel(nomeResponsavel);
            }
        }
    }

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
