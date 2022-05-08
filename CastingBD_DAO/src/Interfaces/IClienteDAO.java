/*
 * IClienteDAO.java
 */
package Interfaces;

import entidades.Cliente;
import java.util.List;
import org.bson.types.ObjectId;

public interface IClienteDAO {
    boolean agregar(Cliente cliente);
    List<Cliente> consultarTodos();
    Cliente consultar(ObjectId idCliente);
}
