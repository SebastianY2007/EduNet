package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public Docente() {
    }

    public Docente (String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreaEspecializacion() {
        return areasDeEspecializacion;
    }

    public void setAreaEspecializacion(List<String> areaEspecializacion) {
        this.areasDeEspecializacion = areaEspecializacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Titulos Academicos: " + titulosAcademicos +
                "\nAreas de Especializacion: " + areasDeEspecializacion + "\n";
    }
}