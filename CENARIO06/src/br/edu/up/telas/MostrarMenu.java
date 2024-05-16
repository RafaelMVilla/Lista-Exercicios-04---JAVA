package br.edu.up.telas;

import br.edu.up.controles.ControleAereo;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Passagem;

import java.util.Scanner;

public class MostrarMenu {

    ControleAereo objControleAereo = new ControleAereo();
    Scanner ler = new Scanner(System.in);

    public void mostrar() {

        
        
        int opcao = 0;
        int opcaoCadastro = 0;
        int opcaoExcluir = 0;
        int opcaoListar = 0;

        do {
            
            System.out.println("---------------------------------------------");
            System.out.println("MENU DE CONTROLE AÉREO");
            System.out.println("---------------------------------------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Sair");
            System.out.println("---------------------------------------------");
            opcao = ler.nextInt();
            ler.nextLine();
            
            
            switch (opcao) {
                case 1:
                
                
                System.out.println("---------------------------------------------");
                System.out.println("1 - Cadastrar Passageiro");
                System.out.println("2 - Cadastrar Comandante");
                System.out.println("3 - Cadastrar Comissário");
                System.out.println("4 - Cadastrar Aeronave");
                System.out.println("5 - Sair");
                System.out.printf("Digite a opção desejada: ");
                opcaoCadastro = ler.nextInt();
                ler.nextLine();
                
                
                switch (opcaoCadastro) {
                    
                    case 1:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.CadastrarPassageiro();
                    
                    break;
                    
                    case 2:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.CadastrarComandante();
                    
                    break;
                    
                    case 3:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.CadastrarComissario();
                    
                    break;
                    
                    case 4:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.CadastrarAeronave();
                    
                    break;
                }
                
                break;
                
                
                case 2:

                    System.out.println("---------------------------------------------");
                    System.out.println("1 - Listar Passageiro");
                    System.out.println("2 - Listar Comandante");
                    System.out.println("3 - Listar Comissário");
                    System.out.println("4 - Listar Aeronave");
                    System.out.println("5 - Sair");
                    System.out.printf("Digite a opção desejada: ");
                    opcaoListar = ler.nextInt();
                    ler.nextLine();



                    switch (opcaoListar) {
                        case 1:

                        System.out.println("---------------------------------------------");
                        objControleAereo.ListarPassageiro();
                        
                        break;
                        
                        case 2:
                        
                        System.out.println("---------------------------------------------");
                        objControleAereo.ListarComandante();
                        
                        
                        break;
                        
                        case 3:

                        System.out.println("---------------------------------------------");
                        objControleAereo.ListarComissario();
                        
                        break;
                        
                        case 4:

                        System.out.println("---------------------------------------------");
                        objControleAereo.ListarAeronave();
                        
                        break;
                        
                        case 5:

                        System.out.println("---------------------------------------------");
                        System.out.println("ENCERRANDO...");
                        System.out.println("---------------------------------------------");
                        
                            break;

                    }



                    break;

                case 3:
                
                System.out.println("---------------------------------------------");
                System.out.println("1 - Excluir Passageiro");
                System.out.println("2 - Excluir Comandante");
                System.out.println("3 - Excluir Comissário");
                System.out.println("4 - Excluir Aeronave");
                System.out.println("5 - Sair");
                System.out.printf("Digite a opção desejada: ");
                opcaoExcluir = ler.nextInt();
                ler.nextLine();
                
                
                switch (opcaoExcluir) {
                    case 1:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.ExcluirPassageiro();
                    
                    break;
                    
                    case 2:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.ExcluirComandante();
                    
                    break;
                    
                    case 3:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.ExcluirComissario();
                    
                    break;
                    
                    case 4:
                    
                    System.out.println("---------------------------------------------");
                    objControleAereo.ExcluirAeronave();
                    
                    break;
                    
                    case 5:
                    
                    System.out.println("---------------------------------------------");
                    System.out.println("ENCERRANDO...");
                    System.out.println("---------------------------------------------");
                    
                    break;
                }
                break;
            case 4:

                System.out.println("---------------------------------------------");
                System.out.println("ENCERRANDO...");
                System.out.println("---------------------------------------------");
                
                break;
            }
        
        } while (opcao != 4);
    
        ler.close();
    }

    public void cadastrarPassageiro(){

        Passageiro objPassageiro = new Passageiro();
        Passagem objPassagem = new Passagem();

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
        objPassagem.setNumeroAssento(ler.nextLine());
        System.out.println("Digite a classe do assento do passageiro: ");
        objPassagem.setClasseAssento(ler.nextLine());
        System.out.println("Digite o dia da passagem: ");
        objPassagem.setDia(ler.nextInt());
        ler.nextLine();
        System.out.println("Digite o mês da passagem: ");
        objPassagem.setMes(ler.nextInt());
        ler.nextLine();
        System.out.println("Digite o ano da passagem: ");
        objPassagem.setAno(ler.nextInt());
        ler.nextLine();
        System.out.println("Digite os 2 primeiros dígitos do horário da passagem: ");
        objPassagem.setHora1(ler.nextInt());
        ler.nextLine();
        System.out.println("Digite os 2 ultimos dígitos do horário da passagem: ");
        objPassagem.setHora2(ler.nextInt());
        ler.nextLine();
        
        System.out.println("Passageiro cadastrado com sucesso!");
    }
}
