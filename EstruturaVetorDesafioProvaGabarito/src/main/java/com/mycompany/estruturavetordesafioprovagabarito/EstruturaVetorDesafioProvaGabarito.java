/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturavetordesafioprovagabarito;

import java.util.Scanner;

/**Leia 10 respostas do usuário e armazene em um vetor chamado prova. Depois, compare as respostas do candidato com as 
respostas do gabarito, indicando se houve acerto ou erro em cada questão. No final indique a quantidade de acertos.
 *
 * @author katio
 */
public class EstruturaVetorDesafioProvaGabarito {

    public static void main(String[] args) {
        String [] gabarito = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
        String [] prova = new String[10];
        int acertos = 0;
        int erros = 0;
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("==== INFORME SUAS RESPOSTAS ====");
        for (int i=0; i<10; i++){
            prova[i] = teclado.nextLine();
        }
         for (int j=0; j<10; j++){
                if(prova[j].equalsIgnoreCase(gabarito[j])){
                    System.out.println("Alternativa certa: A");
                    System.out.println("Sua resposta: " + prova[j]);
                    acertos++;
                }else{
                    System.out.println("Alternativa certa: A");
                    System.out.println("Sua resposta: " + prova[j]);
                    erros++;
                }
            
            }
         System.out.println("");
         System.out.println("Voce acertou " + acertos + " de 10 questoes!");
         System.out.println("Voce errou " + erros + " de 10 questoes");
        
        
    }
}
