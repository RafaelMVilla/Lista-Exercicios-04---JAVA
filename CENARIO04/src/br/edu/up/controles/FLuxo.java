package br.edu.up.controles;

import java.util.Scanner;
import br.edu.up.modelos.Carro;

public class FLuxo {

    Scanner ler = new Scanner(System.in);

    int vagas = 10;
    int cont = 0;
    int turno;
    double valor = 5.00;
    double valorTotal = 0.00;

    public void EntradaFluxo(){
           
            System.out.println("------------------------");
            System.out.println("Número de vagas disponíveis: " + vagas);
            System.out.println("------------------------");
            
            Carro objCarro = new Carro();
                
                System.out.println("CADASTRAR NOVO VEÍCULO:");
                System.out.println("Digite o modelo do veículo: ");
                objCarro.setModeloCarro(ler.nextLine());
    
                System.out.println("Digite a placa do veículo: ");
                objCarro.setPlacaCarro(ler.nextLine());

                System.out.println("Digite a cor do veículo: ");
                objCarro.setCorCarro(ler.nextLine());
            

                vagas--;
        if(vagas == 0){
    
            System.out.println("Estamos sem vagas, volte mais tarde! ");
            System.out.println("------------------------");
        }
    }
        
        public void SaidaFluxo(){
                
            Carro objCarro = new Carro();
                
               
                System.out.println("RETIRAR O VEÍCULO:");
                System.out.println("Digite a placa do veículo: ");
                objCarro.setPlacaCarro(ler.nextLine());
                System.out.println("------------------------");
                System.out.println("Valor pago: R$ 5,00.");

                valorTotal += valor;

            cont++;
            vagas++;
             
        }   
        
        public void Turno(){

            System.out.println("------------------------");
            System.out.println("A quantidade de veículos foi de : " + cont);
            System.out.println("O valor total foi de: " + valorTotal);

            cont = 0;
        }
}
