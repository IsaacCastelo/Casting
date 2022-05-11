/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.IConexionBD;
import Interfaces.IFaseDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Fase;
import entidades.Perfil;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

public class FaseDAO implements IFaseDAO{
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
    public FaseDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }
    
    private MongoCollection<Fase> getColeccion(){
        return this.baseDatos.getCollection("Fase", Fase.class);
    }
    
    @Override
    public boolean agregar(Fase fase) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Fase> coleccion = this.getColeccion();
        coleccion.insertOne(fase);
        return true;
    }
    
    @Override
    public List<Fase> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Fase> coleccion = this.getColeccion();
        List<Fase> listaFases = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaFases);
        return listaFases;
    }

    @Override
    public Fase consultar(ObjectId idFase) {
        MongoCollection<Fase> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("_id", idFase)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Fase> Fases = new LinkedList<>();
        coleccion.aggregate(etapas).into(Fases);
        return Fases.get(0);
    }
    
    @Override
    public Fase consultarFecha(Date fecha){
        MongoCollection<Fase> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("fecha", fecha)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Fase> Fases = new LinkedList<>();
        coleccion.aggregate(etapas).into(Fases);
        return Fases.get(0);
    }
}
