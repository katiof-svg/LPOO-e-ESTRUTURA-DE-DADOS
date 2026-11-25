/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturagatos;

/**
 *
 * @author katio
 */
public class EstruturaGatos {

    public static void main(String[] args) {
        
        System.out.println("Gato 1");
        Gato Gato1 = new Gato();        
        Gato1.nome = "Salem";
        Gato1.cor = "Preto";
        Gato1.sexo = "Macho";
        Gato1.cor_dos_olhos = "Verde";
        Gato1.idade = 7;
        Gato1.peso = 5.5;
        Gato1.raca = "SRD";
        Gato1.castrado = true;
        Gato1.vacinado = true;
        Gato1.miar();
        Gato1.comer();
        Gato1.dormir();
        Gato1.correr();
        Gato1.brincar();
        Gato1.mostrarInformacoes();
        
        
        System.out.println("");
        System.out.println("Gato 2");
        Gato Gato2 = new Gato();        
        Gato2.nome = "Simba";
        Gato2.cor = "Laranja e branco";
        Gato2.sexo = "Macho";
        Gato2.cor_dos_olhos = "Castanho";
        Gato2.idade = 6;
        Gato2.peso = 7;
        Gato2.raca = "SRD";
        Gato2.castrado = true;
        Gato2.vacinado = true;
        Gato2.miar();
        Gato2.comer();
        Gato2.dormir();
        Gato2.correr();
        Gato2.brincar();
        Gato2.mostrarInformacoes();
    }
}
  
   
  