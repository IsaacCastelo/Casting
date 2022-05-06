/*
 * Cliente.java
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

public class Cliente {
    private ObjectId id;
    private String nombre;
    private Direccion direccion;
    private String telefono;
    private tipoActividad actividad;
    private Persona personaContacto;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public tipoActividad getActividad() {
        return actividad;
    }

    public void setActividad(tipoActividad actividad) {
        this.actividad = actividad;
    }

    public Persona getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(Persona personaContacto) {
        this.personaContacto = personaContacto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.direccion);
        hash = 23 * hash + Objects.hashCode(this.telefono);
        hash = 23 * hash + Objects.hashCode(this.actividad);
        hash = 23 * hash + Objects.hashCode(this.personaContacto);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (this.actividad != other.actividad) {
            return false;
        }
        if (!Objects.equals(this.personaContacto, other.personaContacto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", actividad=" + actividad + ", personaContacto=" + personaContacto + '}';
    }
    
}

enum tipoActividad{
    MODA, CINE;
}
