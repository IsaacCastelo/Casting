/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.CastingDAO;
import DAO.ConexionBD;
import Interfaces.ICastingBO;
import Interfaces.ICastingDAO;
import entidades.Casting;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

public class CastingBO implements ICastingBO{
     ICastingDAO castingDAO = new CastingDAO(ConexionBD.getInstance());  
    
    @Override
    public void regsistrar(Casting casting){
        if(!(validarCastingExiste(casting.getNombre()))){
            castingDAO.agregar(casting);
        }
        else{
            JOptionPane.showMessageDialog(null, "Nombre de casting repetido", "Casting", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    @Override
    public void eliminar(Casting casting){
        castingDAO.eliminar(casting);
        
    }
    
    @Override
    public List<Casting> getCasting(){
        return castingDAO.consultarTodos();
    }
    
    @Override
    public List<Casting> getCastingNombre(String nombre){
        return castingDAO.getCastingNombre(nombre);
    }
    
    @Override
    public Casting getCastingID(long idCliente){
        return castingDAO.getCastingID(idCliente);
    }
    
     @Override
    public boolean validarCastingExiste(String nombre){
        if(castingDAO.getCastingNombre(nombre)==null){
            
            return false;
        }
        else{
            return true;
        }
    }
}
