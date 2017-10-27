/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bigfoot.model.cliente;

import java.util.Date;

/**
 *
 * @author Vinícios
 */
public class Cliente {

    private String  nome, sexo, telefone, endereco;
    private Integer id;
    private Date nascimento;

        

    public Cliente(String nome, Date nascimento, String sexo, String telefone, String endereco, int id){
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome(){
        return nome;
    }

    public String getSexo(){
        return sexo;
    }

    public String getTelefone(){
        return telefone;    
    }

    public String getEndereco(){
        return endereco;
    }

    public void setIdCliente(int id){
        this.id = id;
    }

    public void setAlterarNome(String nome){
        this.nome = nome;
    }

    public void setAlterarTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setAlterarEndereco(String endereco){
        this.endereco = endereco;
    }

}