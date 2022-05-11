package BO;

import DAO.ClientesDAO;
import DAO.ConexionBD;
import Interfaces.IClienteBO;
import Interfaces.IClienteDAO;
import Interfaces.IConexionBD;
import entidades.Cliente;

/**
 *
 * @author Alexandra
 */
public class ClienteBO implements IClienteBO{
    IClienteDAO clientesDAO = new ClientesDAO(new ConexionBD());  
    
    @Override
    public void regsistrar(Cliente cliente){
        if(!(validarClienteExiste(cliente.getNombre()))){
            clientesDAO.agregar(cliente);
        }
    }
    
    @Override
    public void getCliente(){
        clientesDAO.consultarTodos();
    }
    
    @Override
    public boolean validarClienteExiste(String nombre){
        if(clientesDAO.consultarNombre(nombre)!=null){
            return false;
        }
        else{
            System.out.println("Nombre repetido");
            return true;
        }
    }
}
