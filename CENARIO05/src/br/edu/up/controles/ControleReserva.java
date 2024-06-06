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
                this.clientes[i].setNomeResponsavel(novoNomeResponsavel);
            }
        }
    }

    public void alterarQtdPessoas(String nomeResponsavel,int novaQtdPessoas){
        for(int i = 0; i < 2; i++){
            if(clientes[i].getNomeResponsavel().equals(nomeResponsavel)){

                this.clientes[i].setQtdPessoas(novaQtdPessoas);
            }
        }
    }

    public void excluirEvento(String nomeEvento) {
        if(nomeEvento.equals(evento.getNome())){

            evento.setNome("********");
            evento.setDia(0);
            evento.setMes(0);
            evento.setAno(0);
            evento.setLocal("********");
            evento.setLotacaoMax(0);
            evento.setPrecoIngresso(0);
            evento.setQtdVendido(0);
        }
    }

    public void excluirCliente(String nomeCliente){
        for (int i = 0; i < 2; i++) {
            if(clientes[i].getNomeResponsavel().equals(nomeCliente)){
                this.clientes[i].setNomeResponsavel("**********");
                this.clientes[i].setQtdPessoas(0);
            }
        }
    }
}
