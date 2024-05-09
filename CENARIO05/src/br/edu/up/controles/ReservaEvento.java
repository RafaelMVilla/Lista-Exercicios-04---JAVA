package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Cliente;
import java.util.Scanner;

public class ReservaEvento {

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
    }

    public void registrarReserva() {
        System.out.println("DIGITE O NOME DO RESPONSÁVEL PELA RESERVA: ");
        cliente.setNomeResponsavel(leitor.nextLine());

        System.out.println("DIGITE A QUANTIDADE DE PESSOAS: ");
        cliente.setQtdPessoas(leitor.nextInt());

        System.out.println("DATA: " + reserva.getDia() + "/" + reserva.getMes() + "/" + reserva.getAno());

        System.out.println("VALOR TOTAL RESERVA: R$ " + reserva.getPrecoIngresso() * cliente.getQtdPessoas());
    }
}
