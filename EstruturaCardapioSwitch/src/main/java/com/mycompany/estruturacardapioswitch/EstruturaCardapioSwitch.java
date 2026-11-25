/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacardapioswitch;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class EstruturaCardapioSwitch {

    public static void main(String[] args) {
        int opcao;
        int quantidade;
        double pedido;
        
        
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("==== ESCOLHA SUA OPCAO ====");
            System.out.println("--- 100 - Cachorro-quente - R$ 1,70 ---");
            System.out.println("--- 101 - Bauru Simples - R$ 2,30 ---");
            System.out.println("--- 102 - Bauru com Ovo - R$ 2,60 ---");
            System.out.println("--- 103 - Hamburguer - R$ 2,40 ---");
            System.out.println("--- 104 - Cheeseburguer - R$ 2,50 ---");
            System.out.println("--- 105 - Refrigersnte - R$ 1,00 ---");
            System.out.println("--- Qualquer outro valor para sair! ---");
            opcao = teclado.nextInt();
            
            System.out.println("=== DIGITE A QUANTIDADE ===");
            quantidade = teclado.nextInt();
            
            switch(opcao){
                case 100:{
                    pedido = quantidade*1.70;
                    System.out.println("= Cachorro-quente " + " Quantidade de: " + quantidade + " Valor: " + pedido);
                    break;
                }
                case 101:{
                    pedido = quantidade*2.30;
                    System.out.println("= Bauru Simples " + " Quantidade de: " + quantidade + " Valor: " + pedido);
                    break;
                }                
                case 102:{
                    pedido = quantidade*2.60;
                    System.out.println("= Bauru com Ovo " + " Quantidade de: " + quantidade + " Valor: " + pedido);
                    break;
                }
                case 103:{
                    pedido = quantidade*2.40;
                    System.out.println("= Hamburguer " + " Quantidade de: " + quantidade + " Valor: " + pedido);
                    break;
                }
                case 104:{
                    pedido = quantidade*2.50;
                    System.out.println("= Cheeseburguer " + " Quantidade de: " + quantidade + " Valor: " + pedido);
                    break;
                }
                case 105:{
                    pedido = quantidade*1.00;
                    System.out.println("= Refrigerante " + " Quantidade de: " + quantidade + " Valor: " + pedido);
                    break;
                }
                default: {
                    System.out.println("== Bom apetite! ==");
                }
            }
        
        
    }
}
