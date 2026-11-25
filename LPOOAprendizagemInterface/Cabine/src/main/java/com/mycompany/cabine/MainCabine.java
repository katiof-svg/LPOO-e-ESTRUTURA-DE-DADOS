/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabine;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class MainCabine {
    
    public static void main(String[] args) {
        
       CaminhaoEmpresa Volvo = new CaminhaoEmpresa("BRA1A25", 5, 6.00, "Expresso Sao Miguel");
       VeiculoEletrico BYD = new VeiculoEletrico("AAA1A11", 2, 6.00, "Selo Verde");
       
       Volvo.calcularTarifaComDesconto();
       BYD.calcularTarifaComDesconto();
       
       Volvo.emitirComprovante();
       System.out.println("");
       BYD.emitirComprovante();
       
       
       String opcao;
       
       Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("=========");
        System.out.println("=== ESCOLHA UMA OPCAO ===");
        System.out.println("== 1 - Pedagio Corpotativo ==");
        System.out.println("== 2 - Pedagio Ecologico ==");
        System.out.println("== Qualquer outro valo para sair. ==");
        opcao = teclado.nextLine();
        
        switch (opcao){
            case "1":{
                Volvo.emitirComprovante();
                break;                
            }
            case "2":{
                BYD.emitirComprovante();
                break;
            }
            default:
                System.out.println("Sem informacao para esta acao.");
            
            
        }
     
       
       
    }
    
}
