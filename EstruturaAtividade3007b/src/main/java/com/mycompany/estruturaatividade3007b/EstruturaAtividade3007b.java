/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaatividade3007b;

import java.util.Scanner;

/**
 *
 * @author katio
 */

// Faça um programa que receba 3 notas de um aluno e calcule a média 
//final deste aluno. Mostre, além do valor da média, uma mensagem de 
//"Aprovado", caso a média seja igual ou superior a 6, “Exame se a média 
//estiver entre 5 e 5.9, caso contrário, mostrar a mensagem "reprovado".

public class EstruturaAtividade3007b {

    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        double media;
        
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("=== INSIRA NOTA 1 ===");
        n1=teclado1.nextDouble();
        System.out.println("=== INSIRA NOTA 2 ===");
        n2=teclado2.nextDouble();
        System.out.println("=== INSIRA NOTA 3 ===");
        n3=teclado3.nextDouble();
        
        
        media=(n1+n2+n3)/3;
        System.out.println("=== MEDIA DO ALUNO ==="+media);
        if(media >=6){
            System.out.println("Aprovado");
        }else if(media>=5 && media<=5.9){
            System.out.println("Exame");
        }else{
            System.out.println("Reprovado");
        }  
        
        
        
    }
}
