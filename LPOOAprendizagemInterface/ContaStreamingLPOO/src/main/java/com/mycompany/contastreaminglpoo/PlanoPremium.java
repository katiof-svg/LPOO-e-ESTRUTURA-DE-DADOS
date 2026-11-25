/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contastreaminglpoo;

/**
 *
 * @author katio
 */
public class PlanoPremium extends ContaStreamingLPOO {
    private String codCupomConvite;
    
    public PlanoPremium(String nomeTitularStream, String emailStream, int limMaxTelasStream, String codCupomConviteExtra){
        super(nomeTitularStream, emailStream, limMaxTelasStream);
        this.codCupomConvite = codCupomConviteExtra;
    }
    
    @Override
    public void configurarPlano(){
        this.setLimMaxTelas(4);        
    }
    
    @Override
    public double calcularMensalidade(){
        return super.getMensalidade() * 20/100;
    }
    
    @Override
    public void exibirFichaConta(){
        System.out.println("=== PERFIL STREAMPLAY PREMIUM ===");
        super.exibirFichaConta();
        System.out.println("TELAS ATIVAS: " + this.getLimMaxTelas());
        System.out.println("CONVITE AMIGO: CONVIT-VIP 99");
        System.out.println("QUALIDADE ULTRA 4K PREMIUM");
        System.out.println("VALOR DA MENSALIDADE: " + (super.getMensalidade() + this.calcularMensalidade()));
    }

    /**
     * @return the codCupomConvite
     */
    public String getCodCupomConvite() {
        return codCupomConvite;
    }

    /**
     * @param codCupomConvite the codCupomConvite to set
     */
    public void setCodCupomConvite(String codCupomConvite) {
        this.codCupomConvite = codCupomConvite;
    }
    
}
