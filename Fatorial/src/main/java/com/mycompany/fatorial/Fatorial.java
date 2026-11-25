/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorial;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class Fatorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("==== FATORIAL ====");
        System.out.println("INFORME O NUMERO: ");
        int num = teclado.nextInt();
        
        int fatorial = num;
        int anterior = num - 1;
        
        for(int i=num; i>1; i--){
            fatorial = fatorial * anterior; //acumula
            anterior = anterior - 1; //diminui 1
        }
        System.out.println(num + "! = " + fatorial);
    }
}
