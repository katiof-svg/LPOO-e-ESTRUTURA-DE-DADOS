/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutravetorinversa;

import java.util.Scanner;

/**
 *
 * @author katio
 */


/**
 * Apresente na tela os valores do vetor anterior em ordem inversa.
 
 */
public class EstrutraVetorInversa {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int n1;
       int n2;
       int n3;
       
        System.out.println("DIGITE 3 VALORES");
        n1=teclado.nextInt();
        n2=teclado.nextInt();
        n3=teclado.nextInt();
        
        System.out.println("ORDEM INVERSA " +n3+ ", " +n2+ ", " +n1);
    }
}
