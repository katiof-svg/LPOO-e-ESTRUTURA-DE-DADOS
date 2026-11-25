/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacasa;

/**
 *
 * @author katio
 */
public class EstruturaCasa {

    public static void main(String[] args) {
        
        System.out.println("Casa 1");
        Casas Casa1 = new Casas();
        Casa1.nome= "Casa da Kati";
        Casa1.tamanho= "99m²";
        Casa1.comodos= 9;
        Casa1.andares= "Sobrado";
        Casa1.cor= "Bege";
        Casa1.tipo_de_telhado= "Telha de barro";
        Casa1.endereco= "Rua Arcelio Batista Teixeira, 125";
        Casa1.material= "Alvenaria";
        Casa1.terreno= true;
        
        Casa1.mostrarInformacoes();
        
        
        System.out.println("");
        System.out.println("Casa 2");
        Casas Casa2 = new Casas();
        Casa2.nome= "Casa da Maricha";
        Casa2.tamanho= "120m²";
        Casa2.comodos= 10;
        Casa2.andares= "Terreo";
        Casa2.cor= "Marrom claro";
        Casa2.tipo_de_telhado= "Telha de barro";
        Casa2.endereco= "Rua Coronel Gracia, 638";
        Casa2.material= "Alvenaria";
        Casa2.terreno= true;
        
        Casa2.mostrarInformacoes();
    }
}
