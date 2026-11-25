/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoobiblioteca;

/**
 *
 * @author katio
 */
public class Autorias {
    int id_autoria;
    Livros livro;
    Autores autor;
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS AUTORIA ===");
        System.out.println("Id Autoria: "+id_autoria);
        System.out.println("Livro: "+livro.titulo);
        System.out.println("Autor: "+autor.nome);
    }
    
}
