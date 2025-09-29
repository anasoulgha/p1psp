package alumnos.psp;

import java.util.List;

import alumnos.AlumnoDBDAO;

public class AlumnoVista {
    public void mostrarAlumno(Alumno alumno) {
        System.out.println("Nombre: "+ alumno.getNombre());
        System.out.println("Apellido: "+ alumno.getApellido());
        System.out.println("Edad: "+ alumno.getEdad());
        


    }
     public void mostrarListaAlumnos(List<Alumno> alumnos) {
        System.out.println("Lista de Alumnos");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos");
        } else {
            for (Alumno i : alumnos) {
                mostrarAlumno(i);
            }
        }
    }

    /*public boolean guardarAlumno(String nombre, String apellido, int edad){
            AlumnoDBDAO alumno= new AlumnoDBDAOImpl(nombre, apellido, edad);
            int resultado =alumno.insertar(alumno);
            return resultado == 1;*/

}

