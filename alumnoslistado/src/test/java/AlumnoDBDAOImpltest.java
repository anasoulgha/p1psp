import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import alumnos.AlumnoDBDAO;
import alumnos.AlumnoDBDAOImpl;
import alumnos.psp.Alumno;

@ExtendWith(MockitoExtension.class)

public class AlumnoDBDAOImpltest {

    @InjectMocks
    AlumnoDBDAOImpl alumnoDB;
    @Mock
    private AlumnoDBDAO alumnoDBDAO;

    @Test
    public void guardarAlumnotest() throws Exception {

        Mockito.when(alumnoDBDAO.insertar(any(Alumno.class))).thenReturn(1);

        boolean resultado = alumnoDB.guardarAlumno("Anas", "Oulghazi", 20);

        assertTrue(resultado);
        verify(alumnoDBDAO, times(1)).insertar(any(Alumno.class));
    }

}
