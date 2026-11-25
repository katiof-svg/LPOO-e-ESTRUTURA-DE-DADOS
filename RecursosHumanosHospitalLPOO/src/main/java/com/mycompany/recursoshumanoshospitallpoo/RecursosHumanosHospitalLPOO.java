/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursoshumanoshospitallpoo;

import java.util.Scanner;

/**
 *
 * @author katio
 */
public class RecursosHumanosHospitalLPOO {

    public static void main(String[] args) {
        Medico medico1 = new Medico("MARIA FERREIRA", "014.888.059-20", 10000.00, "123456/PR", 5000.00);
        Enfermeiro enfermeiro1 = new Enfermeiro("PEDRO SILVEIRA", "123.456.789-10", 3500.00, "COREN-PR-654321-ENF", 15);
        
        String opcao;
        
        Scanner teclado = new Scanner(System.in);
            System.out.println("==== ESCOLHA UMA OPCAO ====");
            System.out.println("==== MEDICO ====");
            System.out.println("==== ENFERMEIRO ====");
            System.out.println("==== FECHAR ====");
            opcao = teclado.nextLine();
            
            
            switch (opcao.toLowerCase()) {
                    case "medico": {
                        medico1.exibirInformacoes();
                        break;
                    }
                    case "enfermeiro": {
                        enfermeiro1.exibirInformacoes();
                        break;
                    }
                    default: {
                        System.out.println("SISTEMA ENCERRADO");
                    }
            }
        
        
        
    }
}
