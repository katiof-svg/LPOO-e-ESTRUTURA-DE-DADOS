/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contastreaminglpoo;

/**
 *
 * @author katio
 */
public class PlanoPadrao extends ContaStreamingLPOO{
    private boolean resolucaoHD;
    private int numUsuarios;
    
    public PlanoPadrao(String nomeTitularStream, String emailStream, int limMaxTelasStream, boolean resolucaoHDPP, int numUsuariosPP){
        super(nomeTitularStream, emailStream, limMaxTelasStream);
        this.resolucaoHD = resolucaoHDPP;
        this.numUsuarios = numUsuariosPP;
    }
    
    @Override
    public void configurarPlano(){
        this.setLimMaxTelas(2);
        this.resolucaoHD = false;
    }
    
    @Override
    public double calcularMensalidade(){
        return super.getMensalidade() + (this.numUsuarios * 10.00);
    }
    
    @Override
    public void exibirFichaConta(){
        System.out.println("=== PERFIL STREAMPLAY PADRAO ===");
        super.exibirFichaConta();
        System.out.println("TELAS ATIVAS: " + this.getLimMaxTelas());
        System.out.println("SUPORTE HD: " + this.resolucaoHD);
        System.out.println("VALOR DA MENSALIDADE: " + this.calcularMensalidade());
        
        
    }
    

    /**
     * @return the resolucaoHD
     */
    public boolean isResolucaoHD() {
        return resolucaoHD;
    }

    /**
     * @param resolucaoHD the resolucaoHD to set
     */
    public void setResolucaoHD(boolean resolucaoHD) {
        this.resolucaoHD = resolucaoHD;
    }

    /**
     * @return the numUsuarios
     */
    public int getNumUsuarios() {
        return numUsuarios;
    }

    /**
     * @param numUsuarios the numUsuarios to set
     */
    public void setNumUsuarios(int numUsuarios) {
        this.numUsuarios = numUsuarios;
    }
    
}
