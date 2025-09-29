import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import alumnos.AlumnoDBDAO;
import alumnos.psp.Alumno;

@ExtendWith(MockitoExtension.class)

public class AlumnoDBDAOImpltest {

    @InjectMocks
    AlumnoDBDAOImpltest alumnoDB;

    @Mock
    private AlumnoDBDAO alumnoDBDAO;


    @Test
    public void guardarAlumnotest() throws Exception{
        Alumno alumno = new Alumno("Anas", "Oulghazi", 20);
        Mockito.when(alumnoDBDAO.insertar(any(Alumno.class))).thenReturn(1);

        int resultado = alumnoDBDAO.insertar(alumno);

        assertEquals(1, resultado);

    }

}
