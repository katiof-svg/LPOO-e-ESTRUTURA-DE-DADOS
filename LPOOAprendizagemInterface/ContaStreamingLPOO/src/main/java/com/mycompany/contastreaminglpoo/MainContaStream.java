/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contastreaminglpoo;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class MainContaStream {
    
    public static void main(String[] args) {
        PlanoPadrao cliente1 = new PlanoPadrao("Martha Rocha", "martarocha@gmail.com", 2, false, 3);
        PlanoPremium cliente2 = new PlanoPremium("Hebe Camargo", "hebecamargo@gmail.com", 4, "CONVIT-VIP 99");
        
        
        cliente1.configurarPlano();        
        cliente2.configurarPlano();
        
        
        cliente1.calcularMensalidade();        
        cliente2.calcularMensalidade();
        
        
        cliente1.exibirFichaConta();
        System.out.println("");        
        cliente2.exibirFichaConta();
        
        
        String opcao;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("=========");
        System.out.println("=== ESCOLHA UMA OPCAO ===");
        System.out.println("== 1 - PLANO PADRAO ==");
        System.out.println("== 2 - PLANO PREMIUM ==");
        System.out.println("== Qualquer outro valo para sair. ==");
        opcao = teclado.nextLine();
        
        switch (opcao){
            case "1":{
                cliente1.exibirFichaConta();
                break;                
            }
            case "2":{
                cliente2.exibirFichaConta();
                break;
            }
            default:
                System.out.println("Sem informacao para esta acao.");
            
        
        
        }
                
    }
    
}

