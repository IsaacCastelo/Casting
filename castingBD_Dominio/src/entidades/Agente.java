/*
 * Agente.java
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

public class Agente extends Persona{
    private long numEmpleado;
    private String RFC;

    public Agente() {
    }

    public Agente(long numEmpleado, String RFC, ObjectId id, String nombre, String telefono, Direccion direccion, String curp) {
        super(id, nombre, telefono, direccion, curp);
        this.numEmpleado = numEmpleado;
        this.RFC = RFC;
    }

    public long getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(long numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (this.numEmpleado ^ (this.numEmpleado >>> 32));
        hash = 71 * hash + Objects.hashCode(this.RFC);
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
        final Agente other = (Agente) obj;
        if (this.numEmpleado != other.numEmpleado) {
            return false;
        }
        if (!Objects.equals(this.RFC, other.RFC)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agente{" + "numEmpleado=" + numEmpleado + ", RFC=" + RFC + '}';
    }
    
}
