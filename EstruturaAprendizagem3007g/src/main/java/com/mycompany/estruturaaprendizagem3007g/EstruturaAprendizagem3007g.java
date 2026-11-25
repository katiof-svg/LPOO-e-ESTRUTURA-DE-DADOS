/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem3007g;

import java.util.Scanner;

/**
 *
 * @author katio
 */

//Escreva um programa que receba três números do usuário e imprima o maior deles.

public class EstruturaAprendizagem3007g {

    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== INFORME UM NUMERO ===");
        n1=teclado.nextDouble();
        
        System.out.println("=== INFORME UM NUMERO ===");
        n2=teclado.nextDouble();
        
        System.out.println("=== INFORME UM NUMERO ===");
        n3=teclado.nextDouble();
        
        if(n1>=n2 && n1>=n3){
            System.out.println("Numero maior: "+n1);            
        }else if(n2>=n1 && n2>=n3){
            System.out.println("Numero maior: "+n2);
        }else{
            System.out.println("Numero maior: "+n3);
        }
        
    }
}
