package br.edu.up.controles;

import br.edu.up.modelos.Pessoal;
import br.edu.up.modelos.Agenda;
import br.edu.up.modelos.Comercial;
import br.edu.up.modelos.Contato;

public class ControleAgenda {

    Agenda objAgenda = new Agenda();
    

    public void incluirContatoPessoal(Pessoal objPessoal){

        objAgenda.adicionar(objPessoal);

    }

    public void incluirContatoComercial(Comercial objComercial){

        objAgenda.adicionar(objComercial);
    }

    public void excluirContato(Contato objContato){

        objAgenda.excluir(objContato);
    }

    public void consultarContato(Agenda objAgenda){
        objAgenda.getListaContatos();
    }
}
