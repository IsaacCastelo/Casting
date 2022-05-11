package BO;

import DAO.ClientesDAO;
import DAO.ConexionBD;
import Interfaces.IClienteBO;
import Interfaces.IClienteDAO;
import entidades.Cliente;
import java.util.List;

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
    public void eliminar(Cliente cliente){
        
        clientesDAO.eliminar(cliente);
        
    }
    
    @Override
    public List<Cliente> getCliente(){
        return clientesDAO.consultarTodos();
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
