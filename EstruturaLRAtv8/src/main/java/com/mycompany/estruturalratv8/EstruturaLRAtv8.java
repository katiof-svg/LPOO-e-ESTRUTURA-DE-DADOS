/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv8;

import java.util.Scanner;

/**
 *
 * @author katio
 */

/*Faça algoritmo para ler 5 números reais e informar qual foi o maior e menor de todos.
*/

public class EstruturaLRAtv8 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int menor = 1000;
        int maior = 0;
        
        for(int i=1; i<=5; i++){
            System.out.println("=== INFORME UM NUMERO ===");
            int num = teclado.nextInt();            
            
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }            
            
        }
        
        System.out.println("");
        System.out.println("Numero maior: " + maior);
        System.out.println("Numero menor: " + menor);
       
    }
}
