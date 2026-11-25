/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagem3007h;




import java.util.Scanner;

/**
 *
 * @author katio
 */

// Para ser aprovado em um concurso, o candidato precisa: Ter no mínimo 
//18 anos, Ter ensino médio completo, Obter nota maior ou igual a 70 na 
//prova. O programa deve verificar se o candidato pode ser aprovado.

public class EstruturaAprendizagem3007h {

    public static void main(String[] args) {
        int idade;
        boolean escolaridade;
        double nota;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== INFORME IDADE ===");
        idade=teclado.nextInt();
        
        System.out.println("=== ENSINO MEDIO COMPLETO ===");
        escolaridade=teclado.nextBoolean();
        
        System.out.println("=== NOTA ===");
        nota=teclado.nextDouble();
        
        if(idade>=18 && escolaridade==true && nota>=70){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    
    }
}
