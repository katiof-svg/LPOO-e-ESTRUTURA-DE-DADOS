/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cartaofidelidadelpoo;

/**
 *
 * @author katio
 */
public class CartaoFidelidade {
    
    public static void main(String[] args) {
        
        CartaoFidelidadeLPOO cartao1 = new CartaoFidelidadeLPOO("Katia Osinski Ferreira", "003.851.149-58");
        CartaoFidelidadeLPOO cartao2 = new CartaoFidelidadeLPOO("Jrssica Izaias dos Santos", "046.204.509-95");
        
       
        
       cartao2.setNome("Jessica Izaias dos Santos");
        
        //cartao2.mostrarInformacoes();
        
        cartao1.ganharPontos(1000);        
        cartao1.resgatarPremio("TV", 20);        
        cartao1.transferirPontos(20, cartao2);
        
        //cartao2.ganharPontos(0);
        //cartao2.resgatarPremio(0);        
        //cartao2.transferirPontos(0, cartao1);
        
    }
    
}
