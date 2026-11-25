/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrentelpoo;

/**
 *
 * @author katio
 */
public class Main {
    
    public static void main(String[] args) {
        ContaCorrenteLPOO conta1 = new ContaCorrenteLPOO(1234567, "Augusto Canesso", "029.287.077-03", 12345);
        ContaCorrenteLPOO conta2 = new ContaCorrenteLPOO(2345678, "Katia Osinski Ferreira", "003.851.149-58", 12345);
        /*criar conta precisa de número, titilar, saldo, cpf, senha
        Regra do Banco São Vicente
        Saldo R$ 100,00
        */
    conta1.setTitular("Augusto Canesso Babiuk");
    conta1.setSenha(54321);    
    //conta1.depositar(100);
    //conta1.sacar(50, 54321);
    conta1.mostrarInformacoes();
    
    conta2.mostrarInformacoes();
    
    conta1.tranferir(100, conta2);
    
    conta1.sacar(50, 54321);
    
    conta1.depositar(70);
  
    
       
    conta1.mostrarInformacoes();
    
    conta2.mostrarInformacoes();
    
    }
    
}