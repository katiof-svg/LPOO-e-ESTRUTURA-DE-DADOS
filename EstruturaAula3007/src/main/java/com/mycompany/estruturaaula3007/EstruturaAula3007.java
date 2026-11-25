/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaula3007;

import java.util.Scanner;

/**
 *
 * @author katio  
 */

//  Faça um programa para ler dois números e a operação aritmética 
//desejada, calculando e exibindo o resultado correspondente entre eles.

public class EstruturaAula3007 {

    public static void main(String[] args) {
        double n1=2;
        double n2=4;
        double resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== INFORME A OPERACAO ===");
        System.out.println("=== PARA SOMAR INFORME + ===");
        System.out.println("=== PARA SUBTRAIR INFORME - ===");
        System.out.println("=== PARA DIVIDIR INFORME / ===");
        System.out.println("=== PARA MULTIPLICAR INFORME * ===");
        String operacao=teclado.nextLine();
        
        
        if(operacao.equals("+")) {
            resultado=n1+n2;
            System.out.println("soma dos valores: " + resultado);
        }else if(operacao.equals("-")) {
            resultado=n1-n2;
            System.out.println("subtracao de valores: " + resultado);
        }else if(operacao.equals("/")) {
            resultado=n1/n2;
            System.out.println("divisao de valores: " + resultado);
        }else if(operacao.equals("*")) {
            resultado=n1*n2;
            System.out.println("multiplicacao de valores: " + resultado);
        }
         
        
    }
}
