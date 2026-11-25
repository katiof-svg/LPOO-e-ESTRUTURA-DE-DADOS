/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanoshospitallpoo;

/**
 *
 * @author katio
 */
public class Medico extends Pessoa{
    private String crm;
    private double plantao;
    
    
    public Medico(String nome, String cpf, double salarioBase, String crmMedico, double plantaoBonus){
        super(nome, cpf, salarioBase);
        crm=crmMedico;
        plantao=plantaoBonus;        
    };
    
    @Override
    public double calcularSalarioFinal(){
        return super.getSalarioBase() + getPlantao();
    };
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("CRM " + crm);
        System.out.println("BONUS PLANTAO " + plantao);
        System.out.println("SALARIO FINAL " + this.calcularSalarioFinal());
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * @return the plantao
     */
    public double getPlantao() {
        return plantao;
    }

    /**
     * @param plantao the plantao to set
     */
    public void setPlantao(double plantao) {
        this.plantao = plantao;
    }
    
 
    
    
}
