/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpooaprendizageminterface;

/**
 *
 * @author katio
 */
public class Trapezio implements Figura {
    double baseMaior;
    double baseMenor;
    double altura;
    
    public Trapezio(double baseMaiorInformada, double baseMenorInformada, double alturaInformada){
        if (Figura.possuiDimensaoValida(baseMenorInformada) == true){
            this.baseMenor = baseMenorInformada;
        }else{
            System.out.println("NAO ACEITA VALORES NEGATIVOS");
            this.baseMenor = 1.0;
        }
        if (Figura.possuiDimensaoValida(baseMaiorInformada) == true){
            this.baseMaior = baseMaiorInformada;
        }else{
            System.out.println("NAO ACEITA VALORES NEGATIVOS");
            this.baseMaior = 1.0;
        }
        if (Figura.possuiDimensaoValida(alturaInformada) == true){
            this.altura = alturaInformada;
        }else{
            System.out.println("NAO ACEITA VALORES NEGSTIVOS");
            this.altura = 1.0;
        }
        
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor)*altura)/2;
    }

    @Override
    public void mostrarDescricao() {
        Figura.super.mostrarDescricao();
    }
    
}
