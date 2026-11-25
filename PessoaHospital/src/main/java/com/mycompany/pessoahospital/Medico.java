/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoahospital;

/**
 *
 * @author katio
 */
public class Medico extends PessoaHospital{
    String crm;
    double plantaoBonificacao;
    
    public Medico(String nomePessoa, String cpfPessoa, double salarioBasePessoa, String crmMedico, double plantaoBonificacaoMed){
        super(nome, cpf, salrioBase);
        crm=crmMedico;
        plantaoBonificacao=plantaoBonificacaoMed;
    };
    
    
    
}
