/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpooatividade1;

/**
 *
 * @author katio
 */
public class Disciplinas {
    int id_disciplina;    
    String nome;
    int carga_horaria;
    int periodo;
    Cursos curso;
    Professores professor;
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS DAS DISCIPLINAS ===");
        System.out.println("Disciplina: "+id_disciplina);
        System.out.println("Professor: "+professor.nome);
        System.out.println("Nome: "+nome);
        System.out.println("Carga Horaria: "+carga_horaria);
        System.out.println("Periodo: "+periodo);
        System.out.println("Curso: "+curso.nome);
        
    }
    
}
