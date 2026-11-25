/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class Main {
    public static void main(String[] args) {
        Cachorro Snoopy = new Cachorro("Snoopy", "Charlie Brown", 120.00, "12345", 60.00);
        
        Gato Garfield = new Gato("Garfield", "Jon", 100.00, "654321", 4);
        
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== PETSHOW ANIMAL ===");
        System.out.println("==ESCOLHA UMA OPCAO==");
        System.out.println("[gato] | [cachorro]");
        String opcao = teclado.next();
        
        switch(opcao.toLowerCase()){
            case "gato":{
                Garfield.exibirInformacoes();
                break;
            }
            case "cachorro":{
                Snoopy.exibirInformacoes();
                break;
            }
            default:{
                System.out.println("HORA DE DAR TCHAU...");
            }
        }
    }
    
}
