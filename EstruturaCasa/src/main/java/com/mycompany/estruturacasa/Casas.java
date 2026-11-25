/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturacasa;

/**
 *
 * @author katio
 */
public class Casas {
    String nome;
    String tamanho;
    int comodos;
    String andares;
    String cor;
    String tipo_de_telhado;
    String endereco;
    String material;
    boolean terreno;
    
    public void morar() {
        System.out.println("Esta morando");    
    }
    
    public void trancarPortas() {
        System.out.println("Portas trancadas");
    }
    
    public void abrirPortas() {
        System.out.println("Portas abertas");
    }
    
    public void fecharJanelas() {
        System.out.println("Janelas fechadas");
    }
    
    public void abrirJanelas() {
        System.out.println("Janelas abertas");
    }
    
    public void acenderLuz() {
        System.out.println("Luz acesa");
    }
    
    public void apagarLuz() {
        System.out.println("Luz apagada");
    }
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS DA CASA ===");
        System.out.println("Nome " + nome);
        System.out.println("Tamanho " + tamanho);
        System.out.println("Comodos " + comodos);
        System.out.println("Andares " + andares);
        System.out.println("Cor " + cor);
        System.out.println("Tipo de telhado " + tipo_de_telhado);
        System.out.println("Endereco " + endereco);
        System.out.println("Material " + material);
        System.out.println("Possui terreno " + (terreno ? "Sim" : "Nao"));
    }  
    
         
    
    
}
