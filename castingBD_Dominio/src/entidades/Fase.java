/*
 * Fase.java
 */
package entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class Fase {
    private ObjectId id;
    private int numero;
    private Date fechaInicio;
    private Casting casting;
    private List<ObjectId> idsPruebas;
    private List<Prueba> pruebas;

    public Fase() {
    }

    public Fase(ObjectId id, int numero, Date fechaInicio, Casting casting, List<ObjectId> idsPruebas, List<Prueba> pruebas) {
        this.id = id;
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.casting = casting;
        this.idsPruebas = idsPruebas;
        this.pruebas = pruebas;
    }

    public Fase(int numero, Date fechaInicio, Casting casting) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.casting = casting;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Casting getCasting() {
        return casting;
    }

    public void setCasting(Casting casting) {
        this.casting = casting;
    }

    public List<ObjectId> getIdsPruebas() {
        return idsPruebas;
    }

    public void setIdsPruebas(List<ObjectId> idsPruebas) {
        this.idsPruebas = idsPruebas;
    }

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
