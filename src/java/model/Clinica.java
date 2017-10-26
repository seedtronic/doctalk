/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author fjunger
 */


public class Clinica {
    private static Integer prxid = 0;
    private Integer ID;
    private String nome;
    private String endereco;
    private String CNPJ;
    private String telefone;
    private List<Profissional> profissionais;
    private List<Planos> planos;
    private String usuario;
    private String senha;

    
    public Clinica(){
        this.ID=prxid;
        prxid++;
    }
    
    private void removeProfissional(Profissional p){
        profissionais.remove(p);   
    }
    
    private void addProfissional(Profissional p){
        profissionais.add(p);
    }
       
    public void addPlanos(Planos p){
        planos.add(p);
    }

    public List<Planos> getPlanos() {
        return planos;
    }

    public void setPlanos(List<Planos> planos) {
        this.planos = planos;
    }
    
    public void removePlanos(Planos p){
        planos.remove(p);
    }
    
    public void addProfissionais(Profissional p){
        profissionais.add(p);        
    }
    
    public void removeProfissionais(Profissional p){
        profissionais.remove(p);
    }
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
