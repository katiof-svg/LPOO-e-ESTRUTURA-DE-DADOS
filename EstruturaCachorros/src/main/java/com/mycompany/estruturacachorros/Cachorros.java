/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturacachorros;

/**
 *
 * @author katio
 */
public class Cachorros {
    String nome;
    String cor_do_pelo;
    String sexo;
    String cor_dos_olhos;
    int idade;
    double peso;
    String raca;
    boolean castrado = false;
    boolean vacinado;
    String porte;
    String problema_de_saude;
    
    public void latir() {
        System.out.println("Esta latindo");
    }
    
    public void comer() {
        System.out.println("Esta comendo");
    }
    
    public void correr() {
        System.out.println("Esta correndo");
    }
    
    public void brincar() {
        System.out.println("Esta brincando");
    }
    
    public void dormir() {
        System.out.println("Esta dormindo");
    }
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS DO CACHORRO ===");
        System.out.println("Nome " + nome);
        System.out.println("Cor do pelo " + cor_do_pelo);
        System.out.println("Sexo " + sexo);
        System.out.println("Cor dos olhos " + cor_dos_olhos);
        System.out.println("Idade " + idade);
        System.out.println("Peso " + peso);
        System.out.println("Raca " + raca);
        System.out.println("Castrado " + (castrado ? "Sim" : "Nao"));
        System.out.println("Vacinado " + (vacinado ? "Sim" : "Nao"));
        System.out.println("Porte " + porte);
        System.out.println("Problema de saude " + problema_de_saude);
        
    }
   
}
