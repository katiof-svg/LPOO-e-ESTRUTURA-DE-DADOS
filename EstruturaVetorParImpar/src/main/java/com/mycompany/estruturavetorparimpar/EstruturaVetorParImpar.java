/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetorparimpar;

import java.util.Scanner;

/**
 *
 * @author katio
 */


/* Leia um vetor de inteiros com 10 posições e a cada iteração imprima na tela se o número informado é par ou ímpar.
*/

public class EstruturaVetorParImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int [10];
        
        for (int i=0; i<10; i++) {
            System.out.println("INFORME 1 NUMERO");
            numeros [i]=teclado.nextInt();
            if (numeros [i]%2==0){
                System.out.println(numeros[i]+ " NUMERO PAR");
            }else
                System.out.println("NUMERO IMPAR");
            
        }
    }
}
