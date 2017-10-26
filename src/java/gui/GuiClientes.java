/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Dao.Dados;
import Dao.DaoCliente;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Cliente;

/**
 *
 * @author fjunger
 */
@Named(value = "guiClientes")
@SessionScoped
public class GuiClientes implements Serializable{
    
    private List<Cliente> listaDeClientes;
    private Cliente cliente;
    private boolean incluindo = false;
    
    

    
    public String gravarCliente(){
        Dados d = new DaoCliente();
        if(incluindo){
            try {
                d.gravar(cliente);
            } catch (Exception ex) {
                Logger.getLogger(GuiClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "frmlstCliente";
    }
    
    public String deletarCliente(Cliente c){
        Dados d = new DaoCliente();
            try {
                d.excluir(c);
            } catch (Exception ex) {
                Logger.getLogger(GuiClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        return "frmlstCliente";
    }
    
    public String editarCliente(Cliente c){
        incluindo = false;
        cliente = c;
        return "frmAddCliente";
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String iniciarCliente(){
        listaDeClientes = new DaoCliente().getList();
        return "frmlstCliente";
    }
    
    public String novoCliente(){
        incluindo = true;
        cliente = new Cliente();
        return "frmAddCliente";
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }


    
    
    
}
