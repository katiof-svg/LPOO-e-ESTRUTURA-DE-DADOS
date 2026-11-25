/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturabicicletas;

/**
 *
 * @author katio
 */
public class Bicicletas {
    String nome;
    String marca;
    String quadro;
    String cor;
    int aro;
    String freio;
    String suspensao;
    int marchas;
    
    public void acelerar() {
        System.out.println("Esta acelerando");
    }
    
    public void frear() {
        System.out.println("Esta freando");
    }
    
    public void parar() {
        System.out.println("Esta parando");
    }
    
    public void mudarMarcha() {
        System.out.println("Mudando a marcha");
    }
    
    public void virarDireita() {
        System.out.println("Virando a direita");
    }
    
    public void virarEsquerda() {
        System.out.println("Virando a esquerda");
    }
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS DA BICICLETA ===");
        System.out.println("Nome " + nome);
        System.out.println("Marca " + marca);
        System.out.println("Quadro " + quadro);
        System.out.println("Cor " + cor);
        System.out.println("Aro " + aro);
        System.out.println("Freio " + freio);
        System.out.println("Suspensao " + suspensao);
        System.out.println("Marchas " + marchas);
    }
    
}
