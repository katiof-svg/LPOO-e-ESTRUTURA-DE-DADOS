/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturaaprendizagemi;

import java.util.Scanner;

/**
 *
 * @author katio
 */

//Uma loja está dando desconto se o cliente comprar acima de R$ 200 
//OU for um cliente VIP. Crie um algoritmo que leia o valor da compra e 
//se o cliente é VIP e calcule o desconto

public class EstruturaAprendizagemI {

    public static void main(String[] args) {
        double compra;
        boolean vip;
        double desconto;
        double valorFinal;
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=== VALOR DA COMPRA ===");
        compra=teclado.nextDouble();
        
        System.out.println("=== CLIENTE VIP ===");
        vip=teclado.nextBoolean();
        
        if(compra>=200 || vip==true){
            desconto=compra*15/100;
            valorFinal=compra - desconto;
            System.out.println("DESCONTO: R% "+desconto);
            System.out.println("VALOR FINAL: R$ "+ valorFinal);
        }else{
            System.out.println("NAO TEM DESCONTO");
        }       
            
        
        
        
        
        
    }
}
