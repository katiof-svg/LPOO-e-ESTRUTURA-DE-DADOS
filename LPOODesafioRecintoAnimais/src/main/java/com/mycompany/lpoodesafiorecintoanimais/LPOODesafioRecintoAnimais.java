/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpoodesafiorecintoanimais;

/**
 *
 * @author katio
 */

/**❖ Crie um sistema de controle para um recinto de animais desenvolvendo a classe 
RecintoAnimal com os atributos privados para o código da jaula (texto), a espécie do animal 
(texto), o nome do tratador responsável (texto), a quantidade de ração disponível em quilos 
(double) e um indicador se o recinto está limpo ou sujo (booleano). 
❖ Implemente um método construtor que obrigue o cadastro a iniciar com o código da jaula, a 
espécie e o tratador, definindo por segurança que todo recinto comece com 50.00 quilos de 
ração e com o status de limpo como verdadeiro.
❖ Para aplicar corretamente as regras de encapsulamento, avalie o uso de métodos 
modificadores (Getters e Setters) para os atributos.
❖ Desenvolva os métodos de negócio:
➢ Para permitir a mudança de jaula, o método deve conter uma validação de segurança interna que só 
autoriza a troca se o status de limpeza do recinto for verdadeiro, exibindo um alerta de erro caso esteja 
sujo; 
➢ Crie os métodos de para limpar o recinto (que altera o status de limpeza para verdadeiro) e para 
alimentar o animal, lembrando que o método alimentar deve subtrair x quilos de ração e possui o efeito 
colateral automático de alterar o status de limpeza para falso (sujo) logo após o bicho comer. 
❖ No Main, você deve criar dois animais diferentes e simular todas as operações da classe 
RecintoAnimal 
 */ 
 
public class LPOODesafioRecintoAnimais {

   private String codJaula;
   private String espAnimal;
   private String tratadorResp;
   private double racao;
   private boolean limpo;
   
   public LPOODesafioRecintoAnimais (String codJaula, String espAnimal, String tratadorResp){
       this.codJaula = codJaula;
       this.espAnimal = espAnimal;
       this.tratadorResp = tratadorResp;
       racao = 50.00;
       limpo = true;
   }
   
   public String getCodJaula(){
      return codJaula;
   }
   
   public String getEspAnimal(){
      return espAnimal;   
   }
   
   public String getTratadorResp(){
       return tratadorResp;
   }
   
   public double getRacao(){
       return racao = 50.00;
   }
   
   public boolean getLimpo(){
       return limpo;
   }
   
   public void mostrarInformacoes(){
       System.out.println("=== INFORMACOES DO RECINTO ===");
       System.out.println("= Codigo da jaula: " + getCodJaula());
       System.out.println("= Especie do animal: " + getEspAnimal());
       System.out.println("= Tratador responsavel: " + getTratadorResp());
       System.out.println("= Quantidade de racao: " + getRacao());
       System.out.println("= Estado do ambiente: " + getLimpo());
       System.out.println("====================================");
   }
   
   /**➢ Para permitir a mudança de jaula, o método deve conter uma validação de segurança interna que só 
    autoriza a troca se o status de limpeza do recinto for verdadeiro, exibindo um alerta de erro caso esteja 
    sujo; 
   */   
   public void mudarJaula(String codJaulaNovo){       
       if (limpo == true){
           this.codJaula = codJaulaNovo;
           System.out.println(" Mudanca autorizada! Nova jaula com codigo: " + codJaulaNovo);
           System.out.println("=====================================================");
       }else{
           System.out.println(" Recinto sujo! Mudanca nao autorizada.");
           System.out.println("=====================================================");
       }       
   }
   
   /**➢ Crie os métodos de para limpar o recinto (que altera o status de limpeza para verdadeiro) e para 
    alimentar o animal, lembrando que o método alimentar deve subtrair x quilos de ração e possui o efeito 
    colateral automático de alterar o status de limpeza para falso (sujo) logo após o bicho comer. 
   */
   public void limparRecinto(){
       this.limpo = true;
       System.out.println(" Recinto limpo! ");
       System.out.println("=====================================================");
   }
   
   public void alimentarAnimal(double racaoConsumida){
       racao -= racaoConsumida;
       System.out.println("A quantidade de racao agora e " + racao);
       System.out.println("====================================");
       limpo = false;
   }
   
   
}
