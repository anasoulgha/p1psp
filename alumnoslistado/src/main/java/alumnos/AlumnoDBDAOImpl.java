package alumnos;

import alumnos.psp.Alumno;

public class AlumnoDBDAOImpl implements AlumnoDBDAO {

    private AlumnoDBDAO alumnoDBDAO;

    public AlumnoDBDAOImpl(AlumnoDBDAO alumnoDBDAO) {

        this.alumnoDBDAO = alumnoDBDAO;
    }

    public boolean guardarAlumno(String nombre, String apellido, int edad) {
        Alumno alumno = new Alumno(nombre, apellido, edad);
        int resultado = alumnoDBDAO.insertar(alumno);
        return resultado == 1;

    }

    @Override
    public int insertar(Alumno alumno) {

        int resultado = 1;
        return resultado;

    }

}
