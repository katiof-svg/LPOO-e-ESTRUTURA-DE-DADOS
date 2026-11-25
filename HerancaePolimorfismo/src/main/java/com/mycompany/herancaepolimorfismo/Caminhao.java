/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author katio
 */
public class Caminhao extends Veiculos{
    
    private int quantidadedeEixos;
    
    public Caminhao (String marcaCaminhao, String modeloCaminhao, double precoCaminhao, int quantidadedeEixosCaminhao){
        super(marcaCaminhao, modeloCaminhao, precoCaminhao);
        quantidadedeEixos = quantidadedeEixosCaminhao;       
        
    }

    /**
     * @return the quantidadedeEixos
     */
    public int getQuantidadedeEixos() {
        return quantidadedeEixos;
    }

    /**
     * @param quantidadedeEixos the quantidadedeEixos to set
     */
    public void setQuantidadedeEixos(int quantidadedeEixos) {
        this.quantidadedeEixos = quantidadedeEixos;
    }
    
    @Override
    public void acelerar(){
        if (super.getVelocidade()>=0){
        super.setVelocidade(super.getVelocidade()+10);
        System.out.println(this.getModelo() + " Acelerou! Velocidade: " + this.velocidade + " km/h" );
        }else {
            System.out.println(super.getModelo() + " Nao acelerou " + super.getVelocidade() + " km/h");
        }
    }            
     
    
    @Override
    public void frear(){
        if (super.getVelocidade()>0){
        super.setVelocidade(super.getVelocidade()-5);
        System.out.println(super.getModelo() + " Freou! Velocidade: " + super.getVelocidade() + " km/h" );
        }else {
            System.out.println(super.getModelo() + " Parado! ");
        }
    }
    
}
