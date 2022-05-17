/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import DAO.CastingDAO;
import DAO.ClientesDAO;
import DAO.ConexionBD;
import DAO.FaseDAO;
import Interfaces.ICastingDAO;
import Interfaces.IClienteDAO;
import Interfaces.IFaseDAO;
import entidades.Casting;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Fase;
import entidades.Persona;
import java.util.Date;

/**
 *
 * @author Maste
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
        IClienteDAO clienteDAO = new ClientesDAO(ConexionBD.getInstance());      
//        clienteDAO.agregar(new Cliente("Miguel Hidalgo", new Direccion("Antonio Caso", "23B", "Villa Itson"), "6441177349", "moda" , new Persona("Don Pancho", "6419827643", new Direccion("Los arboles", "489y", "Mantecada"), "PELS021028HSRYPLA5")));
        clienteDAO.eliminar(new Cliente("Miguel Hidalgo", new Direccion("Antonio Caso", "23B", "Villa Itson"), "6441177349", "moda" , new Persona("Don Pancho", "6419827643", new Direccion("Los arboles", "489y", "Mantecada"), "PELS021028HSRYPLA5")));
        clienteDAO.consultarTodos().forEach((cliente) -> { System.out.println(cliente);});
        System.out.println(clienteDAO.consultarNombre("Pedro"));
//        Fase
//        IFaseDAO faseDAO = new FaseDAO(new ConexionBD());  
//        Date fecha = new Date();
//        fecha.setMonth(2);
//        fecha.setYear(119);
////        faseDAO.agregar(new Fase(3,fecha));
//        faseDAO.consultarTodos().forEach((fase) -> { System.out.println(fase);});
        
        
//        ICastingDAO castingDAO = new CastingDAO(ConexionBD.getInstance());
//        castingDAO.agregar(new Casting())
    }
    
}
