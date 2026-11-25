/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv9;

import java.util.Scanner;

/**
 *
 * @author katio
 */

/*Sem utilizar a operação de multiplicação, escreva um programa que multiplica dois números inteiros. Por 
exemplo: 3 * 2 = 2 + 2 + 2.
*/


public class EstruturaLRAtv9 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== INFORME UM VALOR ===");
        int n1 = teclado.nextInt();
        System.out.println("=== INFORME UM VALOR ===");
        int n2 = teclado.nextInt();
        int soma = 0;
        
        for(int i=n1; i>=1; i--){
            soma=soma+n2;          
                
        }
        System.out.println("== RESULTADO DA MULTIPLICACAO: " + soma);
        
        
    }
}
