/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


/**
 *
 * @author fjunger
 */
public class Pessoa implements Serializable {

    private static Integer idprx=0;
    private Integer ID;
    private String nome;
    private String Celular;
    private String Fixo;
    private String usuario;
    private String senha;

    public Pessoa() {
        this.ID=idprx;
        idprx++;
    }
    
    
 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getFixo() {
        return Fixo;
    }

    public void setFixo(String Fixo) {
        this.Fixo = Fixo;
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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    

}
