/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetorinverso;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class EstruturaVetorInverso {

    public static void main(String[] args) {
        //vetor idades de 10 posições
        int [] idades = new int[10];
        Scanner teclado = new Scanner(System.in);
        
        //PREENCHER VETOR
        System.out.println("INFORME 10 VALORES");
        for(int i=0; i<10; i++){
            idades[i] = teclado.nextInt();
        }
        for(int k=9; k>0; k--){
            System.out.print(idades[k]+ ", ");
        }
    }
}
