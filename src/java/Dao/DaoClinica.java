/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.ArrayList;
import java.util.List;
import model.Clinica;

/**
 *
 * @author fjunger
 */
public class DaoClinica implements Dados{
    public static List<Clinica> clinicas = new ArrayList<>();

    @Override
    public void gravar(Object obj) throws Exception {
        Clinica c = (Clinica) obj;
        clinicas.add(c);
    }

    @Override
    public void excluir(Object obj) throws Exception {
        Clinica c = (Clinica) obj;
        clinicas.remove(c);
    }

    @Override
    public void alterar(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getList() {
        return clinicas;
    }
    
}
