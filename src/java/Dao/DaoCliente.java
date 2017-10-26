/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author fjunger
 */
public class DaoCliente implements Dados{
    public static List<Cliente> clientes = new ArrayList<>();

    @Override
    public void gravar(Object obj) throws Exception {
        Cliente c = (Cliente) obj;
        clientes.add(c);
    }

    @Override
    public void excluir(Object obj) throws Exception {
        Cliente c = (Cliente) obj;
        clientes.remove(c);
    }

    @Override
    public void alterar(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getList() {
        return clientes;
    }
    
}
