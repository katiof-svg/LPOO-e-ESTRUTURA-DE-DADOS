/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contacorrentelpoo;

/**
 *
 * @author katio
 */
public class ContaCorrenteLPOO {

    private int numero;
    private String titular;
    private double saldo;
    private String cpf;
    private int senha;
    
    /*Método construtor
    Mesmo nome da classe
    */
    
    public ContaCorrenteLPOO(int numeroConta, String titularNome, String cpfInformado, int senhaInformada) {
        numero = numeroConta;
        titular = titularNome;
        saldo = 100.00;
        cpf = cpfInformado;        
        senha = senhaInformada;
    }
    
    public void setTitular(String nomeTitular){
        titular = nomeTitular;        
    }
    
    public void setSenha(int senhaTitular){//Método sem retorno "VOID"              
        senha = senhaTitular;
    }
    
    public int getNumero(){//Método com retorno "INT"
        return numero;       
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getSenha(){
        return senha;
    }
    
    //Métodos de negócio
    public void mostrarInformacoes(){
        System.out.println("==== EXTRATO BANCARIO ====");
        System.out.println("Conta: " + getNumero());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("CPF: " + getCpf());        
    }
    
    public void sacar(double valorSaque, int senhaDigitada){
        if ((valorSaque <= getSaldo()) && (senhaDigitada == getSenha())){
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso");
        }else if (senhaDigitada != getSenha()) {
            System.out.println("Senha incorreta!");
        }else  {
            System.out.println("Saldo insuficiente.");
        }     
        
           
    }
    
    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
        System.out.println("Deposito realizado com sucesso!");
    }
    
    public void tranferir(double valorTransferencia, ContaCorrenteLPOO contaDestino){
        if(this.getSaldo() >= valorTransferencia){
            this.saldo -= valorTransferencia;           
            contaDestino.saldo += valorTransferencia;
            System.out.println("Transferencia realizada com sucesso!");
        }else{
            System.out.println("====================");
            System.out.println("Saldo insuficiente");
            System.out.println("====================");
        }       
            
        
        
    }
}
