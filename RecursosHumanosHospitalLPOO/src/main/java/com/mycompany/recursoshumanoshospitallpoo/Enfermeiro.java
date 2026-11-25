/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanoshospitallpoo;

/**
 *
 * @author katio
 */
public class Enfermeiro extends Pessoa{
    private String coren;
    private int horasExtras;
    
    
    public Enfermeiro(String nome, String cpf, double salarioBase, String corenEnfermeiro, int horasExtrasTrabalhadas){
        super(nome, cpf, salarioBase);
        coren=corenEnfermeiro;
        horasExtras=horasExtrasTrabalhadas;
    };
    
    @Override
    public double calcularSalarioFinal(){
        return super.getSalarioBase() + getHorasExtras()*50;
    };
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("COREN " + coren);
        System.out.println("HORAS EXTRAS " + horasExtras);
        System.out.println("SALARAIO FINAL " + this.calcularSalarioFinal());
    }

    /**
     * @return the horasExtras
     */
    public int getHorasExtras() {
        return horasExtras;
    }

    /**
     * @param horasExtras the horasExtras to set
     */
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    
}
