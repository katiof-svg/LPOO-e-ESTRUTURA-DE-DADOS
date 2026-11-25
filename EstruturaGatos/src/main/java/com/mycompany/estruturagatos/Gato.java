/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturagatos;

/**
 *
 * @author katio
 */
public class Gato {
    String nome;
    String cor;
    String sexo;
    String cor_dos_olhos; 
    int idade;
    double peso;
    String raca;
    boolean castrado; 
    boolean vacinado;
    
    public void miar() {
        System.out.println("Esta miando");            
    }
    
    public void comer() {
        System.out.println("Esta comendo");
    }
    
    public void dormir() {
        System.out.println("Esta dormindo");
    }
    
    public void correr() {
        System.out.println("Esta correndo");
    }
    
    public void brincar() {
        System.out.println("Esta brincando");
    }
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS DO GATO===");
        System.out.println("Nome " + nome);
        System.out.println("Cor " + cor);
        System.out.println("Sexo " + sexo);
        System.out.println("Cor dos olhos " + cor_dos_olhos);
        System.out.println("Idade " + idade);
        System.out.println("Peso " + peso);
        System.out.println("Raca " + raca);
        System.out.println("Castrado " + castrado);        
        System.out.println("Vacinado " + vacinado);
    }


    
}



 



