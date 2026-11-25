/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem3007f;

import java.util.Scanner;

/**
 *
 * @author katio
 */

//Tendo como dados de entrada a altura e o sexo de uma pessoa, 
//construa um programa que calcule seu peso ideal, utilizando as 
//seguintes fórmulas: para homens: (72.7*h)-58, para mulheres: 
//(62.1*h)-44.7

public class EstruturaAprendizagem3007f {

    public static void main(String[] args) {
        
        double altura;
        String sexo;
        double pesoIdeal;
        
        Scanner teclado = new Scanner(System.in);
        
        Scanner teclado1 = new Scanner(System.in);     
        System.out.println("=== Digite altura ===");
        altura = teclado1.nextDouble(); 
       
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("=== Digite o sexo(M/F)===");
        sexo = teclado2.nextLine();
        
        if(sexo.equalsIgnoreCase("M")){
            pesoIdeal=(72.7*altura)-58;
           
                    
        }else{
            pesoIdeal=(62.1*altura)-44.7;
        }
        System.out.println("Peso ideal: "+ pesoIdeal);
    }
}
