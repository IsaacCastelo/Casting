package BO;

import DAO.ClientesDAO;
import DAO.IClienteDAO;
import entidades.Cliente;

/**
 *
 * @author Alexandra
 */
public class ClienteBO {
    public IClienteDAO clientesDAO = new ClientesDAO();
    
     public void regsistrar(Cliente cliente){
        if(clienteNuevo(cliente.getNombre())){
 //           clientesDAO.insert(cliente);
        }
        
    }
    
    public void getCliente(){
        clientesDAO.getClientes();
    }
    
    public boolean clienteNuevo(String nombre){
        if(clientesDAO.getClientesNombre(nombre)){
            return true;
        }
        else{
            System.out.println("Nombre repetido");
            return false;
        }
    }
}
