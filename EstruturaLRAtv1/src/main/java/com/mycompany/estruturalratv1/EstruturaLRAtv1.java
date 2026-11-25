/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv1;

import java.util.Scanner;

/**
 *
 * @author katio
 */

// Faça algoritmo para ler 3 números informados pelo usuário e após cada leitura exibir se o número é par ou ímpar.

public class EstruturaLRAtv1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int par=0;
        int impar=0;
         int num;
        
        for(int i=1; i<=3; i++){
            
            System.out.println("INFORME UM NUMERO");
            num = teclado.nextInt();
            
            if(num%2==0){
                System.out.println("O NUMERO E PAR");
                
            }else{
                System.out.println("O NUMERO É IMPAR");
            }     
            
            
        }
    }
}
