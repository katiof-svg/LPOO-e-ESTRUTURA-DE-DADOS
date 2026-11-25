/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedagioaula;

/**
 *
 * @author katio
 */
public class VeiculoEletrico extends Cabine{
    String selo;

    public VeiculoEletrico(String placaVeiculo, int qtdEixosVeiculo, String seloVeiculo) {
        super(placaVeiculo, qtdEixosVeiculo);
        this.selo = seloVeiculo;
    }
    
    


    /**
     * @return the selo
     */
    public String getSelo() {
        return selo;        
      
    }

    /**
     * @param selo the selo to set
     */
    public void setSelo(String selo) {
        this.selo = selo;
    }

    @Override
    public double calcularTarifa() {
       return super.getValorTarifa() * 50/100;
    }       
    

    @Override
    public void emitirComprovante() {
        System.out.println("===== ECOVIAS PEDAGIO =====");
        System.out.println("PLACA " + super.getPlaca());
        System.out.println("QUANTIDADE DE EIXOS " + super.getQtdEixos());
        System.out.println("VALOR BASE R$ " + super.getValorTarifa());
        System.out.println("SELO VERDE " + this.getSelo());
        System.out.println("VALOR COM 50% DE DESCONTO R$ " + this.calcularTarifa());
        
    }
    
    
    
}
