/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpoodesafio1interface;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class LPOODesafio1Interface {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //2 objetos das classes concretas
        NotificacaoEmail email = new NotificacaoEmail();
        NotificacaoSms sms = new NotificacaoSms();
        //vetor com 2 objetos
        Notificador[] notificadores = {email, sms};
        //percorrer o vetor
        for(int i=0; i<notificadores.length; i++){
            System.out.println(" INFORME O DESTINATARIO ");
            String destinatario = teclado.nextLine();
            System.out.println("INFORME O TEXTO");
            String texto = teclado.nextLine();
            notificadores[i].enviarMensagem(destinatario, texto);
            
        }      
      
    }
}
