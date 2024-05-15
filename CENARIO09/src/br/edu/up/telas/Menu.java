package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.ControleCadastros;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;

public class Menu {

    ControleCadastros controle = new ControleCadastros();
    Scanner leitor = new Scanner(System.in);

    public void mostrar() {
        int opcao;

        do {
            System.out.println("<--------- SELECIONE UMA DAS OPÇÕES --------->");
            System.out.println("1. INCLUIR CLIENTE PESSOA");
            System.out.println("2. INCLUIR CLIENTE EMPRESA");
            System.out.println("3. MOSTRAR DADOS CLIENTE PESSOA");
            System.out.println("4. MOSTRAR DADOS CLIENTE EMPRESA");
            System.out.println("5. EMPRESTAR PARA CLIENTE PESSOA");
            System.out.println("6. EMPRESTAR PARA CLIENTE EMPRESA");
            System.out.println("7. DEVOLUÇÃO DE CLIENTE PESSOA");
            System.out.println("8. DEVOLUÇÃO DE CLIENTE EMPRESA");
            System.out.println("9. SAIR");
            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    System.out.println("DIGITE O CPF: ");
                    String cpf = leitor.nextLine();
                    mostrarDadosClientePessoa(cpf);
                    break;
                case 4:
                    System.out.println("DIGITE O CNPJ: ");
                    String cnpj = leitor.nextLine();
                    mostrarDadosClienteEmpresa(cnpj);
                    break;
                case 5:
                    System.out.println("DIGITE O CPF: ");
                    cpf = leitor.nextLine();
                    emprestarClientePessoa(cpf);
                    break;
                case 6:
                    System.out.println("DIGITE O CNPJ: ");
                    cnpj = leitor.nextLine();
                    emprestarClienteEmpresa(cnpj);
                    break;
                case 7:
                    System.out.println("DIGITE O CPF: ");
                    cpf = leitor.nextLine();
                    devolucaoClientePessoa(cpf);
                    break;
                case 8:
                    System.out.println("DIGITE O CNPJ: ");
                    cnpj = leitor.nextLine();
                    devolucaoClienteEmpresa(cnpj);
                    break;
                case 9:
                    System.out.println("ENCERRANDO...");
                    break;
            }
        } while (opcao != 9);

        leitor.close();
    }

    public void incluirClientePessoa() {

        ClientePessoa clientePessoa = new ClientePessoa(10000);

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

        // listaClientePessoas.add(clientePessoa);

        controle.incluirClientePessoa(clientePessoa);
    }

    public void incluirClienteEmpresa() {

        ClienteEmpresa clienteEmpresa = new ClienteEmpresa(25000);

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

        // listaClienteEmpresas.add(clienteEmpresa);
        controle.incluirClienteEmpresa(clienteEmpresa);
    }

    public void mostrarDadosClientePessoa(String cpf) {
        ClientePessoa cliente = controle.buscarPorCPF(cpf);
        if (cliente != null) {
            System.out.println(cliente);
        }

        // controle.mostrarDadosClientePessoa(i);
    }

    public void mostrarDadosClienteEmpresa(String cnpj) {
        ClienteEmpresa cliente = controle.buscarPorCNPJ(cnpj);
        if (cliente != null) {
            System.out.println(cliente);
        }
    }

    public void emprestarClientePessoa(String cpf) {
        ClientePessoa cliente = controle.emprestarClientePessoa(cpf);
        if (cliente != null) {
            System.out.println("DIGITE A QUANTIDADE: ");
            cliente.setVlrEmprestado(leitor.nextDouble());
            System.out.println("<--------- DADOS ATUALIZADOS CLIENTE PESSOA --------->");
        }
    }

    public void emprestarClienteEmpresa(String cnpj) {
        ClienteEmpresa cliente = controle.emprestarClienteEmpresa(cnpj);
        if (cliente != null) {
            System.out.println("DIGITE A QUANTIDADE: ");
            cliente.setVlrEmprestado(leitor.nextDouble());
            System.out.println("<--------- DADOS ATUALIZADOS CLIENTE EMPRESA --------->");
        }
    }

    public void devolucaoClientePessoa(String cpf) {
        ClientePessoa cliente = controle.devolucaoClientePessoa(cpf);
        if (cliente != null) {
            System.out.println("DIGITE A QUANTIDADE: ");
            cliente.devolver(leitor.nextDouble());
            System.out.println("<--------- DADOS ATUALIZADOS CLIENTE PESSOA --------->");
        }
    }

    public void devolucaoClienteEmpresa(String cnpj) {
        ClienteEmpresa cliente = controle.devolucaoClienteEmpresa(cnpj);
        if (cliente != null) {
            System.out.println("DIGITE A QUANTIDADE: ");
            cliente.devolver(leitor.nextDouble());
            System.out.println("<--------- DADOS ATUALIZADOS CLIENTE EMPRESA --------->");
        }
    }
}
