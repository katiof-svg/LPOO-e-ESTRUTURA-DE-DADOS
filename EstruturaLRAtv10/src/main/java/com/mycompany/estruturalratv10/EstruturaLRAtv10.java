/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv10;

import java.util.Scanner;

/**
 *
 * @author katio
 */

/*
 Faça algoritmo para ler 6 números e imprimir a média dos números pares e a soma dos números ímpares.
*/

public class EstruturaLRAtv10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double media;
        int par = 0;
        int somaImpar = 0;
        int somaPar = 0;
        
        for(int i=1; i<=6; i++){
            System.out.println("=== INFORME 1 NUMERO ===");
            int num = teclado.nextInt();
            
            if(num%2==0){
                par++;
                somaPar+=num;                
            }else{
                somaImpar+=num;
            }
            
            
            
        }
        media=somaPar/par;
            System.out.println("MEDIA DOS NUMEROS PARES: " + media);
            System.out.println("SOMA DOS NUMEROS IMPARES: " + somaImpar);
    }
}

/*
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media;
        int par=0;
        int somaImpar=0;
        int somaPar=0;
        for(int i=1; i<=5; i++){
            System.out.println("==INFORME UM NUMERO==");
            int num = teclado.nextInt();
            
            if(num%2==0){//resto da divisão for 0 numero é par
                par++;
                somaImpar+=num;
            }else{//se não é iímpar
               somaImpar+=num; 
                
            }
            
        }
       media=somaPar/par;
        System.out.println("MEDIA DOS NUMEROS PARES " + media);
        System.out.println("SOMA DOS NUMEROS IMPARES " + somaImpar);
    }
*/
