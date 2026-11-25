/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author katio
 */
public class Cavalo extends Animais implements Montaria {

    public Cavalo(String nomeAnimal, int idadeAnimal) {
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome() + " esta relinchando! Iiiiirrriiiiiii!!!");
    }

    @Override
    public void comer() {
        System.out.println(super.getNome() + " esta comendo alfafa!");
    }

    @Override
    public void brincarComHumanos() {
        System.out.println(super.getNome() + " recebeu cenouras e esta feliz!!");
    }

    @Override
    //PARA GALOPAR O CAVALO DEV TER 3 ANOS
    public void galopar() {
        if(super.getIdade()<idadeParaMontar){
          System.out.println(super.getNome() + " e muito jovem para galopar!" + " idade minima " + idadeParaMontar + " anos");
          
        }else{
            System.out.println(super.getNome() + " esta galopando pelos campos" + " Cuidado para nao ultrapassar a velocidade maxima " + velocidadeLimiteGalope + " km/h");
        }
        
    }
    
}
