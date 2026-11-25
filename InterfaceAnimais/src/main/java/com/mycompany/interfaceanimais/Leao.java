/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author katio
 */
public class Leao extends Animais implements Selvagem, Mamiferos{

    public Leao(String nomeAnimal, int idadeAnimal) {
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome() + " esta rugindo! Roooaaaarrrrr");
    }

    @Override
    public void comer() {
        System.out.println(super.getNome() + " esta comendo!!");
    }

    @Override
    public void brincarComHumanos() {
        System.out.println(super.getNome() + " Alerta! Leao e um animal selvagem, cuidado!! ");
    }

    @Override
    public void cacar() {
        System.out.println(super.getNome() + " esta espreitando sua presa!");
    }

    @Override
    public void amamentarFilhote() {
        System.out.println(super.getNome() + " esta amamentando seu filhote!");
    }
        
    
}
