/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import DAO.ClientesDAO;
import DAO.ConexionBD;
import Interfaces.IClienteDAO;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Persona;

/**
 *
 * @author Maste
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IClienteDAO clienteDAO = new ClientesDAO(new ConexionBD());      
       // clienteDAO.agregar(new Cliente("Miguel Hidalgo", new Direccion("Antonio Caso", "23B", "Villa Itson"), "6441177349", Cliente.tipoActividad.MODA , new Persona("Don Pancho", "6419827643", new Direccion("Los arboles", "489y", "Mantecada"), "PELS021028HSRYPLA5")));
        clienteDAO.consultarTodos().forEach((cliente) -> { System.out.println(cliente);});
    }
    
}
