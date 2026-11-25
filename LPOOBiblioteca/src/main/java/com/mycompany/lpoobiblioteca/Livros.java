/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoobiblioteca;

/**
 *
 * @author katio
 */
public class Livros {
    String isbn;
    String titulo;
    int ano_publicacao;
    Editoras editora;
    String categoria;
    
    public void mostrarInformacoes() {
        System.out.println("=== DADOS DO LIVRO ===");
        System.out.println("ISBN: "+isbn);
        System.out.println("Titulo: "+titulo);
        System.out.println("Ano de Publicacao: "+ano_publicacao);
        System.out.println("Editora: "+editora.nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Local editora: "+editora.cidade);
    }
    
}

