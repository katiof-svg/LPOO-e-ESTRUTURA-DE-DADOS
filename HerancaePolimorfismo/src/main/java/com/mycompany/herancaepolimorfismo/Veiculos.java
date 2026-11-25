/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author katio
 */
public class Veiculos {
    private String marca;
    private String modelo;
    private double preco;
    int velocidade;
    
    public Veiculos(String marcaVeiculo, String modeloVeiculo, double precoVeiculo){
        marca = marcaVeiculo;
        modelo = modeloVeiculo;
        preco = precoVeiculo;
        velocidade = 0;
        
    }
    
    public void exibirFicha(){
        System.out.println("=== DADOS DO VEICULO ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preco R$ " +getPreco());
        
    }
    
    public void acelerar(){
        this.velocidade += 10;
        System.out.println(this.getModelo() + "Acelerou! Velocidade: " + this.velocidade + " km/h" );
    }
    
    public void frear(){        
        if (velocidade > 0){
        this.velocidade -= 10;
            System.out.println("Veiculo freou!");
            
        }else{
            System.out.println("Veiculo parado!");            
          
        }
        
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
