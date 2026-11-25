/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetorcrie10numeros;

import java.util.Scanner;

/**
 *
 * @author katio
 */

//Crie um vetor com 6 números inteiros. Peça ao usuário o valor e diga se ele está no vetor e, se sim, em qual posição.

public class EstruturaVetorCrie10Numeros {

    public static void main(String[] args) {
        int [] vetor = {10, 20, 30, 40, 10, 60};
        boolean encontrei;
        int valor;
        Scanner teclado = new Scanner(System.in);
        
        //preencher vetor
        System.out.println("INFORME 6 VALORES");
        for(int i=0; i<6; i++){
            encontrei = false;
            System.out.println("INFORME O VALOR");
            valor = teclado.nextInt();
            //PERCORRER O VETOR PARA VERIFICAR SE LÁ
            for (int j=0; j<6; j++){
                if(valor==vetor[j]){
                    System.out.println("VALOR ENCONTRADO ");
                    System.out.println(valor + " na posicao " + j);
                    encontrei = true;
                }
            }
            if(encontrei == false){
            System.out.println("VALOR NAO ENCONTRADO");
            }    
        }
    }
}
