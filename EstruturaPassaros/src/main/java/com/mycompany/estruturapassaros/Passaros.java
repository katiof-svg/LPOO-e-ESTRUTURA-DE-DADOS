/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturapassaros;

/**
 *
 * @author katio
 */
public class Passaros {
    String nome;
    String especie;
    String cor;
    double envergadura;
    double tamanho_do_bico;
    double peso;
    String sexo;
    
    public void voar() {
        System.out.println("Esta voando");
    }
    
    public void pousar() {
        System.out.println("Esta pousando");
    }
    
    public void cantar() {
        System.out.println("Esta cantando");
    }
    
    public void comer() {
        System.out.println("Esta comendo");
    }
    
    public void dormir() {
        System.out.println("Esta dormindo");
    }
    
    public void procriar() {
        System.out.println("Esta procriando");
    }
    
    public void botarOvo() {
        System.out.println("Esta botando ovo");
    }
    
    public void mostrarInformacoes(){
        System.out.println("=== DADOS DO PASSARO ===");
        System.out.println("Nome " + nome);
        System.out.println("Especie " + especie);
        System.out.println("Cor " + cor);
        System.out.println("Envergadura(cm) " + envergadura);
        System.out.println("Tamanho do Bico(cm) " + tamanho_do_bico);
        System.out.println("Peso(gr) " + peso);
        System.out.println("Sexo " + sexo);
    }
    
    
}
