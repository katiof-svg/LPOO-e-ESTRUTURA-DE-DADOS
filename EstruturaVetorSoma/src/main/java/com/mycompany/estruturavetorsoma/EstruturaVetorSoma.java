/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetorsoma;

import java.util.Scanner;

/** Leia um vetor de 4 números reais, calcule a soma de todos os valores e imprima
 *
 * @author katio
 */

public class EstruturaVetorSoma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] vetor = new int [4];
        int soma = 0;
        
        
        System.out.println("INSIRA 4 NUMEROS");
        for (int i=0; i<4; i++){
            vetor[i]=teclado.nextInt();            
        }
        //acumular
        for(int k=0; k<4; k++){
            soma = soma + vetor[k];
        }
        
        //mostrar valor acumulado
        System.out.print("VALOR ACUMULADO " + soma);
        
    }
}
