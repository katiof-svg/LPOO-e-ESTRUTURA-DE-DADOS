/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadesafiocaixaeletronico;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class EstruturaDesafioCaixaEletronico {

    public static void main(String[] args) {
        //Inicializa o leitor do teclado
        Scanner teclado = new Scanner(System.in);
        
        //Define o saldo inicial fixo do cliente
        double saldo = 100.00;
        
        //Exibe o menu na tela com as opções
        System.out.println("=== BANCO ESCOLA ===");
        System.out.println("= 1 - Ver Saldo =");
        System.out.println("= 2 - Realizar Deposito =");
        System.out.println("= 3 - Realizar Saque =");
        int opcao = teclado.nextInt();
        
        
        //Estrutura de decisão encadeada com if / else if / else
        if (opcao == 1){
            //Opção: apenas mostra o saldo
            System.out.println("Seu saldo atual é: R$ " + saldo);
            
        }else if (opcao == 2){
            //Opção 2: pede o valor do depósito e atualiza o saldo
            System.out.println("Digite o valor que deseja depositar: R$ " + saldo);
            double deposito = teclado.nextDouble();
            saldo = saldo + deposito;
            System.out.println("Depósito realizado! Novo saldo: R$ " + saldo);
            
            }else if (opcao == 3){
            //Opção 3: pede o valor do saque e valida as condiçõs
            System.out.println("Digite o valor que deseja sacar: R$ ");
            double saque = teclado.nextDouble();
            
            //Nova checagem interna para não deixar o saldo ficar negativo
            if (saque <= saldo){
            saldo = saldo - saque;
            System.out.println("Saque  realizado com sucesso! Retire seu dinheiro.");           
            System.out.println("Saldo restante: R$ " + saldo);
            
            }else{
                System.out.println("Saldo insuficiente!");
        }
                       
        }else{
            //Opção Inválida: se digitar qualquer número que não seja 1, 2 ou 3
            System.out.println("Erro: Opcao invalida! Escolha 1, 2 ou 3.");
        }
        
        //Fecha o teclado
        teclado.close();
    }
}
