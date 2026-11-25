/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv11;

import java.util.Scanner;

/**
 *
 * @author katio
 */

/* Faça algoritmo para imprimir o Fatorial de um número inteiro fornecido pelo usuário.
*/

public class EstruturaLRAtv11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("==== FATORIAL ====");
        System.out.println("INFORME O NUMERO");
        int num = teclado.nextInt();
        
        int fatorial = num;
        int anterior = num - 1;
        
        for(int i=num; i>1; i--){
            fatorial = fatorial * anterior;
            anterior = anterior - 1;            
        }
        
        System.out.println(num + "! = " + fatorial);
    }
}





/*
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
*/
