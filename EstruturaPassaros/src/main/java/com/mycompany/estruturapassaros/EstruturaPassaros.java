/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturapassaros;

/**
 *
 * @author katio
 */
public class EstruturaPassaros {

    public static void main(String[] args) {
        
        System.out.println("Passaro 1");
        Passaros Passaro1 = new Passaros();
        Passaro1.nome="Chico";
        Passaro1.especie="Periquito";
        Passaro1.cor="Verde";
        Passaro1.envergadura=31.5;
        Passaro1.tamanho_do_bico=1.5;
        Passaro1.peso=60;
        Passaro1.sexo="Macho";
        Passaro1.voar();
        Passaro1.pousar();
        Passaro1.cantar();
        Passaro1.comer();
        Passaro1.dormir();
        Passaro1.procriar();
        Passaro1.botarOvo();
        Passaro1.mostrarInformacoes();
        
        System.out.println("");
        System.out.println("Passaro 2");
        Passaros Passaro2 = new Passaros();
        Passaro2.nome="Ana";
        Passaro2.especie="Corruira";
        Passaro2.cor="Marrom";
        Passaro2.envergadura=15;
        Passaro2.tamanho_do_bico=1.5;
        Passaro2.peso=10;
        Passaro2.sexo="Femea";
        Passaro2.voar();
        Passaro2.pousar();
        Passaro2.cantar();
        Passaro2.comer();
        Passaro2.dormir();
        Passaro2.procriar();
        Passaro2.botarOvo();
        Passaro2.mostrarInformacoes();
    }
}
