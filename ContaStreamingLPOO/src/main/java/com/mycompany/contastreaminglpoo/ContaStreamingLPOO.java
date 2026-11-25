/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contastreaminglpoo;

/**
 *
 * @author katio
 */
public abstract class ContaStreamingLPOO {
    private String nomeTitular;
    private String email;
    private int limMaxTelas = 0;
    private double mensalidade = 43.00;
    
    
    public ContaStreamingLPOO(String nomeTitularStream, String emailStream, int limMaxTelasStream){
        this.nomeTitular = nomeTitularStream;
        this.email = emailStream;
        this.limMaxTelas = limMaxTelasStream;
        
        
    }
    
    public abstract void configurarPlano();
    
    public abstract double calcularMensalidade();
    
    public void exibirFichaConta(){
        System.out.println("===========");
        System.out.println("TITULAR: " + this.nomeTitular);
        System.out.println("EMAIL: " + this.email);       
        System.out.println("MENSALIDADE BASE: " + this.mensalidade);
    };

    /**
     * @return the nomeTitular
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * @param nomeTitular the nomeTitular to set
     */
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the limMaxTelas
     */
    public int getLimMaxTelas() {
        return limMaxTelas;
    }

    /**
     * @param limMaxTelas the limMaxTelas to set
     */
    public void setLimMaxTelas(int limMaxTelas) {
        this.limMaxTelas = limMaxTelas;
    }

    /**
     * @return the mensalidade
     */
    public double getMensalidade() {
        return mensalidade;
    }

    /**
     * @param mensalidade the mensalidade to set
     */
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    
}
