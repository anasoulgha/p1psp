package alumnos.psp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoVista {

  private static final int OPCION_INSERTAR = 1;
  private static final int OPCION_LISTAR = 2;
  private static final int OPCION_SALIR = 3;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    AlumnoControlador vista = new AlumnoControlador();
    List<Alumno> alumnos = new ArrayList<>();
    boolean salir = true;

    while (salir) {
             System.out.println(OPCION_INSERTAR + ". Insertar alumno");
        System.out.println(OPCION_LISTAR + ". Listar alumnos");
        System.out.println(OPCION_SALIR + ". Salir");
        System.out.print("Elige una opción: ");
      int menu = sc.nextInt();
      sc.nextLine();
      switch (menu) {
        case OPCION_INSERTAR:
          try {
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            Alumno alumno = new Alumno(nombre, apellido, edad);
            alumnos.add(alumno);
          } catch (Exception inserAlum) {
            System.out.println("Error al insertar alumno");
          }

          break;
        case OPCION_LISTAR:
          try {
            vista.mostrarListaAlumnos(alumnos);
          } catch (Exception verAlumn) {
            System.out.println("Error al listar el alumno");
          }

          break;
        case OPCION_SALIR:
          salir = false;
          break;

        default:
          break;
      }

    }

    sc.close();
  }

}
