/*
 * Casting.java
 */
package entidades;

import java.util.List;
import org.bson.types.ObjectId;

public class Casting {
    private ObjectId id;
    private String nombre;
    private Direccion direccion;
    private Date fechaContratacion;
    private Cliente cliente;
    private float costo;
    private Agente agente;
    private List<ObjectId> idsPerfiles;
    private List<Perfil> perfiles;
    
    
}
