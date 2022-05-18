
package Interfaces;

import entidades.Agente;
import java.util.List;
import org.bson.types.ObjectId;

public interface IAgenteDAO {
    boolean agregar(Agente agente);
    boolean eliminar(Agente agente);
    List<Agente> consultarTodos();
    Agente consultar(ObjectId idAgente);
    Agente consultarNombre(String nombre);
}
