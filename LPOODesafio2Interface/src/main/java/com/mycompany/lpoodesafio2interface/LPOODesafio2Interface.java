/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpoodesafio2interface;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class LPOODesafio2Interface {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       UusarioComum usuario = new UusarioComum();
       Administrador admin = new Administrador();
       //criar vetor de objetos
       Autenticavel[] usuarios = {admin, admin};
       //percorrer vetor de objetos
       for(int i=0; i<usuarios.length; i++){
           System.out.println("=============================================");
           System.out.println("============ Sistema de autentificacao ===========");
           System.out.println(" Informe o usuario ");
           String user = teclado.nextLine();
           System.out.println(" Informe a senha ");
           String senha = teclado.nextLine();
           //chamar o vetor de objetos na posicao 0 e 1
           usuarios[i].realizarLogin(user, senha);
       }
        
    }
}
