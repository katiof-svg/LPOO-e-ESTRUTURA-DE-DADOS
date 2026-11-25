/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cabine;

/**
 *
 * @author katio
 */
public abstract class Cabine {
    private String placa;
    private int eixos;
    private double valorBase = 6.00;
    private double valorEixo;
    
    
    public Cabine(String placaTransporte, int eixosQtdade, double valorBase){
        this.placa = placaTransporte;
        this.eixos = eixosQtdade;
        this.valorBase = valorBase;
        
               
        
    }
    
    public abstract double calcularTarifaComDesconto();
    
    
    public void emitirComprovante(){
        this.valorEixo = eixos * valorBase;
        System.out.println("============");
        System.out.println("PLACA DO TRANSPORTE: " + this.getPlaca());
        System.out.println("QUANTIDADE DE EIXOS: " + this.getEixos());
        System.out.println("VALOR BASE: R$ " + this.getValorBase());
        System.out.println("VALOR EIXO: R$ "+ this.getValorEixo());
        
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
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

    /**
     * @return the valorBase
     */
    public double getValorBase() {
        return valorBase;
    }

    /**
     * @param valorBase the valorBase to set
     */
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    /**
     * @return the valorEixo
     */
    public double getValorEixo() {
        return valorEixo;
    }

    /**
     * @param valorEixo the valorEixo to set
     */
    public void setValorEixo(double valorEixo) {
        this.valorEixo = valorEixo;
    }

    /**
     * @return the valorEixo
     */
   
    

}
