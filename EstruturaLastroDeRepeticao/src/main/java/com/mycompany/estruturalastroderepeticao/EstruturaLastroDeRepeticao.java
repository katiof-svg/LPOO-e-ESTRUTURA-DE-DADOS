/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalastroderepeticao;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class EstruturaLastroDeRepeticao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=====TABUADA=====");
        System.out.println("Informe o numero");
        int num = teclado.nextInt();
        
        for(int i=0; i<=10; i++){
            System.out.println(num + " x " +i+ " = " +num*i);
            
            
            
        }
    }
}
