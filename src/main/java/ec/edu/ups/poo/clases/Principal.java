package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;
import ec.edu.ups.poo.enums.TipoDireccion;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {
    public static void main (String[] args) {
        // Institucion 1
        Institucion institucion1 = new Institucion(132, "Universidad Politecnica Salesiana");
        institucion1.addDireccion("Ecuador", "Azuay", "Cuenca", "Calle Vieja", "Elia Liut", "12-30", TipoDireccion.INSTITUCION);
        institucion1.addSede("Cuenca");
        institucion1.addAsignaciones(new Asignacion(new GregorianCalendar(2024, Calendar.SEPTEMBER, 15), Rol.ESTUDIANTE));
        institucion1.addAsignaciones(new Asignacion(new GregorianCalendar(2020, Calendar.JANUARY, 26), Rol.DOCENTE));

        // Institucion 2
        Institucion institucion2 = new Institucion(205, "Universidad de Cuenca");
        institucion2.addDireccion("Ecuador", "Azuay", "Cuenca", "Av. 12 de Abril", "Agustín Cueva", "251", TipoDireccion.INSTITUCION);
        institucion2.addSede("Cuenca");
        institucion2.addAsignaciones(new Asignacion(new GregorianCalendar(2022, Calendar.OCTOBER, 10), Rol.ADMINISTRATIVO));
        institucion2.addAsignaciones(new Asignacion(new GregorianCalendar(2024, Calendar.APRIL, 18), Rol.VISITANTE));


        Estudiante estudiante = new Estudiante("0107271777", "Sebastian", "Yupangui", "0995399230", "derlis567y@gmail.com", "Computación");
        estudiante.addDirecciones(new Direccion("Paute", "Zhumir", "15-26", "Paute", "Azuay", "Ecuador", TipoDireccion.CASA));

        Docente docente = new Docente("0102568957", "Zhantal", "Gomez", "0995782457", "zhantal04@gmail.com", List.of("Economista"), List.of("Algebra", "Contabilidad"));
        docente.addDirecciones(new Direccion("Paute", "El Cabo", "85-56", "Paute", "Azuay", "Ecuador", TipoDireccion.CASA));

        Administrativo administrativo = new Administrativo("0105448536", "Juan", "Sanchez", "0996912254", "juanSan@gmail.com", List.of("Administrador de Carreras"), List.of("Administrar cupos"));
        administrativo.addDirecciones(new Direccion("Av. 12 de Abril", "Agustín Cueva", "251", "Cuenca", "Azuay", "Ecuador", TipoDireccion.TRABAJO));

        Visitante visitante = new Visitante("0104256984", "David", "Yupangui", "0997989315", "david1234y@gmail.com", "Matriculación", new GregorianCalendar(2025, Calendar.APRIL, 18), new GregorianCalendar(2025, Calendar.APRIL, 18));
        visitante.addDirecciones(new Direccion("Av. 24 de Mayo", "Hernán Malo", "7-77", "Cuenca", "Azuay", "Ecuador", TipoDireccion.CASA));

        System.out.println(institucion1+"\n");
        System.out.println(institucion2);
    }
}