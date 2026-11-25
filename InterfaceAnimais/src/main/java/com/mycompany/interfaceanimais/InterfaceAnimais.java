/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceanimais;

/**
 *
 * @author katio
 */
public class InterfaceAnimais {

    public static void main(String[] args) {
        Cachorro Diluvio = new Cachorro("Diluvio", 3);
        Diluvio.emitirSom();
        Diluvio.comer();
        Diluvio.brincarComHumanos();
        Diluvio.envelhecer();
        
        Cavalo PeDePano = new Cavalo("Pe de Pano", 2);
        //metodos herdados da classe abastrata
        PeDePano.emitirSom();
        PeDePano.comer();
        PeDePano.brincarComHumanos();
        
        //metodos herdados da interface
        //metodo static da interface
        Montaria.inspecionarEquipamentos(true, true);
        //metodo abastrato
        PeDePano.envelhecer();
        PeDePano.galopar();
        //metodo default
        System.out.println("Peso maximo suportado para carga " + PeDePano.calcularCargaMaxSuportada(512));
        
    }
}
