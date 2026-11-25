/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lpoodsafio3interface3;

/**
 *
 * @author katio
 */
public interface Desconto {
    abstract double aplicarDesconto(double valorOriginal, String nomeCupom);
    
    static boolean validarCupom(String cupom){
        //verificar se o cupom tem o texto desconto
        if(cupom.contains("desconto")){
            return true;
        }else{
            return false;
        }
    }
    
}
