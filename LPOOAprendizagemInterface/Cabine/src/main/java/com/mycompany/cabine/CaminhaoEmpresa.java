/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabine;

/**
 *
 * @author katio
 */
public class CaminhaoEmpresa extends Cabine {
    private String nomeTransportadora;
    

    public CaminhaoEmpresa(String placaTransporte, int eixosQtdade, double valorBaseEixo, String nomeTransportadora) {
        super(placaTransporte, eixosQtdade, valorBaseEixo);
        this.nomeTransportadora=nomeTransportadora;
        
    }

    @Override
    public double calcularTarifaComDesconto() {
        return super.getValorEixo() * 10/100;
        
        
    }

    @Override
    public void emitirComprovante(){
        System.out.println("");
        System.out.println("=== COMPROVANTE PEDAGIO COORPORATIVO ===");
        super.emitirComprovante();
        System.out.println("NOME DA TRANSPORTADORA: " + this.nomeTransportadora);
        System.out.println("CALCULO COM 10% DE DESCONTO: R$ " + (super.getValorEixo() - this.calcularTarifaComDesconto()));
        
    }

    /**
     * @return the nomeTransportadora
     */
    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    /**
     * @param nomeTransportadora the nomeTransportadora to set
     */
    public void setNomeTransportadora(String nomeTransportadora) {
        this.nomeTransportadora = nomeTransportadora;
    }

    /**
     * @return the valorEixo
     */
    
    
}
