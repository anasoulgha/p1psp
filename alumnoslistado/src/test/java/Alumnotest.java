

public class Alumnotest {
class AlumnoTest {

    @Test
    void testAlumnoConstructorYGetters() {
        Alumno alumno = new Alumno("Anas", "Oulghazi", 20);

        assertEquals("Anas", alumno.getNombre());
        assertEquals("Oulghszi", alumno.getApellido());
        assertEquals(20, alumno.getEdad());
    }
}
}