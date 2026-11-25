/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrurturadesafiorpg;

/**
 *
 * @author katio
 */
public class EstrurturaDesafioRPG {

    public static void main(String[] args) {
        
        System.out.println("Personagem 1");
        Personagens personagem1 = new Personagens();
        personagem1.nome = "Salem";
        personagem1.tipo = "Mago";
        personagem1.pontosDeVida = 100;
        
        personagem1.mostrarStatus();
        personagem1.receberDano(30);
        personagem1.curar(20);
        personagem1.mostrarStatus();
        
        
    }
}
