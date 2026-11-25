/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpoodsafio3interface3;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class LPOODsafio3Interface3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        PedidoInternacional pedido1 = new PedidoInternacional();
        PedidoInternacional pedido2 = new PedidoInternacional();
        
        Pedido[] pedidos = {pedido1, pedido2};
        
        for(int i=0; i<pedidos.length; i++){
            System.out.println("================== SISTEMA E-COMERCE ============");
            System.out.println(" Informe a distancia em KM ");
            double distancia = teclado.nextDouble();
            double frete = pedidos[i].calcularFrete(distancia);
            System.out.println("=================================================");
            System.out.println(" Valor do frete para a distancia informada " + frete);
            System.out.println("=================================================");
            double taxa = pedidos[i].taxaFixa();            
            System.out.println(" Valor da taxa de fixa R$ " +taxa);
            System.out.println("=================================================");
            System.out.println(" Informe o valor da compra ");
            double valorCompra = teclado.nextDouble();
            System.out.println("=================================================");
            System.out.println(" Informe o cupom ");
            String cupom = teclado.next();
            System.out.println("=================================================");
            double valorFinal = pedidos[i].aplicarDesconto(valorCompra, cupom);
            double valorPagar = frete + taxa + valorFinal;
            System.out.println(" Valor total a pagar " + valorPagar);
            System.out.println("=================================================");
            //este metodo retorna o valor original-desconto
            //ou o valor original
            //double valoreComOuSemDesconto = pedidos[i].aplicarDesconto(compra, cupom);
            //double total = frete + taxa + valoreComOuSemDesconto;
            //System.out.println(" Valor a pagar R$ " +total);
            
        }
    }
}
