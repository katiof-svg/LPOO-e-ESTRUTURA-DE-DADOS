/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoodesafio2interface;

/**
 *
 * @author katio
 */
public class Administrador implements Autenticavel{

    @Override
    public boolean realizarLogin(String usuario, String senha) {
        if(Autenticavel.super.realizarLogin(usuario, senha)==true){
            System.out.println("ATENCAO: Acesso admininstrativo realizado nos logs!");
            System.out.println("=====================================================");
            return true;
        }else{
            System.out.println("[ACESSO BLOQUEADO] Tentativa de login administrativo com senha fraca!");
            System.out.println("=======================================================================");
            return false;
        }
    }
    
}
