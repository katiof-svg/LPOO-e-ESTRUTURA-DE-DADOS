/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpoobiblioteca;

/**
 *
 * @author katio
 */
public class LPOOBiblioteca {

    public static void main(String[] args) {
        
        
        Editoras editora1 = new Editoras();
        
        editora1.id_editora=1;
        editora1.nome="Circulo do Livro";
        editora1.cidade="Irati";
        editora1.telefone="(42)91234-56789";
       // editora1.mostrarInformacoes();
        System.out.println("");
        
        
        
        Livros livro1 = new Livros();
        
        livro1.isbn="123-45-67891-01-2";
        livro1.titulo="Clarissa";
        livro1.ano_publicacao=1933;
        livro1.editora=editora1;
        livro1.categoria="Romance";
        livro1.mostrarInformacoes();
        System.out.println("");
        
        
        
        Autores autor1 = new Autores();
        
        autor1.id_autor=1;
        autor1.nome="Erico Verissimo";
        autor1.nacionalidade="Brasileira";
        autor1.email="erico@gmail.com";
        //autor1.mostrarInformacoes();
        System.out.println("");
               
        
        
        Autorias autoria1 = new Autorias();
        
        autoria1.id_autoria=1;
        autoria1.livro=livro1;
        autoria1.autor=autor1;
        autoria1.mostrarInformacoes();
        
        
        
        
        
    }
}
