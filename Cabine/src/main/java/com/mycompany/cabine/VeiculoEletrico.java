/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabine;

/**
 *
 * @author katio
 */
public class VeiculoEletrico extends Cabine {
    private String seloVerde;
    
    public VeiculoEletrico(String placaTransporte, int eixosQtdade, double valorBaseEixo, String seloVerde){
        super(placaTransporte, eixosQtdade, valorBaseEixo);
        this.seloVerde = seloVerde;
    }
    
    @Override
    public double calcularTarifaComDesconto(){
        return super.getValorEixo() * 50/100;
        
    }
    
    
   
    
    @Override
    public void emitirComprovante(){
        System.out.println("=== COMPROVANTE PEDAGIO ECOLOGICO ===");
        super.emitirComprovante();
        System.out.println("SELO VERDE: ENERGIA LIMPA");
        System.out.println("CALCULO COM 50% DE DESCONTO R$ " + (super.getValorEixo() - this.calcularTarifaComDesconto()));                
       
    }
    
        
    /**
     * @return the seloVerde
     */
    public String getSeloVerde() {
        return seloVerde;
    }

    /**
     * @param seloVerde the seloVerde to set
     */
    public void setSeloVerde(String seloVerde) {
        this.seloVerde = seloVerde;
    }

}
    

