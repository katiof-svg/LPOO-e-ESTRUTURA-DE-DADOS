/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpooatividade1;

/**
 *
 * @author katio
 */
public class LPOOFaculdade {

    public static void main(String[] args) {
        
        Cursos cursoTi = new Cursos();
        cursoTi.id_curso=1;
        cursoTi.nome="TADS";
        cursoTi.departamento="Informatica";
        cursoTi.mostrarInformacoes();
        
        
        System.out.println("");
        Alunos aluno1 = new Alunos();
        aluno1.matricula=1234;
        aluno1.nome="Roberto Capivariano";
        aluno1.cpf="3547892";
        aluno1.email="capivariano@gmail.com";
        aluno1.curso=cursoTi;
        aluno1.mostrarInformacoes();
        
        
        System.out.println("");         
        Professores professor1 = new Professores();
        professor1.cpf=12345678;
        professor1.nome="Antonio Fagundes";
        professor1.titulacao="Phd";
        professor1.curso=cursoTi;
        professor1.mostrarInformacoes();
        
        System.out.println("");
        Disciplinas disciplina1 = new Disciplinas();
        disciplina1.id_disciplina=12;
        disciplina1.nome="Linguagem de Programacao";
        disciplina1.carga_horaria=40;
        disciplina1.periodo=2;
        disciplina1.professor=professor1;
        disciplina1.curso=cursoTi;
        disciplina1.mostrarInformacoes();
        
        
    }
}
