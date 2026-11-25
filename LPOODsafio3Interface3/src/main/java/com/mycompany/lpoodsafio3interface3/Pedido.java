/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoodsafio3interface3;

/**
 *
 * @author katio
 */
public class Pedido implements Entrega, Desconto{
    double valorProdutos;

    public double getValorProdutos() {
        return valorProdutos;
    }

    @Override
    public double calcularFrete(double distanciaKm) {
        return distanciaKm*0.3;
    }

    @Override
    public double aplicarDesconto(double valorOriginal, String nomeCupom) {
        //validar cupom na interface
        if(Desconto.validarCupom(nomeCupom)==true){
            System.out.println("==================Cupom Validado================");
            System.out.println(" Valor original R$ " +valorOriginal);
            double desc = valorOriginal*0.1;
            System.out.println("Valor do desconto R$ " +desc);
            //retornar valor com o desconto
            return valorOriginal-desc;
        }else{
            System.out.println("===============================================");
            System.out.println("========== Cupom não validado =================");
            System.out.println("===============================================");
            return valorOriginal;
        }   
        
    }
    
}
