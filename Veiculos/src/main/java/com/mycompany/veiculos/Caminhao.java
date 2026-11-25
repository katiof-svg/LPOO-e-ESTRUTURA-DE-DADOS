/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author katio
 */
public class Caminhao extends Veiculos {
    private int eixos;

    public Caminhao(String marcaVeiculos, String modeloVeiculos, double precoVeiculos, int eixosCaminhao) {
        super(marcaVeiculos, modeloVeiculos, precoVeiculos);
        this.eixos=eixosCaminhao;
    }

    @Override
    public void acelerar() {
        int novaVelocidade = super.getVelocidadeAtual() + 5;
        
        if(novaVelocidade<=120){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("Aceleraaaa " + novaVelocidade);
        }else{
            System.out.println("VELOCIDADE MAXIMA ATINGIDA KM/H " + super.getVelocidadeAtual());
        }
    }

    @Override
    public void frear() {
        int novaVelocidade = super.getVelocidadeAtual() - 5;
        
        if(novaVelocidade>0){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("FREAARRR KM/H" + novaVelocidade);
        }else{
            super.setVelocidadeAtual(0);
            System.out.println("CAMINHAO PARADO");
        }
        
    }

    /**
     * @return the eixos
     */
    public int getEixos() {
        return eixos;
    }

    /**
     * @param eixos the eixos to set
     */
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    
}
