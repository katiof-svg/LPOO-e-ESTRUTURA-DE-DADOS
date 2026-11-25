/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lpooaprendizageminterface;

/**
 *
 * @author katio
 */
public interface Figura {
    public static final double pi = 3.14159;
    //método abastrato
    //classe concreta que escreve ele
    double calcularArea();
    //metodo default
    //classe concreta vai terminar de escrever este metodo
    default void mostrarDescricao(){
        System.out.print("Esta e uma figura Geometrica ");
    }
    //classe concreta não escreve este metodo, ela apenas usa
    static boolean possuiDimensaoValida(double valor){
        if(valor>0){
            return true;
        }else{
            return false;
        }
    }
}
