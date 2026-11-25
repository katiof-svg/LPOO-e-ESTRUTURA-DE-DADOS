/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpooatividade1;

/**
 *
 * @author katio
 */
public class Professores {
    int cpf;
    String nome;
    String titulacao;
    Cursos curso;
    
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS DOS PROFESSORES ===");
        System.out.println("CPF: "+cpf);
        System.out.println("Nome: "+nome);
        System.out.println("Titulacao: "+titulacao);
        System.out.println("Curso: "+curso.nome);
    }
    
}
