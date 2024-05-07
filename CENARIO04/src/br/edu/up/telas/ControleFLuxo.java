package br.edu.up.telas;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.up.controles.FLuxo;

public class ControleFLuxo {

    public void mostrar(){

        FLuxo objFLuxo = new FLuxo();

        Scanner ler = new Scanner(System.in);

        int tabela;
        boolean validInput = false;
        
        do {
            try {
                System.out.println("------------------------");
                System.out.println("1 - ADICIONAR VEÍCULO");
                System.out.println("2 - RETIRAR VEÍCULO");
                System.out.println("3 - TROCA DE TURNO");
                System.out.println("4 - SAIR");
                System.out.println("------------------------");

                tabela = ler.nextInt();

                switch (tabela) {
                    case 1:
                        objFLuxo.EntradaFluxo();
                        break;
                    case 2:
                        objFLuxo.SaidaFluxo();
                        break;
                    case 3:
                        objFLuxo.Turno();
                        break;
                    case 4: 
                        validInput = true; // Sair do loop
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }   
            } catch (InputMismatchException e) {
                System.out.println("Insira uma número válido.");
                ler.next();
            }
        } while (!validInput);
        
        ler.close();
    }
}