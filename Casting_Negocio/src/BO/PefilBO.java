/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.ConexionBD;
import DAO.PerfilDAO;
import Interfaces.IPerfilBO;
import Interfaces.IPerfilDAO;
import entidades.Perfil;
import java.util.List;
import javax.swing.JOptionPane;


public class PefilBO implements IPerfilBO{
    IPerfilDAO perfilDAO = new PerfilDAO(ConexionBD.getInstance()); 
    @Override
    public void regsistrar(Perfil perfil){
        if(getPerfil().equals(perfil)){
            JOptionPane.showMessageDialog(null, "Perfil repetido", "Cliente", JOptionPane.ERROR_MESSAGE); 
        }
        else{
            perfilDAO.agregar(perfil);
        }
    }
   
    @Override
    public void eliminar(Perfil perfil){
        perfilDAO.eliminar(perfil);
        
    }
    
    @Override
    public List<Perfil> getPerfil(){
        return perfilDAO.consultarTodos();
    }
    

}
