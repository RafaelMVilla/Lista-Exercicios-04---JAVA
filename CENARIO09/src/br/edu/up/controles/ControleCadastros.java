package br.edu.up.controles;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;

import java.util.List;
import java.util.ArrayList;

public class ControleCadastros {

    private List<Cliente> clientes = new ArrayList<>();

    // long l = 20;

    // int z = (int) l;

    public ClientePessoa buscarPorCPF(String cpf) {

        for (Cliente cliente : clientes) {

            // if (cliente.getCPF().equals(cpf)){

            // }

            if (cliente instanceof ClientePessoa) {
                // Cast (conversão) de Cliente para ClientePessoa
                ClientePessoa cp = (ClientePessoa) cliente;
                if (cp.getCPF().equals(cpf)) {
                    return cp;
                }
            }
        }
        return null;

    }

    public ClienteEmpresa buscarPorCNPJ(String cnpj) {

        for (Cliente cliente : clientes) {

            // if (cliente.getCNPJ().equals(cnpj)){

            // }

            if (cliente instanceof ClienteEmpresa) {
                ClienteEmpresa ce = (ClienteEmpresa) cliente;
                if (ce.getCNPJ().equals(cnpj)) {
                    return ce;
                }
            }
        }
        return null;

    }

    public void incluirClientePessoa(ClientePessoa clientePessoa) {
        clientes.add(clientePessoa);
    }

    public void incluirClienteEmpresa(ClienteEmpresa clienteEmpresa) {
        clientes.add(clienteEmpresa);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ClientePessoa emprestarClientePessoa(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa) {
                ClientePessoa cp = (ClientePessoa) cliente;
                if (cp.getCPF().equals(cpf)) {
                    return cp;
                }
            }
        }
        return null;
    }

    public ClienteEmpresa emprestarClienteEmpresa(String cnpj) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa) {
                ClienteEmpresa ce = (ClienteEmpresa) cliente;
                if (ce.getCNPJ().equals(cnpj)) {
                    return ce;
                }
            }
        }
        return null;
    }

    public ClientePessoa devolucaoClientePessoa(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa) {
                ClientePessoa cp = (ClientePessoa) cliente;
                if (cp.getCPF().equals(cpf)) {
                    return cp;
                }
            }
        }
        return null;
    }

    public ClienteEmpresa devolucaoClienteEmpresa(String cnpj) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa) {
                ClienteEmpresa ce = (ClienteEmpresa) cliente;
                if (ce.getCNPJ().equals(cnpj)) {
                    return ce;
                }
            }
        }
        return null;
    }
}
