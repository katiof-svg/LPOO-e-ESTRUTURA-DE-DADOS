/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoahospital;

/**
 *
 * @author katio
 */
public class PessoaHospital {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    
    public PessoaHospital(String nomePessoa, String cpfPessoa, double salarioBasePessoa){
        nome=nomePessoa;
        cpf=cpfPessoa;
        salarioBase=salarioBasePessoa;
    };
    
    public void exibirFicha(){
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

