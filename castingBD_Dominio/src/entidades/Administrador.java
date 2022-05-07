/*
 * Administrador.java
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

public class Administrador extends Persona {
    private String usuario;
    private String contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Administrador() {
    }

    public Administrador(String usuario, String contraseña, ObjectId id, String nombre, String telefono, Direccion direccion, String curp) {
        super(id, nombre, telefono, direccion, curp);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Administrador(String usuario, String contraseña, ObjectId id, String nombre, String telefono, String curp) {
        super(id, nombre, telefono, curp);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.usuario);
        hash = 71 * hash + Objects.hashCode(this.contraseña);
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
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrador{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
