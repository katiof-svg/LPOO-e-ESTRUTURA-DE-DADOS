/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem3007c;

import java.util.Scanner;

/**
 *
 * @author katio
 */

// Elaborar um programa que recebe 2 valores a e b e os escreve com a 
//mensagem: "São múltiplos" ou "Não são múltiplos".

public class EstruturaAprendizagem3007c {

    public static void main(String[] args) {
        double a;
        double b;
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== INFORME O VALOR A ===");
        a = teclado.nextDouble();
        System.out.println("=== INFORME O VALOR B ===");
        b = teclado.nextDouble();
        
        if(a%b == 0 || b%a == 0){
            System.out.println("E MULTIPLO");
        }else{
            System.out.println("NAO É MULTIPLO");
        }
            
    }
}
