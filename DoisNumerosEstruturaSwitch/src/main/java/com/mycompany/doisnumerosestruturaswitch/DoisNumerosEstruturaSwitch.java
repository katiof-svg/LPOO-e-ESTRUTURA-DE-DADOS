/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doisnumerosestruturaswitch;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class DoisNumerosEstruturaSwitch {

    public static void main(String[] args) {        
        int opcao;
        double n1;
        double n2;
        double resultado;
        
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("=== ESCOLHA SUA OPCAO ===");
            System.out.println("== 1 = Media entre os 2 numeros ==");
            System.out.println("== 2 = Diferenca entre os 2 numeros ==");
            System.out.println("== 3 = Produto entre os 2 numeros ==");
            System.out.println("== 4 = Divisao do primeiro numero pelo segundo numero ==");
            System.out.println("== PARA SAIR DIGITE QUALQUER OUTRO NUMERO ==");
            opcao = teclado.nextInt();
            System.out.println("== Digite o primeiro numero ==");
            n1 = teclado.nextDouble();
            System.out.println("== Digite o segundo numero ==");
            n2 = teclado.nextDouble();
            
            switch(opcao){
                case 1:{
                    resultado = (n1+n2)/2;
                    System.out.println("Media entre os numeros = " + resultado);
                    break;
                }
                case 2:{
                    resultado = (n1-n2);
                    System.out.println("Diferenca entre os numeros = " + resultado);
                    break;
                }
                case 3:{
                    resultado = (n1*n2);
                    System.out.println("Produto entre os numeros = " + resultado);
                    break;
                }
                case 4: {
                    resultado = (n1/n2);
                    System.out.println("Divisao entre os numeros = " + resultado);
                    break;
                }
                default: {
                    System.out.println("Servico feito!!!");
                }
            }
    
    }
}
            
            
        
        
    

