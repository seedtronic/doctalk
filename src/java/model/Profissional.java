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
public class Profissional extends Pessoa{
    private String CRM;
    private Especializacao especializacao;
    private Regioes regiao;
    private List<Clinica> litaIDclinica;
    
    public void addClin(Clinica c){
        litaIDclinica.add(c);
    }
    
    public void removeClin(Clinica c){
        litaIDclinica.remove(c);
    }

    public Regioes getRegiao() {
        return regiao;
    }

    public void setRegiao(Regioes regiao) {
        this.regiao = regiao;
    }
   
    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

    public List<Clinica> getLitaIDclinica() {
        return litaIDclinica;
    }

    public void setLitaIDclinica(List<Clinica> litaIDclinica) {
        this.litaIDclinica = litaIDclinica;
    }


    
    
}
