/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author katio
 */
public class Motos extends Veiculos{
    
    private int cilindradas;
    
    public Motos (String marcaMoto, String modeloMoto, double precoMoto, int cilindradasMoto){
        super(marcaMoto, modeloMoto, precoMoto);
        cilindradas = cilindradasMoto;
            
    }
    
    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("Cilindradas: " + getCilindradas());
        
    }
    
    @Override
    public void acelerar(){
        if (super.getVelocidade()>=0){
        super.setVelocidade(super.getVelocidade() + 20);
        System.out.println(super.getModelo() + " Acelerou! Velocidade: " + super.getVelocidade() + " km/h");
        }else {
            System.out.println(super.getModelo() + " Nao acelerou " + super.getVelocidade() + " km/h");
        }
    }
    
    @Override
    public void frear(){
        if (super.getVelocidade()>0){
        super.setVelocidade(super.getVelocidade()-10);
        System.out.println(super.getModelo() + " Freou! Velocidade: " + super.getVelocidade() + " km/h" );
        System.out.println("Atencao piloto: Freio traseiro e dianteiro acionados simultaneamente com seguranca!");
        }else{
            System.out.println(super.getModelo() + " Parado! ");
        }

    }
    /**
     * @return the cilindradas
     */
    public int getCilindradas() {
        return cilindradas;
    }

    /**
     * @param cilindradas the cilindradas to set
     */
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
}
