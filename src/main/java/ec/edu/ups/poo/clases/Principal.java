package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;
import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {
    public static void main (String[] args) {
        Persona estudiante = new Estudiante("0107271777", "Sebastian", "Yupangui", "0995399230", "derlis567y@gmail.com", "Computación");
        estudiante.addDirecciones(new Direccion("Ecuador", "Azuay", "Paute", "Paute", "Zhumir", "15-26", TipoDireccion.CASA));

        Persona docente = new Docente("0102568957", "Zhantal", "Gomez", "0995782457", "zhantal04@gmail.com", List.of("Economista"), List.of("Algebra", "Contabilidad"));
        docente.addDirecciones(new Direccion("Ecuador", "Azuay", "Paute", "Paute", "El Cabo", "254", TipoDireccion.CASA));

        Persona administrativo = new Administrativo("0105448536", "Juan", "Sanchez", "0996912254", "juanSan@gmail.com", List.of("Administrador de Carreras"), List.of("Administrar cupos"));
        administrativo.addDirecciones(new Direccion("Ecuador", "Azuay", "Cuenca", "Av. 12 de Abril", "Agustín Cueva", "251", TipoDireccion.TRABAJO));

        Persona visitante = new Visitante("0104256984", "David", "Yupangui", "0997989315", "david1234y@gmail.com", "Matriculación", new GregorianCalendar(2025, Calendar.APRIL, 18), new GregorianCalendar(2025, Calendar.APRIL, 18));
        visitante.addDirecciones(new Direccion("Ecuador", "Azuay", "Cuenca", "Av. 24 de Mayo", "Hernán Malo", "7-77", TipoDireccion.CASA));

        // Institucion 1
        Institucion institucion1 = new Institucion(132, "Universidad Politecnica Salesiana");
        institucion1.addDireccion("Ecuador", "Azuay", "Cuenca", "Calle Vieja", "Elia Liut", "12-30", TipoDireccion.INSTITUCION);
        institucion1.addSede("Cuenca");
        GregorianCalendar fecha1 = new GregorianCalendar(2020, 4, 17);
        GregorianCalendar fecha2 = new GregorianCalendar(2025, 1, 16);
        institucion1.addAsignaciones(new Asignacion(estudiante, fecha1, Rol.ESTUDIANTE));
        institucion1.addAsignaciones(new Asignacion(docente, fecha2, Rol.DOCENTE));

        // Institucion 2
        Institucion institucion2 = new Institucion(205, "Universidad de Cuenca");
        institucion2.addDireccion("Ecuador", "Azuay", "Cuenca", "Av. 12 de Abril", "Agustín Cueva", "251", TipoDireccion.INSTITUCION);
        institucion2.addSede("Cuenca");
        GregorianCalendar fecha3 = new GregorianCalendar(2020, 4, 17);
        GregorianCalendar fecha4 = new GregorianCalendar(2025, 1, 16);
        institucion2.addAsignaciones(new Asignacion(administrativo, fecha3, Rol.ADMINISTRATIVO));
        institucion2.addAsignaciones(new Asignacion(visitante, fecha4, Rol.VISITANTE));


        System.out.println(institucion1+"\n");
        System.out.println(institucion2);
    }
}