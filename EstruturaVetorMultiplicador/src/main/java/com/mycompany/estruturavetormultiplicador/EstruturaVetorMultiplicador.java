/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetormultiplicador;

import java.util.Scanner;

/**
 *
 * @author katio
 */

/**Leia um vetor com 5 elementos e um número multiplicador. Crie um segundo vetor, onde cada elemento seja o correspondente
 * do primeiro multiplicado pela constante. 
 */

public class EstruturaVetorMultiplicador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int [5];
        int [] resultados = new int [5];
        int multiplicador;
        
        for (int i=0; i<5; i++){
            System.out.println("INFORME 1 NUMERO");
            numeros [i] = teclado.nextInt();
        }
        
        System.out.println("INFORME 1 NUMERO PARA MULTIPLICACAO");
        multiplicador = teclado.nextInt();
        
        System.out.println("OS RESULTADOS SAO " );
        for (int j=0; j<5; j++){
            resultados [j]= numeros [j] * multiplicador;
        }
        
        for (int r=0; r<5; r++){
            System.out.print(resultados [r] +", ");
        }
        
        
    }
}
