/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.IConexionBD;
import Interfaces.IPerfilDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Perfil;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;


public class PerfilDAO implements IPerfilDAO{
    private MongoDatabase baseDatos;
    
    public PerfilDAO(MongoDatabase conexion) {
        this.baseDatos = conexion;
    }
    
    private MongoCollection<Perfil> getColeccion(){
        return this.baseDatos.getCollection("Perfil", Perfil.class);
    }
    
    @Override
    public boolean agregar(Perfil perfil) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Perfil> coleccion = this.getColeccion();
        coleccion.insertOne(perfil);
        return true;
    }
    
    @Override
    public boolean eliminar(Perfil perfil) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Perfil> coleccion = this.getColeccion();
        coleccion.deleteOne(eq("estado",perfil.getEstado()));
        return true;
    }
    
    @Override
    public List<Perfil> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Perfil> coleccion = this.getColeccion();
        List<Perfil> listaPerfiles = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaPerfiles);
        return listaPerfiles;
    }

    @Override
    public Perfil consultar(ObjectId idCliente) {
        MongoCollection<Perfil> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("_id", idCliente)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Perfil> Perfiles = new LinkedList<>();
        coleccion.aggregate(etapas).into(Perfiles);
        return Perfiles.get(0);
    }
    
    @Override
    public Perfil consultarNombre(String nombre){
        MongoCollection<Perfil> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("nombre", nombre)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Perfil> perfiles = new LinkedList<>();
        coleccion.aggregate(etapas).into(perfiles);
        return perfiles.get(0);
    }
}
