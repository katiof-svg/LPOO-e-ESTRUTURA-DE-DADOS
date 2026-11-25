/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cartaofidelidadelpoo;

/**
 *
 * @author katio
 */

/* ❖ Crie um sistema de recompensas de lojas desenvolvendo a classe 
CartaoFidelidade com os atributos privados para o nome do cliente (texto), o CPF 
do titular (texto) e o saldo de pontos acumulados (inteiro).
❖ Utilizando método construtor, obrigue a passar o nome e o CPF, iniciando o saldo 
de pontos em zero. 
❖ Para aplicar corretamente as regras de encapsulamento, avalie o uso de métodos 
modificadores (Getters e Setters) para os atributos.
❖ Desenvolva três métodos de negócio na classe: 
➢ Método ganharPontos (soma pontos ao saldo após uma compra. O valor da compra gera 10% 
de pontos).
➢ Método resgatarPremio (O cliente escolhe produto e o valor deste subtrai pontos do seu saldo. 
Verifique se o cliente tem os pontos necessários para esta operação).
➢ Método transferirPontos (recebe a quantidade de pontos e o objeto CartaoFidelidade de 
um amigo ou familiar, validando se o cliente possui os pontos para realizar a retirada de sua 
conta e a inserção imediata no cartão do outro usuário).
❖ No Main, você deve criar dois cartões de clientes diferentes e simular todas as 
operações da classe CartaoFidelidade.   
*/

public class CartaoFidelidadeLPOO {
    
    private String nome;
    private String cpf;
    private int saldoPontos;    
    //double produto;
    //int pontos;
    //int saldoInicial;
    
    public CartaoFidelidadeLPOO (String nomeCliente, String cpfCliente){
        nome = nomeCliente;
        cpf = cpfCliente;
        saldoPontos = 0;
             
                
    }
    
    public void setNome(String nomeAlterado){
        nome = nomeAlterado;
    }
    
    public String getNome(){
        return nome;    
    }
    
    
    public String getCpf(){
        return cpf;
    }
    
    public int getSaldoPontos(){
        return saldoPontos;
    }
    
    //Métodos de negócio
    public void mostrarInformacoes(){
        System.out.println("=== MOSTRAR INFORMACOES ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Pontos acumulados: " + getSaldoPontos());
    }
    
    //➢ Método ganharPontos (soma pontos ao saldo após uma compra. O valor da compra gera 10% de pontos).
    public void ganharPontos(double compra){
        if (compra > 0){
            saldoPontos += compra*10/100;            
            System.out.println("Voce recebeu 10% de pontos da sua compra!");
            System.out.println("====================================");
            System.out.println("Voce ganhou " + compra*10/100);
            System.out.println("====================================");
            System.out.println("Voce acumulou: " + saldoPontos);
            System.out.println("====================================");
        }else{
            System.out.println("Sem pontos hoje!");
            System.out.println("====================================");
        }    
    }
    
    /*➢ Método resgatarPremio (O cliente escolhe produto e o valor deste subtrai pontos do seu saldo. 
    Verifique se o cliente tem os pontos necessários para esta operação).*/
    public void resgatarPremio(String produto, int pontosPremio){
        if (saldoPontos >= pontosPremio){
            saldoPontos -= pontosPremio;
            System.out.println("Pontos utilizados com sucesso!");
            System.out.println("====================================");
            System.out.println("Voce resgatou " + produto + " Saldo atual " + saldoPontos);
            System.out.println("====================================");
        }else{
            System.out.println("Pontos insuficientes!");
            System.out.println("====================================");
        }
    }
    
    /*➢ Método transferirPontos (recebe a quantidade de pontos e o objeto CartaoFidelidade de 
    um amigo ou familiar, validando se o cliente possui os pontos para realizar a retirada de sua 
    conta e a inserção imediata no cartão do outro usuário).*/
    public void transferirPontos(int pontosTransferidos, CartaoFidelidadeLPOO cartaoDestino){
        if (this.getSaldoPontos() >= pontosTransferidos){
            this.saldoPontos -= pontosTransferidos;
            cartaoDestino.saldoPontos += pontosTransferidos;
            System.out.println("Pontos transferidos com sucesso!");
            System.out.println("====================================");
            this.mostrarInformacoes();
            System.out.println("====================================");
            cartaoDestino.mostrarInformacoes();
            System.out.println("====================================");
        }else{
            System.out.println("Sem saldo de pontos para a operacao!");
        }
        
        
    }
    
}          
       
    

