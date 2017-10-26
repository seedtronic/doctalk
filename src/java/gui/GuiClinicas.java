/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Dao.Dados;
import Dao.DaoClinica;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Clinica;
import model.Profissional;

/**
 *
 * @author fjunger
 */
@Named(value = "guiClinicas")
@SessionScoped
public class GuiClinicas implements Serializable{
   
    private List<Profissional> listaDeProfissionais;
    private Profissional profissional;
    private boolean incluindoProfissional = false;
    
    private List<Clinica> filteredClin;
    private List<Clinica> listaDeClinicas;
    private Clinica clinica;
    private boolean incluindoClinicas = false;
    
    private String filtroP;
    
    
    public String gravarClinica(){
        Dados d = new DaoClinica();
        if(incluindoClinicas){
            try {
                d.gravar(clinica);
            } catch (Exception ex) {
                Logger.getLogger(GuiClinicas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        incluindoClinicas = false;
        return "frmlstClinica";
    }
    
    public String excluirClinica(Clinica c){
        Dados d = new DaoClinica();
            try {
                d.excluir(c);
            } catch (Exception ex) {
                Logger.getLogger(GuiClinicas.class.getName()).log(Level.SEVERE, null, ex);
            }
        return "frmlstClinica";
    }
    
    public String editarClinica(Clinica c){
        clinica = c;
        return "frmaddClinica";
    }
    
    public String novaClinica(){
        clinica = new Clinica();
        incluindoClinicas = true;
        return "frmaddClinica";
    }
    
    
    public String iniciarClinicas(){
        listaDeClinicas = new DaoClinica().getList();
        return "frmlstClinica";
    }

    public List<Profissional> getListaDeProfissionais() {
        return listaDeProfissionais;
    }

    public void setListaDeProfissionais(List<Profissional> listaDeProfissionais) {
        this.listaDeProfissionais = listaDeProfissionais;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public List<Clinica> getListaDeClinicas() {
        return listaDeClinicas;
    }

    public void setListaDeClinicas(List<Clinica> listaDeClinicas) {
        this.listaDeClinicas = listaDeClinicas;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public String getFiltroP() {
        return filtroP;
    }

    public void setFiltroP(String filtroP) {
        this.filtroP = filtroP;
    }

    public List<Clinica> getFilteredClin() {
        return filteredClin;
    }

    public void setFilteredClin(List<Clinica> filteredClin) {
        this.filteredClin = filteredClin;
    }
    
    
    
}
