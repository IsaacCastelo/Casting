/*
 * AdministradorDAO.java
 */
package DAO;

import Interfaces.IAdministradorDAO;
import Interfaces.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Administrador;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

public class AdministradorDAO implements IAdministradorDAO{
    
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
    public AdministradorDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }
    
    private MongoCollection<Administrador> getColeccion(){
        return this.baseDatos.getCollection("Administrador", Administrador.class);
    }
    
    @Override
    public boolean agregar(Administrador administrador) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Administrador> coleccion = this.getColeccion();
        coleccion.insertOne(administrador);
        return true;
    }

    @Override
    public List<Administrador> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Administrador> coleccion = this.getColeccion();
        List<Administrador> listaAdministrador = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaAdministrador);
        return listaAdministrador;
    }
}
