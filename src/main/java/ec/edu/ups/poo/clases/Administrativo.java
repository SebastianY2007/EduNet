package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona {
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo (String cedula, String nombre, String apellido, String telefono, String correoElectronico, List<String> cargos, List<String> responsabilidades) {
        super(cedula, nombre, apellido, telefono, correoElectronico);
        this.cargos = cargos;
        this.responsabilidades = responsabilidades;
    }

    public List<String> getCargos(){
        return cargos;
    }

    public void setCargos(List<String> cargo){
        this.cargos = cargo;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades){
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades +
                '}';
    }
}