package br.edu.up.controles;

import java.util.Scanner;

import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;

import java.util.List;
import java.util.ArrayList;

public class ControleCadastros {
    Scanner leitor = new Scanner(System.in);
    List<ClientePessoa> listaClientePessoas = new ArrayList<>();
    List<ClienteEmpresa> listaClienteEmpresas = new ArrayList<>();

    ClientePessoa clientePessoa = new ClientePessoa(10000);

    ClienteEmpresa clienteEmpresa = new ClienteEmpresa(25000);

    public void incluirClientePessoa() {
        System.out.println("<--------- CADASTRO CLIENTE PESSOA --------->");
        System.out.println("DIGITE O NOME: ");
        clientePessoa.setNome(leitor.nextLine());
        System.out.println("DIGITE O CPF: ");
        clientePessoa.setCPF(leitor.nextLine());
        System.out.println("DIGITE O TELEFONE: ");
        clientePessoa.setTelefone(leitor.nextLine());
        System.out.println("DIGITE O EMAIL: ");
        clientePessoa.setEmail(leitor.nextLine());
        System.out.println("DIGITE O PESO: ");
        clientePessoa.setPeso(leitor.nextDouble());
        leitor.nextLine();
        System.out.println("DIGITE A ALTURA: ");
        clientePessoa.setAltura(leitor.nextDouble());
        leitor.nextLine();
        System.out.println("DIGITE O VALOR MAX DE CREDITO: ");
        clientePessoa.setVlrMaxCredto(leitor.nextDouble());
        leitor.nextLine();
        System.out.println("DIGITE O VALOR EMPRESTADO: ");
        clientePessoa.setVlrEmprestado(leitor.nextDouble());
        leitor.nextLine();

        listaClientePessoas.add(clientePessoa);
    }

    public void incluirClienteEmpresa() {
        System.out.println("<--------- CADASTRO CLIENTE EMPRESA --------->");
        System.out.println("DIGITE O NOME: ");
        clienteEmpresa.setNome(leitor.nextLine());
        System.out.println("DIGITE O CNPJ: ");
        clienteEmpresa.setCNPJ(leitor.nextLine());
        System.out.println("DIGITE O ANO DE FUNDAÇÃO: ");
        clienteEmpresa.setAnoFundacao(leitor.nextInt());
        leitor.nextLine();
        System.out.println("DIGITE O TELEFONE: ");
        clienteEmpresa.setTelefone(leitor.nextLine());
        System.out.println("DIGITE O EMAIL: ");
        clienteEmpresa.setEmail(leitor.nextLine());
        System.out.println("DIGITE A INSCRIÇÃO ESTADUAL: ");
        clienteEmpresa.setInscEstadual(leitor.nextLine());
        System.out.println("DIGITE O VALOR MAX DE CREDITO: ");
        clienteEmpresa.setVlrMaxCredto(leitor.nextDouble());
        leitor.nextLine();
        System.out.println("DIGITE O VALOR EMPRESTADO: ");
        clienteEmpresa.setVlrEmprestado(leitor.nextDouble());
        leitor.nextLine();

        listaClienteEmpresas.add(clienteEmpresa);
    }

    public void mostrarDadosClientePessoa(int i) {
        System.out.println("<--------- DADOS CLIENTE PESSOA --------->");
        System.out.println(listaClientePessoas.get(i));
    }

    public void mostrarDadosClienteEmpresa(int i) {
        System.out.println("<--------- DADOS CLIENTE EMPRESA --------->");
        System.out.println(listaClienteEmpresas.get(i));
    }

    public void emprestarClientePessoa() {
        System.out.println("<--------- EMPRESTAR PARA CLIENTE PESSOA --------->");
        System.out.println("DIGITE A QUANTIDADE: ");
        clientePessoa.emprestar(leitor.nextDouble());
    }

    public void emprestarClienteEmpresa() {
        System.out.println("<--------- EMPRESTAR PARA CLIENTE EMPRESA --------->");
        System.out.println("DIGITE A QUANTIDADE: ");
        clienteEmpresa.emprestar(leitor.nextDouble());
    }

    public void devolucaoClientePessoa(){
        System.out.println("<--------- DEVOLUÇÃO CLIENTE PESSOA --------->");
        System.out.println("DIGITE A QUANTIDADE: ");
        clientePessoa.devolver(leitor.nextDouble());
    }

    public void devolucaoClienteEmpresa(){
        System.out.println("<--------- DEVOLUÇÃO CLIENTE EMPRESA --------->");
        System.out.println("DIGITE A QUANTIDADE: ");
        clienteEmpresa.devolver(leitor.nextDouble());
    }
}
