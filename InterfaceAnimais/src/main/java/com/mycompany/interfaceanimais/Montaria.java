/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author katio
 */
public interface Montaria {
    public static final double velocidadeLimiteGalope = 60.0; //km/h
    public static final int idadeParaMontar = 3;
    
    //verificar se pode galopar
    //deve ter pelo menos 3 anos
    void galopar();
    
    //regra: o animal carrega até 10x o seu peso
    default double calcularCargaMaxSuportada(double pesoAnimal){
        return pesoAnimal*10;
        
    }
    
    //verificar se o cavalo esta em condições para montaria
    static void inspecionarEquipamentos(boolean temArreio, boolean cascosLimpos){
        if(temArreio==true && cascosLimpos==true){
            System.out.println("Montaria aprovada na inspecao!");
        }else{
            System.out.println("Reprovado! Certifique-se de limpar os cascos e colocar o arreio corretamnte!");
        }
        
    }
    
}

