/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem3007d;

import java.util.Scanner;

/**
 *
 * @author katio
 */

// Faça um programa que receba um número e mostrar mensagem 
//indicando se ele é ou não divisível por 5. 

public class EstruturaAprendizagem3007d {

    public static void main(String[] args) {
        double n;
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== INSIRA UM NUMERO ===");
        n = teclado.nextDouble();
        
        if(n%5 == 0){
            System.out.println("E DIVISIVIL POR 5");
        }else{
            System.out.println("NAO E MULTIPLO");
        }
             
        
       
    }
}
