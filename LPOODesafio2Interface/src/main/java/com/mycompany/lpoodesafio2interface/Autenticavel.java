/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lpoodesafio2interface;

/**
 *
 * @author katio
 */
public interface Autenticavel {
    public static final int tamanho_minimo_senha=8;
    
    static boolean validarForcaSenha(String senha){
        if(senha.length()>=tamanho_minimo_senha){
            return true;
        }else{
            return false;
        }
    }
    
    default boolean realizarLogin(String usuario, String senha){
        if(validarForcaSenha(senha)==true){
            System.out.println("==========================================");
            System.out.println("Usuario " +usuario+ ", logado com sucesso!");
            System.out.println("==========================================");
            return true;
        }else{
            System.out.println("========================================================");
            System.out.println("Senha muito fraca. Tente novamente usando 8 caracteres!");
            System.out.println("========================================================");
            return false;
        }
    }
}
