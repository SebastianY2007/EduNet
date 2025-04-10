package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private int idOficial;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion() {
    }

    public Institucion(int idOficial, String nombre) {
        this.idOficial = idOficial;
        this.nombre = nombre;
        this.sedes = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void addDireccion(String pais, String provincia, String ciudad, String callePrincipal, String calleSecundaria, String numeracion, TipoDireccion tipoDireccion) {
        this.direccion = new Direccion(pais, provincia, ciudad, callePrincipal, calleSecundaria, numeracion, tipoDireccion);
    }

    public int getIdOficial() {
        return idOficial;
    }

    public void setIdOficial(int idOficial) {
        this.idOficial = idOficial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSede() {
        return sedes;
    }

    public void addSede(String sede) {
        this.sedes.add(sede);
    }

    public void setSede(List<String> sede) {
        this.sedes = sede;
    }

    public void addAsignaciones(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "idOficial=" + idOficial +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}