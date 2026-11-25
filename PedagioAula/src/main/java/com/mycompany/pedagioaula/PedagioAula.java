/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedagioaula;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class PedagioAula {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("==== PEDAGIO CAMINHOS DO SUL ====");
        System.out.println("INFORME O TIPO DE VEICULO");
        System.out.println("(CAMINHAO) | (CARRO)");
        String tipo = teclado.nextLine();
        
        switch(tipo.toLowerCase()){
            case "caminhao":{
                System.out.println("===== CADASTRO DE CAMINHAO =====");
                System.out.println("INFORME A PLACA");
                String placa = teclado.nextLine();
                System.out.println("INFORME A QUANTIDADE DE EIXOS");
                int eixos = teclado.nextInt();
                teclado.nextLine();
                System.out.println("INFORME O NOME DA TRANSPORTADORA");
                String transportadora = teclado.nextLine();
                
                Caminhao mercedez = new Caminhao(placa, eixos, transportadora);
                mercedez.emitirComprovante();
                break;
            }
            
            case "carro":{
                System.out.println("===== CADASTRO DE CARRO =====");
                System.out.println("INFORME A PLACA");
                String placa = teclado.nextLine();
                System.out.println("INFORME A QUANTIDADE DE EIXOS");
                int eixos = teclado.nextInt();
                teclado.nextLine();
                System.out.println("INFORME O SELO");
                String selo = teclado.nextLine();
                
                
                VeiculoEletrico BYD = new VeiculoEletrico(placa, eixos, selo);
                BYD.emitirComprovante();
                break;
            }
            
            default:{
                System.out.println("TENTE NOVAMENTE");
                break;
            }              
            
        }
    }
}
