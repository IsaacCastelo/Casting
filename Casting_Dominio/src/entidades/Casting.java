/*
 * Casting.java
 */
package entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

public class Casting {
    private ObjectId id;
    private String nombre;
    private Direccion direccion;
    private Date fechaContratacion;
    private ObjectId idCliente;
    private float costo;
    private Agente agente;
    private List<ObjectId> idsPerfiles;
    private List<Perfil> perfiles;

    public Casting() {
    }

    public Casting(ObjectId id, String nombre, Direccion direccion, Date fechaContratacion, ObjectId idCliente, float costo, Agente agente, List<ObjectId> idsPerfiles, List<Perfil> perfiles) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaContratacion = fechaContratacion;
        this.idCliente = idCliente;
        this.costo = costo;
        this.agente = agente;
        this.idsPerfiles = idsPerfiles;
        this.perfiles = perfiles;
    }

    public Casting(String nombre, Direccion direccion, Date fechaContratacion, ObjectId idCliente, float costo, Agente agente, List<ObjectId> idsPerfiles, List<Perfil> perfiles) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaContratacion = fechaContratacion;
        this.idCliente = idCliente;
        this.costo = costo;
        this.agente = agente;
        this.idsPerfiles = idsPerfiles;
        this.perfiles = perfiles;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public ObjectId getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(ObjectId idCliente) {
        this.idCliente = idCliente;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public List<ObjectId> getIdsPerfiles() {
        return idsPerfiles;
    }

    public void setIdsPerfiles(List<ObjectId> idsPerfiles) {
        this.idsPerfiles = idsPerfiles;
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.direccion);
        hash = 83 * hash + Objects.hashCode(this.fechaContratacion);
        hash = 83 * hash + Objects.hashCode(this.idCliente);
        hash = 83 * hash + Float.floatToIntBits(this.costo);
        hash = 83 * hash + Objects.hashCode(this.agente);
        hash = 83 * hash + Objects.hashCode(this.idsPerfiles);
        hash = 83 * hash + Objects.hashCode(this.perfiles);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Casting other = (Casting) obj;
        if (Float.floatToIntBits(this.costo) != Float.floatToIntBits(other.costo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.fechaContratacion, other.fechaContratacion)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        if (!Objects.equals(this.agente, other.agente)) {
            return false;
        }
        if (!Objects.equals(this.idsPerfiles, other.idsPerfiles)) {
            return false;
        }
        if (!Objects.equals(this.perfiles, other.perfiles)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Casting{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", fechaContratacion=" + fechaContratacion + ", idCliente=" + idCliente + ", costo=" + costo + ", agente=" + agente + ", idsPerfiles=" + idsPerfiles + ", perfiles=" + perfiles + '}';
    }
    
}
