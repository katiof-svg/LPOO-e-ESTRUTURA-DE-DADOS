/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetordesafio6numeros;

import java.util.Scanner;

/**
 *
 * @author katio
 */

/*Leia 6 números inteiros do usuário e os armazene em um vetor. Depois disso, verifique, para cada número do vetor se ele é par 
ou ímpar, caso seja par, armazene em um vetor chamado pares, caso seja ímpar armazene em um vetor chamado ímpares. No 
fim imprima todos os números armazenados no vetor pares e ímpares.
*/
  

public class EstruturaVetorDesafio6Numeros {

    public static void main(String[] args) {
        //criar vetor
        int [] vetor = new int[6];
        int [] vetorPares = new int [6];
        int [] vetorImpares = new int [6];
        int pares = 0;
        int impares = 0;
                        
        Scanner teclado = new Scanner(System.in);
        
        //preencher vetor
        System.out.println(" ==== INFORME 6 NUMEROS ==== ");
        for (int i=0; i<6; i++){
            vetor[i] = teclado.nextInt();                        
        }
        
        //preencher vetor par/impar
        for (int j=0; j<6; j++){
            //verificar se é par
            if(vetor[j]%2==0){
                vetorPares[pares] = vetor[j];
                pares++;     
                
            }else{                
                vetorImpares[impares] = vetor[j];
                impares++;                            
            }
        }
        
        System.out.println(" ===== VETOR PARES =====");
        //.length informa quantos numeros tem no vetor
        for (int i=0; i<pares; i++){
            System.out.print(vetorPares[i] + ", ");
        }
        
        System.out.println("");
        System.out.println(" ===== VETOR IMPARES =====");
        //.length informa quantos numeros tem no vetor
        for (int i=0; i<impares; i++){
            System.out.print(vetorImpares[i] + ", ");
        }
    } 
    
}
