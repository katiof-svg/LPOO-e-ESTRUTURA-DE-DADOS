/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursoshumanoshospitallpoo;

/**
 *
 * @author katio
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    public Pessoa(String nomePessoa, String cpfPessoa, double salarioBasePessoa){
        nome=nomePessoa;
        cpf=cpfPessoa;
        salarioBase=salarioBasePessoa;
    };
    
    public double calcularSalarioFinal(){
        return salarioBase;
    };
    
    public void exibirInformacoes(){
        System.out.println("NOME COMPLETO " + nome);
        System.out.println("CPF " + cpf);
        System.out.println("SALARIO BASE " + salarioBase);
    };

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
}
