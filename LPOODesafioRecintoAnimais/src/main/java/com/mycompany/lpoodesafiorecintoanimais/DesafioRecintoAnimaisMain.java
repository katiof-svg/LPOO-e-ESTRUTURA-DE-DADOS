/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoodesafiorecintoanimais;

/**
 *
 * @author katio
 */
public class DesafioRecintoAnimaisMain {
    
    public static void main(String[] args) {
        
        LPOODesafioRecintoAnimais animal1 = new LPOODesafioRecintoAnimais("001", "Mamifero - onca pintada", "Maria Ribeiro");
        LPOODesafioRecintoAnimais animal2 = new LPOODesafioRecintoAnimais("002", "Mamifero - elefante", "Jose Pereira");
        
        animal1.mostrarInformacoes();
        animal2.mostrarInformacoes();
        
        animal1.alimentarAnimal(15);
        animal1.mudarJaula("003");
        animal1.limparRecinto();
        animal1.mudarJaula("003");
        animal1.mostrarInformacoes();
        
        //animal2.mudarJaula("005");
        //animal2.limparRecinto();
        //animal2.alimentarAnimal(0);
        
        
    }
    
}
