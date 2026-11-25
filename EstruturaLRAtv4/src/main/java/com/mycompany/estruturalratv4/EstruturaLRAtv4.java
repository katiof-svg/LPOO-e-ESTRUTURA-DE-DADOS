/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv4;

import java.util.Scanner;

/**
 *
 * @author katio
 */

//Faça algoritmo para calcular a soma de 6 números informados pelo usuário.

public class EstruturaLRAtv4 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        int soma=0;
        
        for(int i=1; i<=6; i++){
            System.out.println("INFORME NUMERO PARA A SOMA");
            int num = teclado.nextInt();
            soma+=num;
        }
        System.out.println("O RESULTADO FINAL E " +soma); 
        
    }
}
