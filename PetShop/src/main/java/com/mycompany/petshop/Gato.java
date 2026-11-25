/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author katio
 */
public class Gato extends Animal{
    private String chip;
    private int diasGatil;

    public Gato(String nomeA, String nomeD, double valorD, String chip, int diasGatil) {
        super(nomeA, nomeD, valorD);
        this.chip=chip;
        this.diasGatil=diasGatil;
    }
    
    @Override
    public double calcularPagamentoFinal(){
        return super.getValorDiaria() + this.getDiasGatil() * 40;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("CHIP " + this.chip);
        System.out.println("DIARIA DO GATIL " + this.diasGatil);
        System.out.println("PAGAMENTO FINAL " + this.calcularPagamentoFinal());
    }

    /**
     * @return the chip
     */
    public String getChip() {
        return chip;
    }

    /**
     * @param chip the chip to set
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    /**
     * @return the diasGatil
     */
    public int getDiasGatil() {
        return diasGatil;
    }

    /**
     * @param diasGatil the diasGatil to set
     */
    public void setDiasGatil(int diasGatil) {
        this.diasGatil = diasGatil;
    }
    
}
