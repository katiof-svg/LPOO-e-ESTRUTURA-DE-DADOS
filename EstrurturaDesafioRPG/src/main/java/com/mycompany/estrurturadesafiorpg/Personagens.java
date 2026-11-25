/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estrurturadesafiorpg;

/**
 *
 * @author katio
 */
public class Personagens {
    String nome;
    String tipo;
    int pontosDeVida;
    
    public void receberDano (int dano){              
            pontosDeVida = pontosDeVida - dano;
                System.out.println("O personagem " + nome + " recebeu dano de " 
                        + dano + " Pontos de vida atual: " + pontosDeVida);
    }           
    
      
    public void curar (int cura ){                 
            pontosDeVida= pontosDeVida + cura;
            System.out.println("O persoangem " + nome + " recebeu a cura de " 
                    + cura + " Pontos de vida atual: " + pontosDeVida);            
       
}
   public void mostrarStatus(){
       System.out.println("=== Status do Personagem ===");
       System.out.println("Nome " + nome);
       System.out.println("Tipo " + tipo);
       System.out.println("Pontos de Vida " + pontosDeVida);
   }
    
}
