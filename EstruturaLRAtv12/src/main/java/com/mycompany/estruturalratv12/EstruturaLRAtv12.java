/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalratv12;



/**
 *
 * @author katio
 */
public class EstruturaLRAtv12 {

    public static void main(String[] args) {
                    
        int anterior = 1;        
        int atual = 0;
        int soma = 0;
        
        
        for(int i=1; i<=15; i++){
            soma = anterior + atual;
            anterior = atual;
            atual = soma;
            
            System.out.println("F " + i +" = "+ soma);
            
                       
        }
        
        
       
    }
}
