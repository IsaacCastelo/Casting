/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.ConexionBD;
import DAO.FaseDAO;
import Interfaces.IFaseBO;
import Interfaces.IFaseDAO;
import entidades.Fase;
import java.util.Date;
import java.util.List;

public class FaseBO implements IFaseBO{
    IFaseDAO faseDAO = new FaseDAO(new ConexionBD()); 
    
    @Override
    public void regsistrar(Fase fase){
        if(!(validarFecha(fase.getFechaInicio()))){
            faseDAO.agregar(fase);
        }
    }
   
    
    @Override
    public List<Fase> getCliente(){
        return faseDAO.consultarTodos();
    }
    
    @Override
    public boolean validarFecha(Date fechaInicio){
        if(faseDAO.consultarFecha(fechaInicio)!=null){
            return false;
        }
        else{
            return true;
        }
    }

}
