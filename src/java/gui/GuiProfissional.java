/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Dao.Dados;
import Dao.DaoProfissional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Especializacao;
import model.Profissional;
import model.Regioes;

/**
 *
 * @author fjunger
 */
@Named(value = "guiProfissional")
@SessionScoped
public class GuiProfissional implements Serializable{
    
    private List<Profissional> listaDeProfissionais;
    private Profissional profissional;
    private boolean incluindo = false;
    private List<Especializacao> listaEspec = new ArrayList<>(EnumSet.allOf(Especializacao.class));
    private List<Regioes> listaReg = new ArrayList<>(EnumSet.allOf(Regioes.class));
      
    
    public String voltarIndex(){
        return "index";
    }
    public String gravarProfissional(){
        Dados d = new DaoProfissional();
        if(incluindo){
            try {
                d.gravar(profissional);
            } catch (Exception ex) {
                Logger.getLogger(GuiClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "frmlstProfissional";
    }
    
    public String deletarProfissional(Profissional p){
        Dados d = new DaoProfissional();
            try {
                d.excluir(p);
            } catch (Exception ex) {
                Logger.getLogger(GuiClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        listaDeProfissionais = d.getList();
        return "frmlstProfissional";
    }
         
    public String iniciarProfissional(){
        listaDeProfissionais = new DaoProfissional().getList();
        return "frmlstProfissional";
    }
    
    public String novoProfissional(){
        incluindo = true;
        profissional = new Profissional();
        return "frmaddProfissional";
    }
    public String editarProfissional(Profissional p){
        profissional = (Profissional) p;
        incluindo = false;
        return "frmaddProfissional";
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

    public List<Especializacao> getListaEspec() {
        return listaEspec;
    }

    public void setListaEspec(List<Especializacao> listaEspec) {
        this.listaEspec = listaEspec;
    }

    public List<Regioes> getListaReg() {
        return listaReg;
    }

    public void setListaReg(List<Regioes> listaReg) {
        this.listaReg = listaReg;
    }
    
    
       
}
