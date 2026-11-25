/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lpoodsafio3interface3;

/**
 *
 * @author katio
 */
public interface Entrega {
    abstract double calcularFrete(double distanciaKm);
    
    default double taxaFixa(){
        return 5.0;
    }
}
