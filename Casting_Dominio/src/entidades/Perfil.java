/*
 * Perfil.java
 */
package entidades;

import org.bson.types.ObjectId;

public class Perfil {
    private ObjectId id;
    private String estado;
    private String sexo;
    private float alturaMin;
    private float alturaMax;
    private int edadMin;
    private int edadMax;
    private String colorPelo;
    private String colorOjos;
    private Especialidad especialidad;
    private boolean experiencia;

    public Perfil() {
    }

    public Perfil(ObjectId id, String estado, String sexo, float alturaMin, float alturaMax, int edadMin, int edadMax, String colorPelo, String colorOjos, Especialidad especialidad, boolean experiencia) {
        this.id = id;
        this.estado = estado;
        this.sexo = sexo;
        this.alturaMin = alturaMin;
        this.alturaMax = alturaMax;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(float alturaMin) {
        this.alturaMin = alturaMin;
    }

    public float getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(float alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
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
    
enum Especialidad{
    MODELO, ACTOS;
}
