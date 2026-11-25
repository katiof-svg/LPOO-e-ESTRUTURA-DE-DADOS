/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutruravetormaiormenor;

import java.util.Scanner;

/**
 *
 * @author katio
 */

//Leia um vetor com 5 números e exiba o maior e o menor valor presente no vetor.

public class EstrutruraVetorMaiorMenor {

    public static void main(String[] args) {
        int [] vetor = new int [5];
        int maior = 0;
        int menor = 9999;        
        Scanner teclado = new Scanner(System.in);
        
        //preencher vetor
        System.out.println("INFORME 5 VALORES");
        for(int i=0; i<5; i++){
            vetor[i]=teclado.nextInt();
            if(vetor[i]>maior){
                maior = vetor[i];
            }
            if(vetor[i]<menor){
                menor = vetor[i];
            }
        }
        System.out.println("MaIOR VALOR INFORMADO " + maior);
        System.out.println("MENOR VALOR INFORMADO " + menor);
    }
}
