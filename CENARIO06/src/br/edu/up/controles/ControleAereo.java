package br.edu.up.controles;

import br.edu.up.modelos.Aeronave;
import br.edu.up.modelos.Comandante;
import br.edu.up.modelos.Comissario;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Passagem;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Tripulacao;

import java.util.Scanner;

public class ControleAereo {

    Scanner ler = new Scanner(System.in);

    Pessoa objPessoa = new Pessoa();
    Passageiro objPassageiro = new Passageiro();
    Passagem objPassagem = new Passagem();
    Comandante objComandante = new Comandante();
    Comissario objComissario = new Comissario();
    Aeronave objAeronave = new Aeronave();
    Tripulacao objTripulacao = new Tripulacao();


    // VARIAVEIS: CLASSE PESSOA
    String nomePessoa;
    int rgPessoa;

    // VARIAVEIS: CLASSE PASSAGEIRO
    String identificadorBagagem;
    String codigoPassagem;
    
    // VARIAVEIS: CLASSE AERONAVE
    String codigoAeronave;
    String tipoAeronave;

    // VARIAVEIS: CLASSE TRIPULACAO
    String identificacaoAeronautica;
    String matriculaFuncionario;

    // VARIAVEIS: CLASSE COMANDANTE
    int totalHorasVoo;

    // VARIAVEIS: CLASSE COMISSARIO
    String idiomasFluentes;

    // VARIAVEIS: CLASSE PASSAGEM
    String numeroAssento;
    String classeAssento;
    
    int dia;
    int mes;
    int ano;
    int hora1;
    int hora2;
    
    int quantidadeAssento;
    
    // <----------------------------- CADASTRAR ----------------------------->//
    public void CadastrarPassageiro(){


        
        System.out.println("Digite o nome do passageiro: ");
        objPassageiro.setNomePessoa(ler.nextLine());
        System.out.println("Digite o RG do passageiro: ");
        objPassageiro.setRgPessoa(ler.nextInt());
        ler.nextLine();
        System.out.println("Digite o código da bagagem do passageiro: ");
        objPassageiro.setIdentificadorBagagem(ler.nextLine());

        System.out.println("Digite o código da passagem do passageiro: ");
        objPassageiro.setCodigoPassagem(ler.nextLine());
        System.out.println("Digite o número do assento do passageiro: ");
        numeroAssento = ler.nextLine();
        System.out.println("Digite a classe do assento do passageiro: ");
        classeAssento = ler.nextLine();
        System.out.println("Digite o dia da passagem: ");
        dia = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o mês da passagem: ");
        mes = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o ano da passagem: ");
        ano = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite os 2 primeiros dígitos do horário da passagem: ");
        hora1 = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite os 2 ultimos dígitos do horário da passagem: ");
        hora2 = ler.nextInt();
        ler.nextLine();
        
        System.out.println("Passageiro cadastrado com sucesso!");
        
    }
    
    public void CadastrarComandante(){
        
        
        System.out.println("Digite o nome do comandante: ");
        objComandante.setNomePessoa(ler.nextLine());
        System.out.println("Digite o RG do comandante: ");
        objComandante.setRgPessoa(ler.nextInt());
        System.out.println("Digite o código da aeronáutica do comandante: ");
        objComandante.setIdentificacaoAeronautica(ler.nextLine());
        System.out.println("Digite a matricula do comandante: ");
        objComandante.setMatriculaFuncionario(ler.nextLine());
        System.out.println("Digite o total de horas/voo do comandante: ");
        objComandante.setTotalHorasVoo(ler.nextInt());
        
        System.out.println("Comandante cadastrado com sucesso!");
    }
    
    public void CadastrarComissario(){
        
        
        System.out.println("Digite o nome do comissário: ");
        objComissario.setNomePessoa(ler.nextLine());
        System.out.println("Digite o RG do comissário: ");
        objComandante.setRgPessoa(ler.nextInt());
        System.out.println("Digite o código da aeronáutica do comissário: ");
        objComissario.setIdentificacaoAeronautica(ler.nextLine());
        System.out.println("Digite a matricula do comissário: ");
        objComissario.setMatriculaFuncionario(ler.nextLine());
        System.out.println("Digite a quantidade de idiomas fluentes do comissário: ");
        objComissario.setIdiomasFluentes(ler.nextLine());
        
        System.out.println("Comissário cadastrado com sucesso!");
    }
    
    public void CadastrarAeronave(){
        
        
        System.out.println("Digite o código da aeronave: ");
        objAeronave.setCodigoAeronave(ler.nextLine());
        System.out.println("Digite o tipo da aeronave: ");
        objAeronave.setTipoAeronave(ler.nextLine());
        System.out.println("Digite a quantidade de assentos: ");
        objAeronave.setQuantidadeAssento(ler.nextInt());
        
        System.out.println("Aeronave cadastrada com sucesso!");
    }
    
    
    
    
    // <----------------------------- EXCLUIR ----------------------------->//
    
    int rgExcluir;
    String codigoAeronaveExcluir;

    public void ExcluirPassageiro(){

        
        System.out.println("Digite o RG do passageiro: ");
        rgExcluir = ler.nextInt();
        ler.nextLine();

        objPassageiro.setNomePessoa("");
        objPassageiro.setRgPessoa(0);
        objPassageiro.setCodigoPassagem("");
        objPassageiro.setIdentificadorBagagem("");
        System.out.println("Passageiro excluído com sucesso!");
        
        
    }
    
    public void ExcluirComandante(){
        
        
        System.out.println("Digite o RG do comandante: ");
        rgExcluir = ler.nextInt();
        ler.nextLine();

        objComandante.setNomePessoa("");
        objComandante.setRgPessoa(0);
        objComandante.setMatriculaFuncionario("");
        objComandante.setIdentificacaoAeronautica("");
        objComandante.setTotalHorasVoo(0);
        System.out.println("Comandante excluído com sucesso!");
    }
    
    public void ExcluirComissario(){
        
        
        System.out.println("Digite o RG do Comissário: ");
        rgExcluir = ler.nextInt();
        ler.nextLine();

        objComissario.setNomePessoa("");
        objComissario.setRgPessoa(0);
        objComissario.setMatriculaFuncionario("");
        objComissario.setIdentificacaoAeronautica("");
        objComissario.setIdiomasFluentes("");
        System.out.println("Comissário excluído com sucesso!");
        
    }
    
    public void ExcluirAeronave(){
        
        
        System.out.println("Digite o código da aeronave: ");
        codigoAeronaveExcluir = ler.nextLine();

        objAeronave.setCodigoAeronave("");
        objAeronave.setTipoAeronave("");
        objAeronave.setQuantidadeAssento(0);
        System.out.println("Aeronave excluída com sucesso!");
    }
}
