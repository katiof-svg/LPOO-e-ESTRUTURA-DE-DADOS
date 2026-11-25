/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetor5valoresacimamedia;

import java.util.Scanner;

/**
 *
 * @author katio
 */

//Leia um vetor de 5 números e calcule a média. Depois, mostre quais valores estão acima da média

public class EstruturaVetor5ValoresAcimaMedia {

    public static void main(String[] args) {
        int [] vetor = new int[5];
        int soma = 0;
        int media = 0;
        Scanner teclado = new Scanner(System.in);
        
        //preencher vetor
        System.out.println("INFORME 5 VALORES");
        for(int i=0; i<5; i++){
            //prencher vetor
            vetor[i] = teclado.nextInt();
        }
        //acumular, somar
        for (int k=0; k<5; k++){
            soma = soma + vetor[k];
        }
        //calcular a media
        media= soma/5;
        System.out.println("MEDIA " + media);
        
        System.out.println("VALORES ACIMA DA MEDIA");
        for (int j=0; j<5; j++){
            if(media<vetor[j]){
                System.out.println(vetor[j] + " ESTA ACIMA DA MEDIA NA POSICAO " + j );
            }
        }
    }
}
