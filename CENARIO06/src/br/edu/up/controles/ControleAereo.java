package br.edu.up.controles;   

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Aeronave;
import br.edu.up.modelos.Comandante;
import br.edu.up.modelos.Comissario;
import br.edu.up.modelos.Passageiro;


public class ControleAereo {

    private ArrayList<Passageiro> listaPassageiros = new ArrayList<Passageiro>();
    private ArrayList<Comandante> listaComandantes = new ArrayList<Comandante>();
    private ArrayList<Comissario> listaComissarios = new ArrayList<Comissario>();
    private ArrayList<Aeronave> listaAeronaves = new ArrayList<Aeronave>();
   
    
    // <----------------------------- CADASTRAR ----------------------------->//
    public void cadastroPassageiro(){

        
        
    }
    
    public void cadastroComandante(){
        
        
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
    
    public void cadastroComissario(){
        
        
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
    
    public void cadastroAeronave(){
        
        
        System.out.println("Digite o código da aeronave: ");
        objAeronave.setCodigoAeronave(ler.nextLine());
        System.out.println("Digite o tipo da aeronave: ");
        objAeronave.setTipoAeronave(ler.nextLine());
        System.out.println("Digite a quantidade de assentos: ");
        objAeronave.setQuantidadeAssento(ler.nextInt());
        
        System.out.println("Aeronave cadastrada com sucesso!");
    }

    // <----------------------------- LISTAR ----------------------------->//

    public void listaPassageiro(){

        System.out.println("---------------------------------------------");
        System.out.println("Nome: " + objPassageiro.getNomePessoa());
        System.out.println("RG: " + objPassageiro.getRgPessoa());
        System.out.println("Código da bagagem: " + objPassageiro.getIdentificadorBagagem());
        System.out.println("Código da passagem: " + objPassageiro.getCodigoPassagem());
        System.out.println("Número do assento: " + objPassagem.getNumeroAssento());
        System.out.println("Classe do assento: " + objPassagem.getClasseAssento());
        System.out.println("Dia: " + objPassagem.getDia());
        System.out.println("Mês: " + objPassagem.getMes());
        System.out.println("Ano: " + objPassagem.getAno());
        System.out.println("Hora: " + objPassagem.getHora1() + " : " + objPassagem.getHora2());
        
    }
    
    public void listaComandante(){

        System.out.println("---------------------------------------------");
        System.out.println("Nome: " + objComandante.getNomePessoa());
        System.out.println("RG: " + objComandante.getRgPessoa());
        System.out.println("Código da aeronáutica: " + objComandante.getIdentificacaoAeronautica());
        System.out.println("Matrícula do funcionário: " + objComandante.getMatriculaFuncionario());
        System.out.println("Total horas de voo: " + objComandante.getTotalHorasVoo());
        
    }
    
    public void listaComissario(){
        
        System.out.println("---------------------------------------------");
        System.out.println("Nome: " + objComissario.getNomePessoa());
        System.out.println("RG: " + objComissario.getRgPessoa());
        System.out.println("Código da aeronáutica: " + objComissario.getIdentificacaoAeronautica());
        System.out.println("Matrícula do funcionário: " + objComissario.getMatriculaFuncionario());
        System.out.println("Idiomas fluentes: " + objComissario.getIdiomasFluentes());
        
    }
    
    public void listaAeronave(){
        
        System.out.println("---------------------------------------------");
        System.out.println("Código da aeronave: " + objAeronave.getCodigoAeronave());
        System.out.println("Tipo da aeronave: " + objAeronave.getTipoAeronave());
        System.out.println("Quantidade de assentos: " + objAeronave.getQuantidadeAssento());


    }
    
    
    
    
    // <----------------------------- EXCLUIR ----------------------------->//
    
    int rgExcluir;
    String codigoAeronaveExcluir;

    public void exclusaoPassageiro(){

        
        System.out.println("Digite o RG do passageiro: ");
        rgExcluir = ler.nextInt();
        ler.nextLine();

        objPassageiro.setNomePessoa("");
        objPassageiro.setRgPessoa(0);
        objPassageiro.setCodigoPassagem("");
        objPassageiro.setIdentificadorBagagem("");
        System.out.println("Passageiro excluído com sucesso!");
        
        
    }
    
    public void exclusaoComandante(){
        
        
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
    
    public void exclusaoComissario(){
        
        
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
    
    public void exclusaoAeronave(){
        
        
        System.out.println("Digite o código da aeronave: ");
        codigoAeronaveExcluir = ler.nextLine();

        objAeronave.setCodigoAeronave("");
        objAeronave.setTipoAeronave("");
        objAeronave.setQuantidadeAssento(0);
        System.out.println("Aeronave excluída com sucesso!");
    }
}
