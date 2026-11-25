/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetornumerosnegativos;

import java.util.Scanner;



/**Leia 7 números inteiros. Substitua os valores negativos por zero e exiba o vetor.
 *
 * @author katio
 */


public class EstruturaVetorNumerosNegativos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int [7];
        
                
        for (int i=0; i<7; i++){
            System.out.println("INFORME OS NUMEROS");
            numeros [i] = teclado.nextInt();           
            
        }
        
        for (int j=0; j<7; j++){
            if(numeros[j] > 0){
            
            }else{
            numeros [j] = 0;
            }
        }
        
        for (int k = 0; k < 7; k++) {
        System.out.print(numeros[k] + ", ");    
        }
        
        
        
    }
}
