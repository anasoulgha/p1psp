
import alumnos.psp.Alumno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Alumnotest {

  @Test
  void testAlumnoConstructor() {
    Alumno alumno = new Alumno("Anas", "Oulghazi", 20);

    assertEquals("Anas", alumno.getNombre());
    assertEquals("Oulghazi", alumno.getApellido());
    assertEquals(20, alumno.getEdad());
  }

}
