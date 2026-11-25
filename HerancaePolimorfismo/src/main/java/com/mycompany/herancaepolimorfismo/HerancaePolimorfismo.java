/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author katio
 */
public class HerancaePolimorfismo {

    public static void main(String[] args) {
        Carros onix = new Carros ("Chevrolet", "Onix", 85.000, 5);
        
        Motos hondaCG = new Motos ("Honda", "Titan 125", 16.000, 160);
        
        Caminhao fnm = new Caminhao ("FNM", "D11000", 60.000, 2);
        
        onix.exibirFicha();
        hondaCG.exibirFicha();
        fnm.exibirFicha();
        System.out.println("==================================");
        
        onix.acelerar();
        onix.acelerar();
        onix.acelerar();
        System.out.println("==================================");
        hondaCG.acelerar();
        hondaCG.acelerar();
        hondaCG.acelerar();
        System.out.println("==================================");
        fnm.acelerar();
        fnm.acelerar();
        fnm.acelerar();
        System.out.println("==================================");
        
        onix.frear();
        onix.frear();
        onix.frear();
        System.out.println("==================================");
        hondaCG.frear();
        hondaCG.frear();
        hondaCG.frear();
        hondaCG.frear();
        hondaCG.frear();
        System.out.println("==================================");
        fnm.frear();
        fnm.frear();
        fnm.frear();
        fnm.frear();
        fnm.frear();
        fnm.frear();
        System.out.println("==================================");
        
        onix.frear();
        hondaCG.frear();
        fnm.frear();
    }
}
