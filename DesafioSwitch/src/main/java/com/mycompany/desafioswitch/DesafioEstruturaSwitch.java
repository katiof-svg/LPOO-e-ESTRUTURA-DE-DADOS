/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafioswitch;

import java.util.Scanner;

/**
 *
 * @author katio
 */

/**❖ Leia o código de um determinado produto e mostre sua classificação. Utilize a seguinte tabela como referência:
 * Código                         Classificação
 * 1                             Alimento não-perecível
 * 2, 3 ou 4                     Alimento perecível
 * 5 ou 6                        Vestuário
 * 7                             Higiene pessoal
 * 8 até 15                      Limpeza e Utensílios Domésticos
 * Qualquer outro código         Código inválido
*/

public class DesafioEstruturaSwitch {

    public static void main(String[] args) {
        int codigo;
        String classificacao;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== ESCOLHA UMA OPCAO DE 1 a 15 ===");
        codigo = teclado.nextInt();
        
        switch(codigo){
            case 1:{
                System.out.println("= Alimento nao-perecivel =");
                break;
            }
            case 2:
            case 3:
            case 4:{
                System.out.println("= Alimento perecivel =");
                break;
            }
            case 5:
            case 6:{
                System.out.println("= Vestuario =");
                break;
            }
            case 7:{
                System.out.println("= Higiene pessoal =");
                break;
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:{
                System.out.println("= Limpeza e Utensilios Domesticos =");
                break;
            }
            default:{
                System.out.println("= Codigo invalido =");
            }
        }       
            
    }
}
