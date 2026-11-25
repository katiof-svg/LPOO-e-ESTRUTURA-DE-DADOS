/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem3007e;

import java.util.Scanner;

/**
 *
 * @author katio
 */
//Faça um programa que receba um nº inteiro e mostre uma mensagem 
//indicando se este número é par ou ímpar, e se é positivo ou negativo.


public class EstruturaAprendizagem3007e {

    public static void main(String[] args) {
        double n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== INFORME UM NUMERO ===");
        n = teclado.nextDouble();
        
        if(n%2 == 0){
            System.out.println("E PAR");
        }else{
            System.out.println("NAO E PAR");
        }
        
        if(n>=0){
            System.out.println("E POSITIVO");
        }else{
            System.out.println("E NEGATIVO");
        }
    }
}
