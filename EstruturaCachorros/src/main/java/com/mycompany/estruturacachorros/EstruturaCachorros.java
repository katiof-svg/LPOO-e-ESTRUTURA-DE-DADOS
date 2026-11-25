/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacachorros;

/**
 *
 * @author katio
 */
public class EstruturaCachorros {

    public static void main(String[] args) {
        
        System.out.println("Cachorro 1");
        Cachorros Cachorro1 = new Cachorros();
        Cachorro1.nome="Bruce";
        Cachorro1.cor_do_pelo="Marrom e branco";
        Cachorro1.sexo="Macho";
        Cachorro1.cor_dos_olhos="Castanho";
        Cachorro1.idade=11;
        Cachorro1.peso=18;
        Cachorro1.raca="SRD";
        Cachorro1.castrado=true;
        Cachorro1.vacinado=true;
        Cachorro1.porte="Medio";
        Cachorro1.problema_de_saude="Diabetico";
        Cachorro1.latir();
        Cachorro1.comer();
        Cachorro1.correr();
        Cachorro1.brincar();
        Cachorro1.dormir();
        Cachorro1.mostrarInformacoes();
        
        
        System.out.println("");
        Cachorros Cachorro2 = new Cachorros();
        System.out.println("Cachorro 1");
        Cachorro2.nome="Pink";
        Cachorro2.cor_do_pelo="Preto, branco e marrom";
        Cachorro2.sexo="Femea";
        Cachorro2.cor_dos_olhos="Castanho";
        Cachorro2.idade=13;
        Cachorro2.peso=6;
        Cachorro2.raca="SRD";
        Cachorro2.castrado=true;
        Cachorro2.vacinado=true;
        Cachorro2.porte="Pequeno";
        Cachorro2.problema_de_saude="Cardiaca";
        Cachorro2.latir();
        Cachorro2.comer();
        Cachorro2.correr();
        Cachorro2.brincar();
        Cachorro2.dormir();
        Cachorro2.mostrarInformacoes();     
        
        
    }
}
