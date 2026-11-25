/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv5;

import java.util.Scanner;

/**
 *
 * @author katio
 */

// Leia o número da tabuada, mas adicione a leitura de mais dois dados pelo teclado: o número inicial do multiplicador e o número final.

public class EstruturaLRAtv5 {

    public static void main(String[] args) {        
          
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=====TABUADA=====");
        System.out.println("Informe o numero");
        int num = teclado.nextInt();
        System.out.println("INFORME O INICIO DA TABUADA");
        int inicio = teclado.nextInt();
        System.out.println("INFORME O FIM DA TABUADA");
        int fim = teclado.nextInt();
        
        for(int i=inicio; i<=fim; i++){
            System.out.println(num + " x " +i+ " = " +num*i);
            
        }
    }
    
}
