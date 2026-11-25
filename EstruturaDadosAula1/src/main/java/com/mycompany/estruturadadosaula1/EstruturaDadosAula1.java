/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadadosaula1;

/**
 *
 * @author katio
 */
public class EstruturaDadosAula1 {
    
    public static void main(String[] args) {
        //CRIAR PRIMEIRO OBJETO ALUNO
        //REGRA PARA CRIAR OBJETO: NOME DA CLASSE SEGUIDO
        //DE NOME DO OBJETO SEGUIDO DE " = new" SEGUIDO DE
        //NOME DA CLASSE ();
        
        System.out.println("Aluno 1");
        Alunos aluno1 = new Alunos();
        
        aluno1.matricula=123;
        aluno1.media=8.5;
        aluno1.nome="Patrick de Paula";
        aluno1.online=false;
        
        aluno1.matricular();
        
        aluno1.consultarNotas();
        
        aluno1.mostrarInformacoes();
        
        
        System.out.println("Aluno 2");
        Alunos aluno2 = new Alunos();
        aluno2.matricula=124;
        aluno2.media=8.0;
        aluno2.nome="Maria Pereira";
        aluno2.online=false;
        
        aluno2.matricular();
        
        aluno2.consultarNotas();
        
        aluno2.mostrarInformacoes();
        
        
        System.out.println("Aluno 3");
        Alunos aluno3 = new Alunos();
        aluno3.matricula=125;
        aluno3.media=7.5;
        aluno3.nome="Rafael Ferreira";
        aluno3.online=true;
        
        aluno3.matricular();
        
        aluno3.consultarNotas();
        
        aluno3.mostrarInformacoes();
        
        
        
        
    }

   
}
