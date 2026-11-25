/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturabicicletas;

/**
 *
 * @author katio
 */
public class EstruturaBicicletas {

    public static void main(String[] args) {
        
        System.out.println("Bicicleta 1");
        Bicicletas Bicicleta1 = new Bicicletas();
        Bicicleta1.nome="Clotilde";
        Bicicleta1.marca="Spitze";
        Bicicleta1.quadro="Aluminio";
        Bicicleta1.cor="Laranja";
        Bicicleta1.aro=29;
        Bicicleta1.freio="Disco";
        Bicicleta1.suspensao="Dianteira";
        Bicicleta1.marchas=24;
        Bicicleta1.acelerar();
        Bicicleta1.frear();
        Bicicleta1.parar();
        Bicicleta1.mudarMarcha();
        Bicicleta1.virarDireita();
        Bicicleta1.virarEsquerda();
        Bicicleta1.mostrarInformacoes();
        
        
        System.out.println("");
        System.out.println("Bicicleta 2");
        Bicicletas Bicicleta2 = new Bicicletas();
        Bicicleta2.nome="Chinoca";
        Bicicleta2.marca="GTS";
        Bicicleta2.quadro="Aluminio";
        Bicicleta2.cor="Preta";
        Bicicleta2.aro=26;
        Bicicleta2.freio="Disco";
        Bicicleta2.suspensao="Dianteira";
        Bicicleta2.marchas=24;
        Bicicleta2.acelerar();
        Bicicleta2.frear();
        Bicicleta2.parar();
        Bicicleta2.mudarMarcha();
        Bicicleta2.virarDireita();
        Bicicleta2.virarEsquerda();
        Bicicleta2.mostrarInformacoes();
    }
}
